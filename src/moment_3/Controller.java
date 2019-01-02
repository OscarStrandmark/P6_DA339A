package moment_3;

import moment_1.Array7;
import moment_1.Array7x7;

public class Controller {

	private Test2UI ui;
	private Array7x7 currentArray = new Array7x7();
	private Array7 leftColumn = new Array7();
	private Array7 rightColumn = new Array7();
	
	public Controller() {
	}
	
	public void setUI(Test2UI ui) {
		this.ui = ui;
	}
	
	public void updateCurrentArray(int[][] array) {
		currentArray.setArray(array);
		ui.updateInterface(array);
	}
	
	public void shiftRght() {
		rightColumn = currentArray.shiftRight(leftColumn);
		ui.updateInterface(currentArray.toIntArray());
	}
	
	public void shiftLft() {
		leftColumn = currentArray.shiftRight(rightColumn);
		ui.updateInterface(currentArray.toIntArray());
	}
}
