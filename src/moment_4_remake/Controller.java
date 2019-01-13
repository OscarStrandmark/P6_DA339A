package moment_4_remake;

import moment_1.Array7x7;

public class Controller {

	private Array7x7 array;
	public Viewer viewer;
	
	public Controller() {
	}

	public void shiftLeft() {
		array.shiftLeft(array.getCol(6));
		viewer.updateDisplay();
	}

	public void shiftRight() {
		array.shiftRight(array.getCol(0));
		viewer.updateDisplay();
	}
	
	public Array7x7 getArray() {
		return array;
	}

	public void setViewer(Viewer view) {
		viewer = view;
		array = Chars.getChar('A');
		viewer.updateDisplay();
	}
}
