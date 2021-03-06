package moment_1;

public class Array7x7 {

	private int[][] array;

	public Array7x7() {
		array = new int[7][7];
	}

	public Array7x7(int[][] array) {
		this.array = array;
	}

	public Array7x7(Array7x7 array7x7) {
		
		array = array7x7.toIntArray();
	}

	public void setElement(int row, int col, int value) {
		array[row][col] = value;
	}

	public int getElement(int row, int col) {
		return array[row][col];
	}

	public void setRow(int row, Array7 theRow) {
		int[] intArray = theRow.toIntArray();

		for (int i = 0; i < intArray.length; i++) {
			array[row][i] = intArray[i];
		}
	}

	public Array7 getRow(int row) {
		int[] newArray = new int[7];

		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = array[row][i];
		}

		return new Array7(newArray);
	}

	public void setCol(int col, Array7 theCol) {
		int[] intArray = theCol.toIntArray();

		for (int i = 0; i < intArray.length; i++) {
			array[i][col] = intArray[i];
		}
	}

	public Array7 getCol(int col) {
		int[] newArray = new int[7];

		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = array[i][col];
		}

		return new Array7(newArray);
	}

	public void setArray(Array7x7 array7x7) {
		for (int row = 0; row < this.array.length; row++) {
			for (int col = 0; col < this.array.length; col++) {
				this.array[row][col] = array7x7.getElement(row, col);
			}
		}
	}

	/**
	 * _KOPIERAR_ in parameter-array
	 * 
	 * @param array En 7 l�ng & 7 bred array.
	 */
	public void setArray(int[][] array) {
		for (int row = 0; row < this.array.length; row++) {
			for (int col = 0; col < this.array.length; col++) {
				this.array[row][col] = array[row][col];
			}
		}
	}

	public Array7x7 getArray() {
		Array7x7 new7x7 = new Array7x7();
		int[][] newArray = new int[7][7];

		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array.length; col++) {
				newArray[row][col] = array[row][col];
			}
		}
		new7x7.setArray(newArray);
		return new7x7;
	}

	public int[][] toIntArray() {
		int[][] newArray = new int[7][7];

		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array.length; col++) {
				newArray[row][col] = array[row][col];
			}
		}
		return newArray;
	}

	public Array7 shiftLeft(Array7 in) {
		int[] outArray = new int[7];

		for (int i = 0; i < 7; i++) {
			outArray[i] = array[i][0];
		}
		
		Array7 out = new Array7(outArray); // Raden l�ngst till v�nster som flyttas ut.

		for (int row = 0; row < 7; row++) { // Flyttar allt 1 steg v�nster
			for (int col = 1; col < 7; col++) {
				array[row][col - 1] = array[row][col];
			}
		}

		for (int row = 0; row < 7; row++) { // L�gger in array i parameter l�ngst till h�ger i matrisen.
			array[row][6] = in.getElement(row);
		}

		return out;
	}

	public Array7 shiftRight(Array7 in) {
		int[] outArray = new int[7];

		for (int i = 0; i < 7; i++) {
			outArray[i] = array[i][6];
		}
		Array7 out = new Array7(outArray); // Raden l�ngst till h�ger som flyttas ut.

		for (int row = 0; row < 7; row++) { // Flyttar allt 1 steg till h�ger
			for (int col = 6; col > 0; col--) {
				array[row][col] = array[row][col - 1];
			}
		}

		for (int row = 0; row < 7; row++) { // L�gger in array i parameter till v�nster i matrisen.
			array[row][0] = in.getElement(row);
		}

		return out;
	}
}
