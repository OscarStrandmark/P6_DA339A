package p6;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.Random;

import javax.swing.JComponent;
import javax.swing.JOptionPane;
/**
 * Created by tsroax on 2014-11-27.
 */
public class IntDisplay extends JComponent {
	public enum Mode {SHOW_INT, SHOW_BYTES};
    private final int PAGE_SIZE = 7;
    private int[][] systemValues;
    private int[][] userValues;
    private Mode mode = Mode.SHOW_INT;
    private int textColor = Color.BLACK;
    private java.awt.Color displayTextColor = toColor(textColor);
    private int background;
    private java.awt.Color displayBackground = toColor(background);
    private int grid;
    private java.awt.Color displayGrid = toColor(grid);
    private int gridStroke = 2;
    private Font font;
	private BufferedImage displayBuffer;  
	private Graphics2D dBufferG;
	private int width;
	private int height;

    public IntDisplay(int background, int grid) {
        this(background,grid,Mode.SHOW_INT,Color.BLACK);
    }

	public IntDisplay(int background, int grid, Mode mode, int textColor) {
        init(background,grid,mode,textColor);
    }

    private void init(int background, int grid, Mode mode, int textColor) {
    	this.background = background;
    	this.displayBackground = toColor(background);
    	this.grid = grid;
    	this.displayGrid = toColor(grid);
    	this.mode = mode;
    	this.textColor = textColor;
    	this.displayTextColor = toColor(textColor);
        font = new Font("Monospaced",Font.PLAIN,12);
        BufferedImage bi = new BufferedImage(10,10,BufferedImage.TYPE_INT_ARGB);
        Graphics g = bi.createGraphics();
        g.setFont(font);
        FontMetrics fm = g.getFontMetrics();
        int gridWidth = fm.stringWidth("123,123")+4;
        int gridHeight = fm.getHeight()*2+6;
        g.dispose();
        gridStroke = Math.max(gridStroke, 0);
        setPreferredSize(new Dimension(PAGE_SIZE * (gridWidth + gridStroke) + gridStroke,PAGE_SIZE * (gridHeight + gridStroke) + gridStroke));
        systemValues = new int[PAGE_SIZE][PAGE_SIZE];
        userValues = new int[PAGE_SIZE][PAGE_SIZE];

            for(int row = 0; row < systemValues.length; row++) {
                for(int col = 0; col < systemValues[row].length; col++) {
                    userValues[row][col] = 0;
                    systemValues[row][col] = 0;
                }
            }
    }
	
	private java.awt.Color toColor(int color) {
		return new java.awt.Color(Color.red(color),Color.green(color),Color.blue(color),Color.alpha(color));
	}

    public void setTextColor(int textColor) {
        this.textColor = textColor;
        displayTextColor = toColor(textColor);
        super.repaint();
    }

    public void setBackground(int background) {
        this.background = background;
        displayBackground = toColor(background);
        super.repaint();
    }

    public void setGrid(int grid) {
        this.grid = grid;
        displayGrid = toColor(grid);
        super.repaint();
    }

    public void setMode(Mode mode) {
    	this.mode = mode;
    	super.repaint();
    }

    public int getBackgroundColor() {
        return background;
    }

    public int getGridColor() {
        return grid;
    }

    public void clearDisplay() {
        if(userValues !=null && systemValues !=null) {
            for(int row = 0; row < systemValues.length; row++) {
                for(int col = 0; col < systemValues[row].length; col++) {
                    userValues[row][col] = 0;
                }
            }
            updateDisplay();
        }
    }

    public void repaint() {
        updateDisplay();
    }

    public void updateDisplay() {
        if(userValues !=null && systemValues !=null) {
            for(int row = 0; row < systemValues.length; row++) {
                for(int col = 0; col < systemValues[row].length; col++) {
                    systemValues[row][col] = userValues[row][col];
                }
            }
            super.repaint();
        }
    }

    public void setDisplay(int[][] values) {
        if(values.length== PAGE_SIZE && values[0].length== PAGE_SIZE) {
            for(int row = 0; row < values.length; row++) {
                for(int col = 0; col < values[row].length; col++) {
                    userValues[row][col] = values[row][col];
                }
            }
        }
    }
    

    @Override
    protected void paintComponent(Graphics g) {
    	super.paintComponent(g);
		if(width!=this.getWidth() || height!=this.getHeight()) {
			width = this.getWidth();
			height = this.getHeight();
			displayBuffer = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
			dBufferG = displayBuffer.createGraphics();
		}
        String str,part1="", part2="";
        int alpha, red, green, blue;
        int width = (getWidth()- gridStroke)/(PAGE_SIZE)- gridStroke;
        int height = (getHeight()- gridStroke)/(PAGE_SIZE)- gridStroke;
        int textX, textY;
        int offsetX = (getWidth()- systemValues[0].length*(gridStroke+width)-gridStroke)/2; 
        int offsetY = (getHeight()- systemValues.length*(gridStroke+height)-gridStroke)/2; 
        dBufferG.setFont(font);
        dBufferG.setColor(displayGrid);
        dBufferG.fillRect(0,0,getWidth(),getHeight());
        for(int row = 0; row < systemValues.length; row++) {
            for(int col = 0; col < systemValues[row].length; col++) {
            	dBufferG.setColor(displayBackground);
            	dBufferG.fillRect(offsetX + gridStroke + col * (width + gridStroke), offsetY + gridStroke + row * (height + gridStroke), width, height);
                textX = offsetX + gridStroke + 4 + col*(width+gridStroke);
                textY = offsetY + gridStroke + height/2 - 4 + row*(height+gridStroke);
                dBufferG.setColor(displayTextColor);
                if(mode==Mode.SHOW_BYTES) {
                    alpha = Color.alpha(systemValues[row][col]);
                    red = Color.red(systemValues[row][col]);
                    green = Color.green(systemValues[row][col]);
                    blue = Color.blue(systemValues[row][col]);
                    part1=String.format("%3d,%3d",alpha,red);
                    part2=String.format("%3d,%3d",green,blue);
                } else if(mode==Mode.SHOW_INT) {
                    part1 = String.valueOf(systemValues[row][col]);
                    if(part1.length()>5) {
                    	part2 = " "+part1.substring(5,part1.length());
                    	part1 = " "+part1.substring(0,5);
                    } else {
                    	part2 = "";
                    }
                }
                dBufferG.drawString(part1, textX, textY);
                dBufferG.drawString(part2, textX, textY + height / 2);
                g.drawImage(displayBuffer, 0, 0, getWidth(), getHeight(),null);
            }
        }
    }

    public static void pause(long ms) {
        try {
            Thread.sleep(ms);
        }catch(InterruptedException e) {}
    }
}
