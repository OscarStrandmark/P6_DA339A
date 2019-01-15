package moment_4;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;





public class main1 extends JFrame {

	private JPanel btnPanel;
	private JButton sLeft = new JButton("Shift Left");
	private JButton sRight = new JButton("Shift Right");
	private ColorDisplay d;
	private Controller controller;




	private final Dimension buttonSize = new Dimension(100, 50);
	private final Dimension screenSize = new Dimension(400, 400);



	//private JButton shiftRght = new JButton("Shift Right");
	//private JButton shiftLft = new JButton("Shift Left");

	public int[][] randomColor(Array7x7 array){

		Random random = new Random();

		array.toIntArray();


		int red, green, blue;
		for(int row=0; row<array.toIntArray().length; row++) {
			for(int col=0; col<array.toIntArray()[row].length; col++) {
				red = random.nextInt(256);
				green = random.nextInt(256);
				blue = random.nextInt(256);
				array.toIntArray()[row][col] = Color.rgb(red, green, blue);
			}
		}
	return array.toIntArray();
	}

		public static void main(String[] args) {
			Characters chars = new Characters();
			//		UI ui = new UI();
			Array7x7 a7x = new Array7x7();
			



				//	Controller1 ctrl = new Controller1( ui , a7x );
				//	ctrl.initController();

			
			/**
			 * varför vägrar denna att funka?
			 */
			ColorDisplay v = new ColorDisplay(1,1,Color.WHITE, Color.BLACK,2,40);

			a7x.setArray(chars.getChar('H'));
			v.toColors(a7x);
			v.setDisplay(a7x.toIntArray());
			
			//v.setDisplay(m.randomColor(b7x));
			
			v.updateDisplay();
			JOptionPane.showMessageDialog(null, v);

			//		ColorDisplay d = new ColorDisplay(3, 3, Color.WHITE, Color.BLACK, 1, 18);
			//		d.toColors(a7x);
			//		d.setDisplay(a7x.toIntArray());
			//		d.updateDisplay();
			//		JOptionPane.showMessageDialog(null, d);




		}

	}
