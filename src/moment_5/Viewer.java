package moment_5;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javafiles.Color;
import javax.swing.*;
import javafiles.ColorDisplay;
import moment_1.Array7x7;

public class Viewer extends JFrame {

	private int cols = 50;
	private int rows = 5;
	
	private ColorDisplay display;
	
	private JButton btnLeft = new JButton("Scroll left");
	private JButton btnRght = new JButton("Scroll right");
	private JButton btnText = new JButton("Enter text");
	private JButton btnStop = new JButton("Stop Scrolling");
	
	
	private Controller controller;
	
	public Viewer(int cols, int rows, Controller controller) {
		this.cols = cols;
		this.rows = rows;
		display = new ColorDisplay(rows, cols, Color.BLACK, Color.WHITE, 0, 3);
		init();
		
		this.controller = controller;
	}

	private void init() {

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		addListeners();
		setLayout(new BorderLayout());
		add(display, BorderLayout.CENTER);

		//Southpanel
		JPanel southPane = new JPanel();
		southPane.setLayout(new GridLayout(2,3));
		southPane.add(btnLeft);
		southPane.add(btnText);
		southPane.add(btnRght);
		southPane.add(new JPanel());
		southPane.add(btnStop);
		southPane.add(new JPanel());
		
		add(southPane,BorderLayout.SOUTH);
		
		setPreferredSize(new Dimension(1000,1000));
		setSize(new Dimension(1000,1000));
	}
	
	private void addListeners() {
		ButtonListener bListener = new ButtonListener();
		btnLeft.addActionListener(bListener);
		btnText.addActionListener(bListener);
		btnRght.addActionListener(bListener);
	}
	
	public void test7x7(Array7x7 arr) {
		int[][] intarr = arr.toIntArray();
		
		for (int row = 0; row < intarr.length; row++) {
			for (int col = 0; col < intarr[0].length; col++) {
				System.out.print(intarr[col][row]);
			}
			System.out.println();
		}
	}
	
	public void setDisplay(Array7x7[][] colorMatrix) {
		display.clearDisplay();
		 
		for (int col = 0; col < colorMatrix[0].length; col++) {
			for (int row = 0; row < colorMatrix.length; row++) {
				display.setDisplay(colorMatrix[row][col].toIntArray(), row, col);
			}
		}
		
		display.updateDisplay();
	}
	class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == btnText) {
				String str = JOptionPane.showInputDialog("Ange en str�ng");
				controller.enterString(str);
			}
			
			if(e.getSource() == btnLeft) {
				controller.shiftLeft();
			}
			
			if(e.getSource() == btnRght) {
				controller.shiftRight();
			}
			
			if(e.getSource() == btnStop) {
				controller.shiftStop();
			}
		}
		
	}
	
}
