package moment_2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import moment_1.Array7;
import moment_1.Array7x7;

public class Array7x7Viewer extends JFrame {

	private JLabel[][] labelMatrix = new JLabel[7][7];
	private JLabel[] labelWest = new JLabel[7];
	private JLabel[] labelSouth = new JLabel[7];
	
	private JPanel centerPanel = new JPanel();
	private JPanel westPanel = new JPanel(new GridLayout(7,1));
	private JPanel southPanel = new JPanel(new GridLayout(1,8));
	private JPanel northPanel = new JPanel(new BorderLayout());
	
	private JLabel col = new JLabel("Column");
	private JLabel row = new JLabel("Row",SwingConstants.CENTER);
	private JLabel title = new JLabel("Array7x7",SwingConstants.CENTER);

	public Array7x7Viewer() {
		northPanel.add(col, BorderLayout.WEST);
		//col.setHorizontalAlignment(LEFT);
		
		southPanel.add(row);
		initMatrix(labelMatrix);
		initWest(labelWest);
		initSouth(labelSouth);
		JPanel panelMid = new JPanel(new GridLayout(7, 7));
		setSize(400, 400);
		this.setVisible(true);
		centerPanel.setLayout(new GridLayout(7, 7));
		this.setLayout(new BorderLayout());
		westPanel.setPreferredSize(new Dimension(50,20));
		southPanel.setPreferredSize(new Dimension(20,40));
		northPanel.add(title, BorderLayout.CENTER);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		add(centerPanel, BorderLayout.CENTER);
		add(westPanel, BorderLayout.WEST);
		add(southPanel, BorderLayout.SOUTH);
		add(northPanel, BorderLayout.NORTH);


	}
	
	
	public void initMatrix(JLabel[][] matrix) {            // Kallas en gång, finns som kommentar i konstruktorn om den passar bättre där
		for (int i = 0; i < labelMatrix.length; i++) {
			for (int j = 0; j < labelMatrix[i].length; j++) {
				labelMatrix[i][j] = new JLabel("0",SwingConstants.CENTER);  
				labelMatrix[i][j].setBorder(BorderFactory.createLineBorder(Color.BLACK));
				labelMatrix[i][j].setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
				centerPanel.add(labelMatrix[i][j]);
			}
		}
	}
	
	public void initWest(JLabel[] label) {       // Kallas en gång, finns som kommentar i konstruktorn om den passar bättre där
		for (int i = 0; i < label.length; i++) {
			label[i] = new JLabel("0",SwingConstants.CENTER);
			label[i].setBorder(BorderFactory.createLineBorder(Color.GRAY));
			westPanel.add(labelWest[i]);
		}
	}
	public void initSouth(JLabel[] label) {         // Kallas en gång, finns som kommentar i konstruktorn om den passar bättre där
		for (int i = 0; i < label.length; i++) {
			label[i] = new JLabel("0",SwingConstants.CENTER);
			label[i].setBorder(BorderFactory.createLineBorder(Color.GRAY));
			southPanel.add(labelSouth[i]);
		}

	}
	
	public void setRow(Array7 array) { // Kolumnen längst ner
		System.out.println("SETROW");
		int intArray[] = array.toIntArray();
		for(int i = 0; i< labelSouth.length; i++) {
			labelSouth[i].setText("" + intArray[i]);
			}
		}

	
	public void setCol(Array7 array) {      // Kolumnen till vänster
		System.out.println("SETCOL");
		int intArray[] = array.toIntArray();
		for(int i = 0; i< labelSouth.length; i++) {
			labelWest[i].setText("" + intArray[i]);
			}
	}
	
	public void setRowInArray7x7(int row, Array7 array) {  // Sätter en rad där int är rad
		int intArray[] = array.toIntArray();
		for(int i = 0; i < intArray.length; i++) {
			labelMatrix[row-1][i].setText("" + intArray[i]);
		}
		
	}
	public void setColInArray7x7(int col, Array7 array) {  // Sätter en kolumn där kolumn är rad
		int intArray[] = array.toIntArray();
		for(int i = 0; i < intArray.length; i++) {
			labelMatrix[i][col-1].setText("" + intArray[i]);
		}
		
	}
	
	public void setArray7x7(Array7x7 array) {    //Ändra hela arrayen i mitten
		int intArray[][] = array.toIntArray();
		for(int i = 0; i < labelMatrix.length; i++) {
			for(int j = 0; j < labelMatrix[i].length;j++) {
				labelMatrix[i][j].setText("" + intArray[i][j]);
			}
			
		}	
	}
}
