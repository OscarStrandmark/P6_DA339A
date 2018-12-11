package p6;

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
	
	
	public void setArray(int[][] array) {
		//TODO
	}
	
	public Array7x7 getArray() {
		//TODO
		return null;
	}
	
	public int[][] toIntArray(){
		//TODO
		return null;
	}
}
