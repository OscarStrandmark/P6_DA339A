package moment_3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Test2UI extends JFrame {

	private Controller controller;
	
	private JLabel[][] labelMatrix = new JLabel[7][7];
	private JTextField[] textFieldColumnLft = new JTextField[7];
	private JTextField[] textFieldColumnRght = new JTextField[7];	
	private JButton shiftRght = new JButton("Shift Right");
	private JButton shiftLft = new JButton("Shift Left");
	//private Array7x7 matrix;
	
	private JPanel centerPanel = new JPanel();
	private JPanel westPanel = new JPanel();
	private JPanel eastPanel = new JPanel();
	private JPanel southPanel = new JPanel();
	
	
	public Test2UI(Controller controller) {
		this.controller = controller;
		controller.setUI(this);
		
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		
		add(centerPanel, BorderLayout.CENTER);
		add(westPanel, BorderLayout.WEST);
		add(southPanel, BorderLayout.SOUTH);
		add(eastPanel, BorderLayout.EAST);
		
		centerPanel.setLayout(new GridLayout(7,7));
		eastPanel.setLayout(new GridLayout(7,1));
		westPanel.setLayout(new GridLayout(7,1));
		southPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		initInterface();
		
		shiftRght.addActionListener(new Test2UIListener());
		shiftLft.addActionListener(new Test2UIListener());
		

	}
	
	public Test2UI(Controller controller, int[][] array) {
		this(controller);
		
		controller.updateCurrentArray(array);
	}
	
	private void initInterface() {
		for (int i = 0; i < labelMatrix.length; i++) {
			for ( int j = 0; j < labelMatrix[i].length; j++) {
				labelMatrix[i][j] = new JLabel("0",SwingConstants.CENTER);  
				labelMatrix[i][j].setBorder(BorderFactory.createLineBorder(Color.BLACK));
				labelMatrix[i][j].setFont(new Font("TimesRoman", Font.PLAIN, 18));
				centerPanel.add(labelMatrix[i][j]);
			}
		}
		for(int i = 0; i < textFieldColumnLft.length; i++) {
			textFieldColumnLft[i] = new JTextField("0");
			textFieldColumnRght[i] = new JTextField("0");
			
			textFieldColumnLft[i].setPreferredSize(new Dimension(50,0));
			textFieldColumnRght[i].setPreferredSize(new Dimension(50,0));

			textFieldColumnLft[i].setAlignmentX(CENTER_ALIGNMENT);
			
			eastPanel.add(textFieldColumnRght[i]);
			westPanel.add(textFieldColumnLft[i]);

		}
		southPanel.add(shiftLft);
		southPanel.add(shiftRght);
		
	}
	
	public void updateInterface(int[][] array) {
		for(int i = 0; i < labelMatrix.length; i++) {
			for(int j = 0; j < labelMatrix[i].length; j++) {
				labelMatrix[i][j].setText(Integer.toString(array[i][j]));
			}
		}
	}
	
	private class Test2UIListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == shiftRght) {
				controller.shiftRght();
			}
			else if(e.getSource() == shiftLft) {
				controller.shiftLft();
			}
			
		}
		
	}
}
