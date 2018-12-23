package moment_2;

import moment_1.*;

public class Controller {

	private Array7x7 array;
	private Array7x7Viewer viewer;

	public Controller(Array7x7Viewer viewer) {
		this.viewer = viewer;
		
		int[][]	arr = new int[7][7];
		
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr.length; col++) {
				arr[row][col] = 0;
			}
		}
		array = new Array7x7(arr);
	}

	public void readRow(int row) {
		viewer.setRow(array.getRow(row-1));
	}

	public void readCol(int col) {
		viewer.setCol(array.getCol(col-1));
	}

	public void writeRow(int row, Array7 arr7) {
		array.setRow(row-1, arr7);
		viewer.setRowInArray7x7(row, arr7);
	}

	public void writeCol(int col, Array7 arr7) {
		array.setCol(col-1, arr7);
		viewer.setColInArray7x7(col, arr7);
	}

}
