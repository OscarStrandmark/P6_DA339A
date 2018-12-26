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
		System.out.print("hej");

	}

	/**
	 * _KOPIERAR_ in parameter-array
	 * 
	 * @param array En 7 lång & 7 bred array.
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
		
		for (int i = 0; i < array.length; i++) {
			outArray[i] = array[i][0];
		}
		Array7 out = new Array7(outArray); //Raden längst till vänster som flyttas ut.
		
		for (int row = 0; row < array.length; row++) {	//Flyttar allt 1 steg vänster
			for (int col = 1; col < array[0].length; col++) {
				array[row][col-1] = array[row][col];
			}
		}
		
		for (int row = 0; row < array.length; row++) { //Lägger in array i parameter längst till höger i matrisen.
			array[row][array.length-1] = in.getElement(row);
		}
		
		return out;
	}

	public Array7 shiftRight(Array7 in) {
		int[] outArray = new int[7];
		
		for (int i = 0; i < array.length; i++) {
			outArray[i] = array[i][array.length-1];
		}
		Array7 out = new Array7(outArray); //Raden längst till höger som flyttas ut.
		
		for (int row = array.length; row >= 0; row--) { //Flyttar allt 1 steg till höger
			for (int col = array[0].length-1; col >= 0; col--) {
				array[row][col+1] = array[row][col];
			}
		}
		
		for (int row = 0; row < array.length; row++) { //Lägger in array i parameter till vänster i matrisen.
			array[row][0] = in.getElement(row);
		}
		
		return out;
	}
}
