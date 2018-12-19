package moment_2;

public class main {

	public static void main(String[] args) {

		Array7x7Input inputView = new Array7x7Input();
		inputView.setVisible(true);
		inputView.setEnabled(true);
		inputView.pack();
		
		Array7x7Viewer viewerView = new Array7x7Viewer();
		viewerView.setVisible(true);
		viewerView.setEnabled(true);
		}

}
