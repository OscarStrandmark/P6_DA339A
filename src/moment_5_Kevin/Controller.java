package moment_5_Kevin;

import java.util.Timer;
import java.util.TimerTask;
import moment_1.Array7;
import moment_1.Array7x7;

public class Controller {

	private Viewer viewer;

	int rows;
	int cols;

	private Array7x7[] matrix7x7 = new Array7x7[4];

	private Timer timer;
	private int delay = 100; // delay in milliseconds before task is to be executed
	private int period = 50; // time in milliseconds between successive task executions.
	private String toScreen;

	public Controller(int row, int col, String test) {

		rows = row;
		cols = col;
		toScreen = test;
		Array7x7[] matrix7x7 = new Array7x7[4];
		fillMatrixWith0();
		System.out.println(toScreen);
	}

	public void setStringToScreen(String str) {
		toScreen = str;
	}

	public void Test() {
		this.matrix7x7 = new Array7x7[toScreen.length() + 15];
		System.out.println(toScreen);
		fillMatrixWith0();
		System.out.println(matrix7x7.length);
		char[] inputArr = toScreen.toCharArray();
		for (int i = 0; i < matrix7x7.length; i++) {
			if(i < inputArr.length){
				matrix7x7[i + 10].setArray(Chars.getChar(inputArr[i]));
			}
		}
		viewer.updateColorDisplay(matrix7x7);
	}

	public void shiftR() {

		Array7 tempPart = new Array7();

		for (int i = 0; i < matrix7x7.length; i++) {
			tempPart = matrix7x7[i].shiftRight(tempPart);
			matrix7x7[0].setCol(0, tempPart);
		}
		viewer.updateColorDisplay(matrix7x7);
	}

	public void shiftL() {

		Array7 tempPart = new Array7();
		
			for (int i = matrix7x7.length - 1; i >= 0; i--) {
				tempPart = matrix7x7[i].shiftLeft(tempPart);
				matrix7x7[matrix7x7.length-1].setCol(6, tempPart);
		}

			viewer.updateColorDisplay(matrix7x7);

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
		return matrix7x7;
	}

	public void setViewer(Viewer view) {
		viewer = view;
	}

//	
	private void fillMatrixWith0() {

		for (int i = 0; i < matrix7x7.length; i++) {
			matrix7x7[i] = new Array7x7();
			for (int row = 0; row < 7; row++) {
				for (int col = 0; col < 7; col++) {
					matrix7x7[i].setElement(row, col, 0);
				}
			}
		}

	}

	private class ShiftRight extends TimerTask {
		private int counter = 0;

		@Override
		public void run() {
			if (counter < (400 * cols)) {
				shiftR();
				counter++;
			}
		}
	}

	private class ShiftLeft extends TimerTask {
		private int counter = 0;

		@Override
		public void run() {
			if (counter < (400 * cols)) {
				shiftL();
				counter++;
			}
		}
	}
}

//}
