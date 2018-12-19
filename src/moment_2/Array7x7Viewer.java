package moment_2;

import java.awt.*;

import javax.swing.*;

import moment_1.Array7;
import moment_1.Array7x7;

public class Array7x7Viewer extends JFrame {

	private JLabel[][] labelMatrix = new JLabel[7][7];
	private JLabel[] labelWest = new JLabel[7];
	private JLabel[] labelSouth = new JLabel[7];
	private JPanel centerPanel = new JPanel();
	private JPanel westPanel = new JPanel(new GridLayout(8,1));
	private JPanel southPanel = new JPanel(new GridLayout(1,8));
	private JPanel northPanel = new JPanel();
	private Array7x7 array7x7 = new Array7x7();
	private JLabel col = new JLabel("Column");
	private JLabel row = new JLabel("Row");
	private JLabel title = new JLabel("Array7x7");

	public Array7x7Viewer() {
		westPanel.add(col);
		southPanel.add(row);
		initMatrix(labelMatrix);
		initWest(labelWest);
		initSouth(labelSouth);
		JPanel panelMid = new JPanel(new GridLayout(7, 7));
		this.setSize(400, 400);
		this.setVisible(true);
		centerPanel.setLayout(new GridLayout(7, 7));
		this.setLayout(new BorderLayout());
		westPanel.setPreferredSize(new Dimension(50,20));
		southPanel.setPreferredSize(new Dimension(20,40));
		northPanel.add(title);
		
		

//		for (int i = 0; i < labelMatrix.length; i++) {              vet ej om detta ska vara inne i konstruktorn eller egna metoder 
//			for (int j = 0; j < labelMatrix[i].length; j++) {
//				JLabel temp = new JLabel("0");
//				temp.setBorder(BorderFactory.createLineBorder(Color.BLACK));
//				labelMatrix[i][j] = temp;
//				matrixPanel.add(temp);
//			}
//		}
//
//		for (int i = 0; i < labelWest.length; i++) {
//			JLabel temp = new JLabel("0");
//			temp.setBorder(BorderFactory.createLineBorder(Color.GRAY));
//			labelWest[i] = temp;
//			westPanel.add(temp);
//		}
//
//		for (int i = 0; i < labelSouth.length; i++) {
//			JLabel temp = new JLabel("0");
//			temp.setBorder(BorderFactory.createLineBorder(Color.GRAY));
//			labelSouth[i] = temp;
//			southPanel.add(temp);
//		}

		add(centerPanel, BorderLayout.CENTER);
		add(westPanel, BorderLayout.WEST);
		add(southPanel, BorderLayout.SOUTH);
		add(northPanel, BorderLayout.NORTH);
		
		
		/*
		 * Test av metoderna nedanför, stryk för tom array
		 */
		
//		int array[][] = new int[7][7];                     //  Test av setArray7x7
//		for(int i = 0; i < array.length; i++) {
//			for(int j = 0; j < array[i].length;j++) {
//				array[i][j] = i+j;
//			}
//		}
//		Array7x7 array7x7 = new Array7x7(array);
//		setArray7x7(array7x7);
		
		int array[] = new int[7];               
		for(int i = 0; i<array.length;i++) {
			array[i] = i;
		}
		Array7 array7 = new Array7(array);
//		setRow(array7);
//		setCol(array7);
		setRowInArray7x7(2,array7);
		setColInArray7x7(2,array7);

	}
	
	
	public void initMatrix(JLabel[][] matrix) {            // Kallas en gång, finns som kommentar i konstruktorn om den passar bättre där
		for (int i = 0; i < labelMatrix.length; i++) {
			for (int j = 0; j < labelMatrix[i].length; j++) {
				labelMatrix[i][j] = new JLabel("0");  
				labelMatrix[i][j].setBorder(BorderFactory.createLineBorder(Color.BLACK));
				labelMatrix[i][j].setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
				centerPanel.add(labelMatrix[i][j]);
			}
		}
	}
	
	public void initWest(JLabel[] label) {       // Kallas en gång, finns som kommentar i konstruktorn om den passar bättre där
		for (int i = 0; i < label.length; i++) {
			label[i] = new JLabel("0");
			label[i].setBorder(BorderFactory.createLineBorder(Color.GRAY));
			westPanel.add(labelWest[i]);
		}
	}
	public void initSouth(JLabel[] label) {         // Kallas en gång, finns som kommentar i konstruktorn om den passar bättre där
		for (int i = 0; i < label.length; i++) {
			label[i] = new JLabel("0");
			label[i].setBorder(BorderFactory.createLineBorder(Color.GRAY));
			southPanel.add(labelSouth[i]);
		}

	}
	
	public void setRow(Array7 array) { // Kolumnen längst ner
		int intArray[] = array.toIntArray();
		for(int i = 0; i< labelSouth.length; i++) {
			labelSouth[i].setText("" + intArray[i]);
			}
		}

	
	public void setCol(Array7 array) {      // Kolumnen till vänster
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
	
	
	public static void main(String[] args) {

//		Array7x7Input inputView = new Array7x7Input();
//		inputView.setVisible(true);
//		inputView.setEnabled(true);
//		inputView.pack();
		
		Array7x7Viewer viewerView = new Array7x7Viewer();
		viewerView.setVisible(true);
		viewerView.setEnabled(true);
		//viewerView.pack();
	}
}
