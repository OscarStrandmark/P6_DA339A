package p6;

public class Array7 {

	private int[] array;

	public Array7() {
		array = new int[7];
	}

	public Array7(int[] array) {
		this.array = array;
	}

	public Array7(Array7 array7) {
		array = array7.toIntArray();
		//jhjkgjk
	}

	public void setElement(int index, int value) {
		array[index] = value;
	}

	public int getElement(int index) {
		return array[index];
	}

	public void setArray(Array7 array7) {
		array7.toIntArray();
	}

	public void setArray(int[] array) {
		this.array = array;
	}

	public Array7 getArray() {
		
		int[] newArray = new int[7];

		for (int i = 0; i < array.length; i++) {
			newArray[i] = array[i];
		}
		
		return new Array7(newArray);
	}

	public int[] toIntArray() {

		int[] newArray = new int[7];

		for (int i = 0; i < array.length; i++) {
			newArray[i] = array[i];
		}
		
		return newArray;
	}
}
