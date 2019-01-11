package moment_5;

import javafiles.Color;
import moment_1.Array7x7;
import moment_4.Array7;

public class Controller {

	private int rows;
	private int cols;
	
	private Array7x7[][] matrix;
	
	private Viewer viewer;
	public Controller(int rows, int cols) {

		this.rows = rows;
		this.cols = cols;
		matrix = new Array7x7[rows][cols];
		initMatrix();
	}
	
	private void initMatrix() {
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				matrix[row][col] = new Array7x7();
			}
		}
	}
	
	private void clearMatrix() {
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				matrix[row][col] = new Array7x7();
			}
		}
	}
	public void enterString(String str) {
		System.out.println(str);
		clearMatrix();
		for (int i = 0; i < str.toCharArray().length; i++) {
			matrix[0][i] = Chars.getChar(str.charAt(i));
		}

		Array7x7[][] colorMatrix = new Array7x7[rows][cols];
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				colorMatrix[row][col] = toColors(matrix[row][col]);
			}
		}
		
		viewer.updateDisplay(colorMatrix);
	}
	
	
	private Array7x7 toColors(Array7x7 a7x) {   // Metod som sätter färg beroende på etta eller nolla K
		Array7x7 newArray = a7x; 
		for (int row = 0; row < 7; row++) {
			for (int col = 0; col < 7; col++) {
				if(a7x.getElement(row, col) == 0) {
					newArray.setElement(row, col, Color.WHITE);
				}
				else {
					newArray.setElement(row, col, Color.BLACK);
				}
			}
		}
		return newArray;
		}
	
	private Array7 toColors(Array7 a7) {
		for(int i=0; i < 7; i++) {
			a7.setElement(i, Color.WHITE);
		}
		return a7;
	}
	
	public void setViewer(Viewer viewer) {
		this.viewer = viewer;
	}
}
