package moment_5_remake;

import java.util.Timer;
import java.util.TimerTask;

import moment_1.Array7;
import moment_1.Array7x7;

public class Controller {

	private int cols;
	
	private Array7x7[] array;
	private Viewer viewer;
	
	private Timer timer;
	private int delay = 100; // delay in milliseconds before task is to be executed
	private int period = 100; // time in milliseconds between successive task executions.
	private boolean timerOn;
	
	public Controller(int cols) {
		this.cols = cols;
		
		array = new Array7x7[cols];
		
	}
	
	public void newText(String text) {
		zeroArray7x7(array);
		
		char[] charArr = text.toCharArray();
		
		for (int i = 0; i < charArr.length; i++) {
			array[i] = Chars.getChar(charArr[i]);
		}
		
		viewer.updateScreen();
	}
	
	public void shiftL() {

		Array7 temp = array[0].getCol(0);
		
		for (int col = cols-1; col >= 0; col--) {
			temp = array[col].shiftLeft(temp);
		}
		
		viewer.updateScreen();
	}
	
	public void shiftR() {
		
		Array7 temp = array[cols-1].getCol(6);
		
		for (int i = 0; i < cols; i++) {
			temp = array[i].shiftRight(temp);
		}
		
		viewer.updateScreen();
	}
	
	public void startLeftShift() {
		timerOn = true;
		timer = new Timer();
		timer.schedule(new ShiftLeft(), delay, period);
	}
	
	public void startRightShift() {
		timerOn = true;
		timer = new Timer();
		timer.schedule(new ShiftRght(), delay, period);
	}
	
	public void stopTimer() {
		System.out.println("STOP");
		timerOn = false;
		timer.cancel();
		timer.purge();
		timer = null;
	}
	
	public Array7x7[] getModel() {

		return array;
	}
	
	public void setViewer(Viewer v) {
		viewer = v;
	}
	
	public void zeroArray7x7(Array7x7[] arr) {
		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = new Array7x7();
			
			for (int row = 0; row < 7; row++) {
				for (int col = 0; col < 7; col++) {
					arr[i].setElement(row, col, 0);
				}
			}		
		}
	}
	
	private class ShiftLeft extends TimerTask {
		@Override
		public void run() {
			if(timerOn) {
				shiftL();
				System.out.println("L");
			} else {
				timer.cancel();
				timer.purge();
				timer = null;
			}
		}		
	}
	
	private class ShiftRght extends TimerTask {
		@Override
		public void run() {
			if(timerOn) {
				shiftR();
				System.out.println("R");
			} else {
				timer.cancel();
				timer.purge();
				timer = null;
			}
		}
	}
}
