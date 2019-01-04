package moment_3;

import java.awt.*;
import javax.swing.*;

public class Test2UI extends JFrame {
	
	private JLabel[][] labelMatrix = new JLabel[7][7];
	private JTextField[] textFieldColumnLft = new JTextField[7];
	private JTextField[] textFieldColumnRght = new JTextField[7];	
	private JButton shiftRght = new JButton("Shift Right");
	private JButton shiftLft = new JButton("Shift Left");
	
	private JPanel centerPanel = new JPanel();
	private JPanel westPanel = new JPanel();
	private JPanel eastPanel = new JPanel();
	private JPanel southPanel = new JPanel();
	
	public Test2UI() {
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
		
		setPreferredSize(new Dimension(600, 400));
		pack();
		setVisible(true);

	}
	
	// Lägger till knappar, Rutor , Skrivkolumner
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
			
			textFieldColumnLft[i].getDocument().putProperty("columnArray", textFieldColumnLft);
			textFieldColumnRght[i].getDocument().putProperty("columnArray", textFieldColumnRght);

			
			textFieldColumnLft[i].setPreferredSize(new Dimension(50,0));
			textFieldColumnRght[i].setPreferredSize(new Dimension(50,0));

			textFieldColumnLft[i].setAlignmentX(CENTER_ALIGNMENT);
			
			eastPanel.add(textFieldColumnRght[i]);
			westPanel.add(textFieldColumnLft[i]);

		}
		southPanel.add(shiftLft);
		southPanel.add(shiftRght);
		
	}
	//Återställer kolumner längst ut till värdet "0"
	// är privat då den används i updateLftTxtFldCol etc. 
	// för att nollställa kolumnerna innan de uppdateras
	private void resetTextFieldColumns() {
		for ( int i = 0; i < textFieldColumnLft.length; i++) {
			textFieldColumnLft[i].setText("0");
			textFieldColumnRght[i].setText("0");
		}
	}
	
	//uppdaterar interfacet, körs när användaren trycker på en knapp
	public void updateInterface(int[][] array) {
		for(int i = 0; i < labelMatrix.length; i++) {
			for(int j = 0; j < labelMatrix[i].length; j++) {
				labelMatrix[i][j].setText(Integer.toString(array[i][j]));
			}
		}
	}
	//Uppdaterar kolumn i kanten
	public void updateLftTxtFldCol(int[] array) {
		resetTextFieldColumns();
		for(int i = 0; i < textFieldColumnLft.length; i++) {
			textFieldColumnLft[i].setText(Integer.toString(array[i]));
		}
	}
	
	public void updateRghtTxtFldCol(int[] array) {
		resetTextFieldColumns();
		for(int i = 0; i < textFieldColumnRght.length; i++) {
			textFieldColumnRght[i].setText(Integer.toString(array[i]));
		}
	}
	
	// Till actionListeners i Controller
	public JButton getShiftLeftBtn() {
		return shiftLft;
	}
	
	public JButton getShiftRightBtn() {
		return shiftRght;
	}
	
	public JTextField[] getLeftTxtFldCol() {
		return textFieldColumnLft;
	}
	
	public JTextField[] getRightTxtFldCol() {
		return textFieldColumnRght;
	}
}
