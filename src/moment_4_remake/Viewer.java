package moment_4_remake;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import javafiles.Color;

import javafiles.ColorDisplay;
import moment_1.Array7x7;

public class Viewer extends JFrame {

	private JButton btnLeft = new JButton("Shift left");
	private JButton btnRght = new JButton("Shift right");

	private ColorDisplay display = new ColorDisplay(Color.WHITE, Color.BLACK);
	
	private Controller controller;
	
	public Viewer(Controller controller) {
		
		this.controller = controller;
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(new Dimension(500,500));
		setLayout(new BorderLayout());
		
		JPanel southPanel = new JPanel();
		southPanel.setLayout(new GridLayout(1,2));
		southPanel.add(btnLeft);
		southPanel.add(btnRght);
		add(southPanel,BorderLayout.SOUTH);
		add(display,BorderLayout.CENTER);
		
		addListeners();
	}
	
	public void updateDisplay() {
		display.clearDisplay();
		
		display.setDisplay(toColor());

		display.updateDisplay();
	}
	
	private int[][] toColor(){
		
		Array7x7 window = controller.getArray();
		
		int[][] colorArray = new int[7][7];
		
		for (int row = 0; row < colorArray.length; row++) {
			for (int col = 0; col < colorArray.length; col++) {
				if (window.getElement(row, col) == 1) {
					colorArray[row][col] = Color.BLACK;
				} else {
					colorArray[row][col] = Color.WHITE;
				}
			}
		}
		return colorArray;
	}
	
	private void addListeners() {
		ButtonListener buttonListener = new ButtonListener();
		btnLeft.addActionListener(buttonListener);
		btnRght.addActionListener(buttonListener);
	}

	class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == btnRght) {
				controller.shiftRight();
				updateDisplay();
			}

			if (e.getSource() == btnLeft) {
				controller.shiftLeft();
				updateDisplay();
			}
		}
	}
}
