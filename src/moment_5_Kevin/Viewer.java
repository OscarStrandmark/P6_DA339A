package moment_5_Kevin;

import java.awt.BorderLayout;
import java.awt.Dimension;
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

public class Viewer extends JFrame {

	private JButton btnLeft = new JButton("Shift left");
	private JButton btnRght = new JButton("Shift Right");
	private JButton btnText = new JButton("Enter Text");

	private ColorDisplay display;

	private Controller controller;

	private int rows;
	private int cols;
	private int backgroundColor = Color.WHITE;
	private int gridColor       = Color.WHITE;
	private int squareColor     = Color.BLACK;
	private int gridStroke 		= 1;  //Storlek på linjer mellan pixlar
	private int sideSize 		= 100; //Storlek på pixlar.
	int counter = 0;

	public Viewer(int row, int col) {

		rows = row;
		cols = col;

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new BorderLayout());

		display = new ColorDisplay(rows, cols, backgroundColor, gridColor);
		add(display, BorderLayout.CENTER);

		JPanel southPanel = new JPanel(new GridLayout(1, 3));
		southPanel.add(btnLeft);
		southPanel.add(btnText);
		southPanel.add(btnRght);
		add(southPanel, BorderLayout.SOUTH);

		addListeners();

		setSize(new Dimension(1000, 1000));
	}

	public void updateColorDisplay(Array7x7[] a7x) {
		display.clearDisplay();

		for(int i = 0; i <a7x.length;i++) {
			display.setDisplay(makeColorArr(a7x[i]),0,i);
		}
		display.updateDisplay();
	}

	public void setController(Controller cont) {
		controller = cont;
	}

	private int[][] makeColorArr(Array7x7 input){
		
		int[][] output = new int[7][7];
		
		for (int row = 0; row < 7; row++) {
			for (int col = 0; col < 7; col++) {
				if (input.getElement(row, col) == 1) {
					output[row][col] = squareColor;
				} else {
					output[row][col] = backgroundColor;
				}
			}
		}
		return output;
	}
	
	private void addListeners() {
		ButtonListener listener = new ButtonListener();
		btnLeft.addActionListener(listener);
		btnRght.addActionListener(listener);
		btnText.addActionListener(listener);
	}

	private class ButtonListener implements ActionListener {

		
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == btnLeft) {
				if(counter>0) {
					controller.stopTimer();
				}
				controller.shiftLeftTimer();
				counter++;
			}

			if (e.getSource() == btnRght) {
				if(counter>0) {
					controller.stopTimer();
				}
				controller.shiftRightTimer();
				counter++;

			}

			if (e.getSource() == btnText) {
				String input = JOptionPane.showInputDialog(null, "Ange text som ska visas.", "Input",
						JOptionPane.QUESTION_MESSAGE);
				if (input.length() == 0) {
					JOptionPane.showMessageDialog(null, "Text måste vara längre än 0.", "ERROR",
							JOptionPane.ERROR_MESSAGE);
				} else {
					controller.setStringToScreen(input);
					controller.Test();
			
				}
			}
		}
	}
}
