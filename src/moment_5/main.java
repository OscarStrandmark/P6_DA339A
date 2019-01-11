package moment_5;

public class main {
	public static void main(String[] args) {
		
		int rows = 5;
		int cols = 60;
		
		
		
		Controller controller = new Controller(rows,cols);
		Viewer viewer = new Viewer(cols, rows, controller);
		controller.setViewer(viewer);

	}
	
}
