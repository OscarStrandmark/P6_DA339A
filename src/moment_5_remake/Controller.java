package moment_5_remake;

import java.util.Timer;
import java.util.TimerTask;
import moment_1.Array7;
import moment_1.Array7x7;

public class Controller {

	private Viewer viewer;
	
	int rows;
	int cols;
	
	private Array7x7[][] matrix7x7;
	
	private Timer timer;
	private int delay = 5;		// delay in milliseconds before task is to be executed
	private int period = 20;	// time in milliseconds between successive task executions.
	public Controller(int row, int col) {
		
		rows = row;
		cols = col;
		
		matrix7x7 = new Array7x7[row][col];
	}
	
	public void newText(String input) {
		fillMatrixWith0();
		
		char[] inputArr = input.toCharArray();
		
		for (int i = 0; i < inputArr.length; i++) {
			matrix7x7[0][i] = Chars.getChar(inputArr[i]);
		}
		
		viewer.updateColorDisplay();
	}
	
	public void shiftLeftTimer() {
		timer = new Timer();
		timer.schedule(new ShiftLeft(), delay, period);
	}
	
	private void shiftLeft() {
		
		Array7 temp = null;
		
		for (int row = 0; row < rows; row++) {
			
			temp = matrix7x7[row][0].getCol(0);
			
			for (int col = cols-1; col >= 0; col--) {
				
				temp = matrix7x7[row][col].shiftLeft(temp);
				
			}
		}
	}
	
	public void shiftRightTimer() {
		timer = new Timer();
		timer.schedule(new ShiftRight(), delay, period);
	}
	
	private void shiftRight() {
		
		Array7 temp = null;
		
		for (int row = 0; row < rows; row++) {
			
			temp = matrix7x7[row][cols-1].getCol(6);
			
			for (int col = 0; col < cols; col++) {
				
				temp = matrix7x7[row][col].shiftRight(temp);
				
			}
		}
	}
	
	public Array7x7[][] getModel(){
		return matrix7x7;
	}

	public void setViewer(Viewer view) {
		viewer = view;
	}
	
	private void fillMatrixWith0() {
		
		Array7x7 empty7x7 = new Array7x7();
		
		for (int row = 0; row < 7; row++) {
			for (int col = 0; col < 7; col++) {
				empty7x7.setElement(row, col, 0);
			}
		}
		
		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < cols; col++) {
				matrix7x7[row][col] = empty7x7;
			}
		}
	}
	private class ShiftRight extends TimerTask {
		private int counter = 0;
		@Override
		public void run() {
			if(counter < (7 * cols)) {
				shiftRight();
				viewer.updateColorDisplay();
				counter++;
			}
		}
	}
	
	private class ShiftLeft extends TimerTask {
		private int counter = 0;
		@Override
		public void run() {
			if(counter < (7 * cols)) {
				shiftLeft();
				viewer.updateColorDisplay();
				counter++;
			}
		}
	}
}
