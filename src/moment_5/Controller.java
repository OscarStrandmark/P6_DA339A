package moment_5;

import javax.swing.JOptionPane;

import javafiles.Color;
import moment_1.Array7x7;

public class Controller {

	private int rows;
	private int cols;
	
	private Array7x7[][] matrix;
	
	private Viewer viewer;
	public Controller(int rows, int cols) {

		this.rows = rows;
		this.cols = cols;
		matrix = new Array7x7[rows][cols];
		initMatrix(matrix);
	}
	
	public void left() {
		//TODO: Timertask
	}
	
	public void right() {
		//TODO: Timertask
	}
	
	public void enterString(String str) {
		
		resetMatrix(matrix);
		char[] charArr = str.toCharArray();
		
		Array7x7[][] colorMatrix = new Array7x7[rows][cols];
		initMatrix(colorMatrix);
		resetMatrix(colorMatrix);

		for (int row = 0; row < colorMatrix.length; row++) {
			for (int col = 0; col < colorMatrix[0].length; col++) {
				colorMatrix[row][col] = toColor(colorMatrix[row][col]);
			}
		}

		for (int i = 0; i < charArr.length; i++) {
			colorMatrix[0][i] = toColor(Chars.getChar(charArr[i]));
		}
		
		viewer.setDisplay(colorMatrix);
	}
	
	private void initMatrix(Array7x7[][] matrix) {
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				matrix[row][col] = new Array7x7();
			}
		}
	}
	
	private void resetMatrix(Array7x7[][] matrix) {
		
		Array7x7 temp;
		
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				
				temp = matrix[row][col];
				
				for (int row7x7 = 0; row7x7 < 7; row7x7++) {
					for (int col7x7 = 0; col7x7 < 7; col7x7++) {
						temp.setElement(row7x7, col7x7, 0);
					}
				}
			}
		}
	}
	
	private Array7x7 toColor(Array7x7 arr) {
		
		int[][] newArr = arr.toIntArray();
		
		for (int row = 0; row < newArr.length; row++) {
			for (int col = 0; col < newArr[0].length; col++) {
				if(newArr[row][col] == 1) {
					newArr[row][col] = Color.BLACK;
				} else if(newArr[row][col] == 0) {
					newArr[row][col] = Color.WHITE;
				} else {
					JOptionPane.showMessageDialog(null, "de e inte ok");
				}
			}
		}
		return new Array7x7(newArr);
	}
	public void setViewer(Viewer viewer) {
		this.viewer = viewer;
	}

}
