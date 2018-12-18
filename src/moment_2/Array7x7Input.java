package moment_2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Rectangle;
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
		
		
		JPanel centerPane = new JPanel(new GridLayout(2, 1)); //Centerpanelen
		JPanel centerNorthPane = new JPanel(new GridLayout(3, 1)); //Norra centerpanelen
		JPanel CNNPane = new JPanel(new GridLayout(1, 2));//Norra norra centerpanelen
		
		JLabel colNbr = new JLabel("Column nbr:");

		CNNPane.add(colNbr);
		CNNPane.add(JTFNorth);
		
		centerNorthPane.add(CNNPane);
		centerNorthPane.add(btn_ReadCol);
		centerNorthPane.add(btn_WriteCol);

		JPanel centerSouthPane = new JPanel(new GridLayout(3, 1));

		JPanel CSNPane = new JPanel(new GridLayout(1, 2));

		JLabel rowNbr = new JLabel("Row nbr:");
		CSNPane.add(rowNbr);
		CSNPane.add(JTFSouth);

		centerSouthPane.add(CSNPane);
		centerSouthPane.add(btn_ReadRow);
		centerSouthPane.add(btn_WriteRow);

		centerPane.add(centerNorthPane);
		centerPane.add(centerSouthPane);

		add(centerPane, BorderLayout.CENTER);
		JPanel eastPane = new JPanel(new GridLayout(7, 1));

		eastArray[0] = new JTextField();
		eastArray[1] = new JTextField();
		eastArray[2] = new JTextField();
		eastArray[3] = new JTextField();
		eastArray[4] = new JTextField();
		eastArray[5] = new JTextField();
		eastArray[6] = new JTextField();

		eastPane.add(eastArray[0]);
		eastPane.add(eastArray[1]);
		eastPane.add(eastArray[2]);
		eastPane.add(eastArray[3]);
		eastPane.add(eastArray[4]);
		eastPane.add(eastArray[5]);
		eastPane.add(eastArray[6]);

		eastPane.setPreferredSize(new Dimension(40, 250));

		add(eastPane, BorderLayout.EAST);
		JPanel southPane = new JPanel(new BorderLayout());

		JPanel JTFSPanel = new JPanel(new GridLayout(1, 7));

		southArray[0] = new JTextField();
		southArray[1] = new JTextField();
		southArray[2] = new JTextField();
		southArray[3] = new JTextField();
		southArray[4] = new JTextField();
		southArray[5] = new JTextField();
		southArray[6] = new JTextField();

		JTFSPanel.add(southArray[0]);
		JTFSPanel.add(southArray[1]);
		JTFSPanel.add(southArray[2]);
		JTFSPanel.add(southArray[3]);
		JTFSPanel.add(southArray[4]);
		JTFSPanel.add(southArray[5]);
		JTFSPanel.add(southArray[6]);

		JTFSPanel.setPreferredSize(new Dimension(250, 0));

		JPanel paddingSouth = new JPanel();
		paddingSouth.setPreferredSize(new Dimension(40, 40));

		southPane.add(JTFSPanel, BorderLayout.CENTER);
		southPane.add(paddingSouth, BorderLayout.EAST);

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
	 * @param pos
	 * @return JTextField
	 */
	public JTextField accessSouthArray(int pos) {
		return southArray[pos];
	}

	/**
	 * Hämtar JTextField i angivna positionen i den östra array
	 * @param pos
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
