package p6;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Controller {
	private Timer timer;
	private Random random = new Random();
	private ColorDisplayDemo demo;
	private int[][] charA = {{Color.BLUE,Color.BLUE,Color.BLUE,Color.WHITE,Color.BLUE,Color.BLUE,Color.BLUE},
			{Color.BLUE,Color.BLUE,Color.WHITE,Color.BLUE,Color.WHITE,Color.BLUE,Color.BLUE},
			{Color.BLUE,Color.BLUE,Color.WHITE,Color.BLUE,Color.WHITE,Color.BLUE,Color.BLUE},
			{Color.BLUE,Color.BLUE,Color.WHITE,Color.WHITE,Color.WHITE,Color.BLUE,Color.BLUE},
			{Color.BLUE,Color.WHITE,Color.BLUE,Color.BLUE,Color.BLUE,Color.WHITE,Color.BLUE},
			{Color.BLUE,Color.WHITE,Color.BLUE,Color.BLUE,Color.BLUE,Color.WHITE,Color.BLUE},
			{Color.BLUE,Color.WHITE,Color.BLUE,Color.BLUE,Color.BLUE,Color.WHITE,Color.BLUE}};
	private int[][] charR = {{Color.TRANSPARENT,Color.WHITE,Color.WHITE,Color.WHITE,Color.WHITE,Color.TRANSPARENT,Color.TRANSPARENT},
			{Color.TRANSPARENT,Color.WHITE,Color.TRANSPARENT,Color.TRANSPARENT,Color.TRANSPARENT,Color.WHITE,Color.TRANSPARENT},
			{Color.TRANSPARENT,Color.WHITE,Color.TRANSPARENT,Color.TRANSPARENT,Color.TRANSPARENT,Color.WHITE,Color.TRANSPARENT},
			{Color.TRANSPARENT,Color.WHITE,Color.WHITE,Color.WHITE,Color.WHITE,Color.TRANSPARENT,Color.TRANSPARENT},
			{Color.TRANSPARENT,Color.WHITE,Color.TRANSPARENT,Color.WHITE,Color.TRANSPARENT,Color.TRANSPARENT,Color.TRANSPARENT},
			{Color.TRANSPARENT,Color.WHITE,Color.TRANSPARENT,Color.TRANSPARENT,Color.WHITE,Color.TRANSPARENT,Color.TRANSPARENT},
			{Color.TRANSPARENT,Color.WHITE,Color.TRANSPARENT,Color.TRANSPARENT,Color.TRANSPARENT,Color.WHITE,Color.TRANSPARENT}};
	private int[][] stamp = new int[7][7];
	
	public Controller(ColorDisplayDemo demo) {
		this.demo = demo;
		demo.setController(this);
	}
	
	private void show(int[][] arr) {
		for(int row=0; row<stamp.length; row++) {
			for(int col=0; col<stamp[row].length; col++) {
				stamp[row][col] = arr[row][col];
			}
		}
		demo.updateDisplay(stamp);
	}

	public void showA() {
		show(charA);
	}

	public void showR() {
		show(charR);
	}
	

	public void showRandom() {
		int red, green, blue;
		for(int row=0; row<stamp.length; row++) {
			for(int col=0; col<stamp[row].length; col++) {
				red = random.nextInt(256);
				green = random.nextInt(256);
				blue = random.nextInt(256);
				stamp[row][col] = Color.rgb(red, green, blue);
			}
		}
		demo.updateDisplay(stamp);
	}

	public void useTimer() {
		timer = new Timer();
		demo.enableButtons(false);
		timer.schedule(new RandomColors(), 500, 500);
		
	}
	
	public void fadeOut() {
		timer = new Timer();
		demo.enableButtons(false);
		timer.schedule(new FadeOut(), 20, 20);
	}
	
	private void transparency() {
		int alpha, red, green, blue;
		for(int row=0; row<stamp.length; row++) {
			for(int col=0; col<stamp[row].length; col++) {
				
				alpha = Color.alpha(stamp[row][col]);
				if(alpha>0)
					alpha--;
				red = Color.red(stamp[row][col]);
				green = Color.green(stamp[row][col]);
				blue = Color.blue(stamp[row][col]);
				stamp[row][col] = Color.argb(alpha, red, green, blue);
			}
		}
		demo.updateDisplay(stamp);
	}
	
	private class RandomColors extends TimerTask {
		private int counter = 0;
		public void run() {
			if(counter<10) {
				counter++;
				showRandom();
			} else {
				timer.cancel(); // Can't use Timer-instance anymore
				demo.enableButtons(true);
			}
		}
	}
	
	private class FadeOut extends TimerTask {
		private int counter = 255;
		public void run() {
			if(counter>=0) {
				transparency();
				counter--;
			} else {
				timer.cancel();
				demo.enableButtons(true);
			}
		}
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				ColorDisplayDemo demo = new ColorDisplayDemo(Color.BLACK, Color.GRAY);
				new Controller(demo);
				JFrame frame = new JFrame();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.add(demo);
				frame.pack();
				frame.setVisible(true);
			}
		});
	}
}
