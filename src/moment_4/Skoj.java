package moment_4;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.*;
//
public class Skoj extends JFrame {

	private Characters chr;
	private JFrame frame = new JFrame();
	private ColorDisplay displayColor;
	private JPanel display;
	private JButton shiftLeft = new JButton("Shift Left");
	private JButton shiftRight = new JButton("Shift Right");
	private Array7x7 array;



	public Skoj(Characters chr, Array7x7 array, int background, int grid) {
		this.array = array;
		this.chr = chr;
		array.setArray(chr.getChar('H'));

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(600, 600);

		setLayout(new BorderLayout());

		displayColor = new ColorDisplay( background, grid);
		
		displayColor.setPreferredSize(new Dimension(400, 400));
		displayColor.setDisplay(array.toIntArray());
		displayColor.toColors(array);
		displayColor.updateDisplay();
		displayColor.setVisible(true);
		
		display = new JPanel();
		display.setPreferredSize(new Dimension(100, 520));
		display.setSize(100,120);
		display.add(displayColor, BorderLayout.CENTER);
		display.setVisible(true);

		frame.add(display, BorderLayout.CENTER);

		JPanel btnGrid = new JPanel(new GridLayout(2, 1));
		btnGrid.add(buttonPanel());
		frame.add(btnGrid, BorderLayout.SOUTH);



	}

	private JPanel buttonPanel() {
		JPanel panel = new JPanel(new GridLayout(1,3));
		panel.add(shiftLeft);
		panel.add(shiftRight);
		return panel;
	}



	public static void main(String[] args) {

		Characters x = new Characters();
		Array7x7 h = new Array7x7();
		h.setArray(x.getChar('X'));
		Skoj d = new Skoj(x , h, Color.RED,Color.BLUE);
		
	
		
		
		

	}	
}

