package moment_5_remake;

public class Main {
	public static void main(String[] args) {
		
		int cols = 50;
		
		Controller controller = new Controller(cols);
		Viewer viewer = new Viewer(cols);
		
		controller.setViewer(viewer);
		viewer.setController(controller);
	}
}

/* Test-str�ngar
 * abcdefghijklmnopqrstuvwxyz���
 * ABCDEFGHIJKLMNOPQRSTUVWXYZ���
 * !"#%&/()=?
 * @�$�{[]}\
 * Yxm�rdaren Julia Blomqvist p� f�ktning i Schweiz
 */
