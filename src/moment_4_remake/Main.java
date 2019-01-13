package moment_4_remake;

public class Main {

	public static void main(String[] args) {
		Controller controller = new Controller();
		Viewer view = new Viewer(controller);
		controller.setViewer(view);
	}

}
