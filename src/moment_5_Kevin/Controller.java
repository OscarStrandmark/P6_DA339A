package moment_5_Kevin;

import java.util.Timer;
import java.util.TimerTask;
import moment_1.Array7;
import moment_1.Array7x7;

public class Controller {

	private Viewer viewer;

	int rows;
	int cols;

	private Array7x7[] a7x7Array = new Array7x7[4];

	private Timer timer;
	private int delay = 100; // delay in milliseconds before task is to be executed
	private int period = 25; // time in milliseconds between successive task executions.
	private String toScreen;

	public Controller(int row, int col) {

		rows = row;
		cols = col;
		toScreen = null;
		fillMatrixWith0();
	}

	public void setStringToScreen(String str) {
		toScreen = str;
	}

	public void run() {
		
		this.a7x7Array = new Array7x7[toScreen.length() + 10];
		fillMatrixWith0();
		
		char[] inputArr = toScreen.toCharArray();
		
		for (int i = 0; i < a7x7Array.length; i++) {
			if(i < inputArr.length){
				a7x7Array[i + 10].setArray(Chars.getChar(inputArr[i]));
			}
		}
		viewer.updateColorDisplay(a7x7Array);
	}

	public void shiftR() {

		Array7 tempPart = new Array7();

		for (int i = 0; i < a7x7Array.length; i++) {
			tempPart = a7x7Array[i].shiftRight(tempPart);
			a7x7Array[0].setCol(0, tempPart);
		}
		viewer.updateColorDisplay(a7x7Array);
	}

	public void shiftL() {

		Array7 tempPart = new Array7();
		
			for (int i = a7x7Array.length - 1; i >= 0; i--) {
				tempPart = a7x7Array[i].shiftLeft(tempPart);
				a7x7Array[a7x7Array.length-1].setCol(6, tempPart);
		}

			viewer.updateColorDisplay(a7x7Array);

	}

	public void shiftLeftTimer() {
		timer = new Timer();
		timer.schedule(new ShiftLeft(), delay, period);
	}

	public void shiftRightTimer() {
		timer = new Timer();
		timer.schedule(new ShiftRight(), delay, period);
	}
	
	
	public void stopTimer() {
		timer.cancel();
		timer.purge();
	}

	public Array7x7[] getModel() {
		return a7x7Array;
	}

	public void setViewer(Viewer view) {
		viewer = view;
	}
	
	private void fillMatrixWith0() {

		for (int i = 0; i < a7x7Array.length; i++) {
			a7x7Array[i] = new Array7x7();
			for (int row = 0; row < 7; row++) {
				for (int col = 0; col < 7; col++) {
					a7x7Array[i].setElement(row, col, 0);
				}
			}
		}

	}

	private class ShiftRight extends TimerTask {

		@Override
		public void run() {
				shiftR();
		}
	}

	private class ShiftLeft extends TimerTask {

		@Override
		public void run() {
				shiftL();
		}
	}
}

//}
