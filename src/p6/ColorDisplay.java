package p6;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.JComponent;
import javax.swing.JOptionPane;

public class ColorDisplay extends JComponent {
    private final int PAGE_SIZE = 7;
	private java.awt.Color[][] systemPaint;
	private int[][] userPaint;
    private int background;
    private java.awt.Color displayBackground;
    private int grid;
    private java.awt.Color displayGrid;
    private int gridStroke = 2;
    private int sideSize = 40;
    private int horizontalPages = 1;
    private int verticalPages = 1;
	private BufferedImage displayBuffer;  
	private Graphics2D dBufferG;
	private int width;
	private int height;

	public ColorDisplay(int background, int grid) {
		this(1, 1, background, grid);
	}
	
	public ColorDisplay(int verticalPages, int horizontalpages, int background, int grid) {
		this(verticalPages, horizontalpages, background, grid, 2, 40);
	}
	
	public ColorDisplay(int verticalPages, int horizontalpages, int background, int grid, int gridStroke, int sideSize) {
		this.verticalPages = verticalPages;
		this.horizontalPages = horizontalpages;
		this.background = background;
		this.grid = grid;
		this.gridStroke = gridStroke;
		this.sideSize = sideSize;
		this.displayBackground = toColor(background);
		this.displayGrid = toColor(grid);
		
		if(sideSize>0) {
			setPreferredSize(new Dimension(horizontalpages*PAGE_SIZE * (sideSize+ gridStroke) + gridStroke,
					                       verticalPages*PAGE_SIZE * (sideSize+ gridStroke) + gridStroke));
		}
        systemPaint = new java.awt.Color[verticalPages* PAGE_SIZE][horizontalpages* PAGE_SIZE];
        userPaint = new int[verticalPages* PAGE_SIZE][horizontalpages* PAGE_SIZE];
        for(int row = 0; row < systemPaint.length; row++) {
            for(int col = 0; col < systemPaint[row].length; col++) {
                systemPaint[row][col] = this.displayBackground;
                userPaint[row][col] = background;
            }
        }
	}
	
	private java.awt.Color toColor(int color) {
		return new java.awt.Color(Color.red(color),Color.green(color),Color.blue(color),Color.alpha(color));
	}
	
    public void setBackgroundColor(int background) {
        this.background = background;
        this.displayBackground = toColor(background);
        super.repaint();
    }

    public void setGridColor(int grid) {
        this.grid = grid;
        this.displayGrid = toColor(grid);
        super.repaint();
    }

    public void setGridStroke(int gridStroke) {
        this.gridStroke = gridStroke;
        super.repaint();
    }

    public void setSideSize(int sideSize) {
        this.sideSize = sideSize;
        super.repaint();
    }

    public int getBackgroundColor() {
        return background;
    }

    public int getGridColor() {
        return grid;
    }

    public int getGridStroke() {
        return gridStroke;
    }

    public int getSideSize() {
        return sideSize;
    }

    public int getHorizontalPages() {
        return horizontalPages;
    }

    public int getVerticalPages() {
        return verticalPages;
    }

    public void clearDisplay() {
        if(userPaint!=null && systemPaint!=null) {
            for(int row = 0; row < systemPaint.length; row++) {
                for(int col = 0; col < systemPaint[row].length; col++) {
                    userPaint[row][col] = background;
                }
            }
            updateDisplay();
        }
    }
	
	public void repaint() {
		updateDisplay();
	}
	
	public void updateDisplay() {
		if(userPaint!=null && systemPaint!=null) {
			for(int row = 0; row<systemPaint.length; row++)
				for(int col=0; col<systemPaint[row].length; col++) {
					systemPaint[row][col] = toColor(userPaint[row][col]);
				}
		}
		super.repaint();
	}


    public void setDisplay(int[][] colors) {
        setDisplay(colors,0,0);
    }

    public void setDisplay(int[][] colors, int verticalPage, int horizontalPage) {
        if(colors.length==PAGE_SIZE && colors[0].length== PAGE_SIZE &&
                verticalPage>=0 && verticalPage<verticalPages &&
                horizontalPage>=0 && horizontalPage<horizontalPages) {
            int rowOffset = verticalPage* PAGE_SIZE;
            int colOffset = horizontalPage* PAGE_SIZE;
            for(int row = 0; row < colors.length; row++) {
                for(int col = 0; col < colors[row].length; col++) {
                    userPaint[rowOffset + row][colOffset + col] = colors[row][col];
                }
            }
        }
    }
	
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		if(width!=this.getWidth() || height!=this.getHeight()) {
			width = this.getWidth();
			height = this.getHeight();
			displayBuffer = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
			dBufferG = displayBuffer.createGraphics();
		}
        int side = Math.min((getWidth()- gridStroke)/(horizontalPages* PAGE_SIZE)- gridStroke, (getHeight()- gridStroke)/(verticalPages*PAGE_SIZE)- gridStroke);
        int offsetX = (getWidth()-systemPaint[0].length*(gridStroke+side)-gridStroke)/2; // beräknas för centrering
        int offsetY = (getHeight()-systemPaint.length*(gridStroke+side)-gridStroke)/2; // beräknas för centrering
		dBufferG.setColor(displayGrid);
		dBufferG.fillRect(0, 0, getWidth(), getHeight());
		for (int row = 0; row < systemPaint.length; row++) {
			for (int col = 0; col < systemPaint[row].length; col++) {
				dBufferG.setColor(displayBackground);
				dBufferG.fillRect(offsetX + gridStroke + col * (side + gridStroke), offsetY + gridStroke + row * (side + gridStroke), side, side);
				dBufferG.setColor(systemPaint[row][col]);
				dBufferG.fillRect(offsetX + gridStroke + col * (side + gridStroke), offsetY + gridStroke + row * (side + gridStroke), side, side);
			}
		}
		g.drawImage(displayBuffer, 0, 0, null);
	}
	
	public void pause(long ms) {
		try {
			Thread.sleep(ms);
		}catch(InterruptedException e) {}
	}
	
	public static void main(String[] args) {
//		int[][] arr = {{Color.RED,Color.RED,Color.RED,Color.RED,Color.RED,Color.RED,Color.RED},
//				{Color.RED,Color.RED,Color.RED,Color.RED,Color.RED,Color.RED,Color.RED},
//				{Color.RED,Color.RED,Color.RED,Color.RED,Color.RED,Color.RED,Color.RED},
//				{Color.RED,Color.RED,Color.RED,Color.RED,Color.RED,Color.RED,Color.RED},
//				{Color.RED,Color.RED,Color.RED,Color.RED,Color.RED,Color.RED,Color.RED},
//				{Color.RED,Color.RED,Color.RED,Color.RED,Color.RED,Color.RED,Color.RED},
//				{Color.RED,Color.RED,Color.RED,Color.RED,Color.RED,Color.RED,Color.RED}};
//		ColorDisplay d = new ColorDisplay(4,2,Color.WHITE,Color.BLACK,1,10);
//		d.setDisplay(arr,2,1); // arr har röd-värde i samtliga element
//		d.updateDisplay();
//
//		JOptionPane.showMessageDialog(null,d);
		JOptionPane.showMessageDialog(null, new ColorDisplay(Color.RED,Color.WHITE));
	}
}
