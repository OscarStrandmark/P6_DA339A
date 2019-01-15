package moment_5_remake;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import javafiles.Color;
import javafiles.ColorDisplay;
import moment_1.Array7x7;

public class Viewer extends JFrame{

	private int cols;
	
	private ColorDisplay display;
	
	private JButton btnLeft = new JButton("Shift Left");
	private JButton btnRght = new JButton("Shift Right");
	private JButton btnText = new JButton("Enter Text");
	private JButton btnStop = new JButton("Stop Shift");
	
	private Controller controller;
	
	private int backgroundColor = Color.WHITE;
	private int gridColor       = Color.WHITE;
	private int pixelColor      = Color.BLACK;
	
	private int gridStroke = 0;
	private int sideSize   = 5;
	
	public Viewer(int cols) {
		
		setVisible(true);
		setSize(1000, 1000);
		setLayout(new BorderLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.cols = cols;
		
		display = new ColorDisplay(1, cols, backgroundColor, gridColor, gridStroke, sideSize);
		add(display,BorderLayout.CENTER);
		
		JPanel southPanel = new JPanel(new GridLayout(2,3));
		
		southPanel.add(btnLeft);
		southPanel.add(btnText);
		southPanel.add(btnRght);
		southPanel.add(new JPanel());
		southPanel.add(btnStop);
		southPanel.add(new JPanel());
		
		add(southPanel, BorderLayout.SOUTH);
		
		addListeners();
	}

	public void updateScreen() {
		Array7x7[] model = controller.getModel();

		Array7x7[] colorArray = toColor(model);
		
		display.clearDisplay();

		for (int i = 0; i < colorArray.length; i++) {
			display.setDisplay(colorArray[i].toIntArray(), 0, i);
		}
		
		display.updateDisplay();
	}
	
	private Array7x7[] toColor(Array7x7[] model) {	

		Array7x7[] colorArray = new Array7x7[model.length];
		controller.zeroArray7x7(colorArray);
		
		for (int i = 0; i < colorArray.length; i++) {
			for (int row = 0; row < 7; row++) {
				for (int col = 0; col < 7; col++) {
					if(model[i].getElement(row, col) == 1) {
						colorArray[i].setElement(row, col, pixelColor);
					} else {
						colorArray[i].setElement(row, col, backgroundColor);
					}
				}
			}
		}
		return colorArray;
	}
	public void setController(Controller controller) {
		this.controller = controller;
	}
	
	private void addListeners(){
		ButtonListener listener = new ButtonListener();
		btnLeft.addActionListener(listener);
		btnRght.addActionListener(listener);
		btnText.addActionListener(listener);
		btnStop.addActionListener(listener);
	}
	private class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			if(e.getSource() == btnLeft) {
				controller.startLeftShift();
			}
			
			if(e.getSource() == btnRght) {
				controller.startRightShift();
			}
			
			if(e.getSource() == btnStop) {
				controller.stopTimer();
			}
			
			if(e.getSource() == btnText) {
				String text = JOptionPane.showInputDialog(null, "Ange text","Ange text", JOptionPane.PLAIN_MESSAGE);
				if(text.length() == 0) {
					JOptionPane.showMessageDialog(null, "Text måste vara längre än 0", "ERROR", JOptionPane.ERROR_MESSAGE);
				} else if(text.length() > cols) {
					JOptionPane.showMessageDialog(null, "Textlängd måste vara < cols\nÄndra variablen i main-klassen", "ERROR", JOptionPane.ERROR_MESSAGE);
				} else {
					controller.newText(text);
				}
			}
		}		
	}
}
