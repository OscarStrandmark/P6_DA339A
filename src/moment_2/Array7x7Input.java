package moment_2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Array7x7Input extends JFrame {

	private JTextField[] southArray = new JTextField[7];
	private JTextField[] eastArray = new JTextField[7];

	private JButton btn_ReadRow = new JButton("Read row");
	private JButton btn_WriteRow = new JButton("Write row");
	
	private JButton btn_ReadCol = new JButton("Read column");
	private JButton btn_WriteCol = new JButton("Write column");
	
	private JTextField JTFNorth = new JTextField();
	private JTextField JTFSouth = new JTextField();
	
	public Array7x7Input() {
		setLayout(new BorderLayout());
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel centerPane = new JPanel(new GridLayout(2, 1)); //Centerpanelen
		
		JPanel centerNorthPane = new JPanel(new GridLayout(3, 1)); //Norra centerpanelen
		JPanel CNNPane = new JPanel(new GridLayout(1, 2));//Norra norra centerpanelen
		
		centerNorthPane.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		JLabel colNbr = new JLabel("Column nbr:");
		colNbr.setHorizontalAlignment(SwingConstants.CENTER);
		
		CNNPane.add(colNbr);
		CNNPane.add(JTFNorth);
		
		centerNorthPane.add(CNNPane);
		centerNorthPane.add(btn_ReadCol);
		centerNorthPane.add(btn_WriteCol);

		JPanel centerSouthPane = new JPanel(new GridLayout(3, 1));
		JPanel CSNPane = new JPanel(new GridLayout(1, 2));
		
		centerSouthPane.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		JLabel rowNbr = new JLabel("Row nbr:");
		rowNbr.setHorizontalAlignment(SwingConstants.CENTER);
		
		CSNPane.add(rowNbr);
		CSNPane.add(JTFSouth);

		centerSouthPane.add(CSNPane);
		centerSouthPane.add(btn_ReadRow);
		centerSouthPane.add(btn_WriteRow);

		centerPane.add(centerNorthPane);
		centerPane.add(centerSouthPane);

		centerPane.setPreferredSize(new Dimension(250, 250));;
		
		add(centerPane, BorderLayout.CENTER);
		JPanel eastPane = new JPanel(new GridLayout(7, 1));

		for (int i = 0; i < eastArray.length; i++) {
			eastArray[i] = new JTextField();
			eastArray[i].setHorizontalAlignment(JTextField.CENTER);
			eastArray[i].setFont(new Font(null, Font.BOLD, 24));
			eastPane.add(eastArray[i]);
		}

		eastPane.setPreferredSize(new Dimension(80, 250));
		
		eastPane.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 20));
		
		add(eastPane, BorderLayout.EAST);
		JPanel southPane = new JPanel(new BorderLayout());

		JPanel JTFSPanel = new JPanel(new GridLayout(1, 7));

		for (int i = 0; i < southArray.length; i++) {
			southArray[i] = new JTextField();
			southArray[i].setHorizontalAlignment(JTextField.CENTER);
			southArray[i].setFont(new Font(null, Font.BOLD, 24));
			JTFSPanel.add(southArray[i]);
		}
		
		JTFSPanel.setPreferredSize(new Dimension(250, 0));

		JPanel paddingSouth = new JPanel();
		paddingSouth.setPreferredSize(new Dimension(30, 40));

		southPane.add(JTFSPanel, BorderLayout.CENTER);
		southPane.add(paddingSouth, BorderLayout.EAST);
		
		southPane.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 40));
		
		add(southPane, BorderLayout.SOUTH);
		
		addListeners();
	}

	private void addListeners() {
		ButtonListener listener = new ButtonListener();
		btn_ReadCol.addActionListener(listener);
		btn_WriteCol.addActionListener(listener);
		btn_ReadRow.addActionListener(listener);
		btn_WriteRow.addActionListener(listener);
	}
	
	/**
	 * Hämtar JTextField i angivna positionen i den södra array
	 * @param pos - Positionen i arrayen
	 * @return JTextField
	 */
	public JTextField accessSouthArray(int pos) {
		return southArray[pos];
	}

	/**
	 * Hämtar JTextField i angivna positionen i den östra array
	 * @param pos - Positionen i arrayen
	 * @return JTextField
	 */
	public JTextField accessEastArray(int pos) {
		return eastArray[pos];
	}
	
	class ButtonListener implements ActionListener {

		public ButtonListener() {
			
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource().equals(btn_ReadCol)) {
				System.out.println("readcol");
			}
			
			if(e.getSource().equals(btn_WriteCol)) {
				System.out.println("writecol");
			}
			
			if(e.getSource().equals(btn_ReadRow)) {
				System.out.println("readrow");
			}
			
			if(e.getSource().equals(btn_WriteRow)) {
				System.out.println("writerow");
			}
		}
		
	}
}
