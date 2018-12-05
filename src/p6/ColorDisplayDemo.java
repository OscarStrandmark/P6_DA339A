package p6;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ColorDisplayDemo extends JPanel {
	private Controller controller;
	private ColorDisplay display;
	private JButton btnR = new JButton("R");
	private JButton btnA = new JButton("A");
	private JButton btnRandomColors = new JButton("Slumpa");
	private JButton btnTimer = new JButton("Timer");
	private JButton btnFadeOut = new JButton("Genomskinlig");
	
	public ColorDisplayDemo(int background, int grid) {
		ButtonListener bl = new ButtonListener();
		setLayout(new BorderLayout());
		display = new ColorDisplay(background, grid);
		add(display, BorderLayout.CENTER);
		add(buttonPanel(), BorderLayout.SOUTH);
		btnR.addActionListener(bl);
		btnA.addActionListener(bl);
		btnRandomColors.addActionListener(bl);
		btnTimer.addActionListener(bl);
		btnFadeOut.addActionListener(bl);
	}

	private JPanel buttonPanel() {
		JPanel panel = new JPanel(new GridLayout(1,5));
		panel.add(btnR);
		panel.add(btnA);
		panel.add(btnRandomColors);
		panel.add(btnTimer);
		panel.add(btnFadeOut);
		return panel;
	}
	
	public void setController(Controller controller) {
		this.controller = controller;
	}

	public void enableButtons(boolean enable) {
		btnA.setEnabled(enable);
		btnR.setEnabled(enable);
		btnRandomColors.setEnabled(enable);
		btnFadeOut.setEnabled(enable);
		btnTimer.setEnabled(enable);
	}

	public void updateDisplay(int[][] colors) {
		display.setDisplay(colors);
		display.updateDisplay();
	}
	
	private class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==btnR) {
				controller.showR();
			} else if(e.getSource()==btnA) {
				controller.showA();
			}else if(e.getSource()==btnRandomColors) {
				controller.showRandom();
			} else if(e.getSource()==btnTimer) {
				controller.useTimer();
			} else if(e.getSource()==btnFadeOut) {
				controller.fadeOut();
			}
		}		
	}
}
