package moment_2;

public class main {

	public static void main(String[] args) {		

		
		Array7x7Viewer viewer = new Array7x7Viewer();
		viewer.setVisible(true);
		viewer.setEnabled(true);
		
		Controller controller = new Controller(viewer);
		
		Array7x7Input input = new Array7x7Input(controller);
		input.setVisible(true);
		input.setEnabled(true);
		input.pack();
		input.setLocation(400, 0);
		}

}
