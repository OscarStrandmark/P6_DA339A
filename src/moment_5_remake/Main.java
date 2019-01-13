package moment_5_remake;

public class Main {
	public static void main(String[] args) {
		
		int rows = 1;
		int cols = 50;
		
		
		Viewer viewer = new Viewer(rows,cols);
		Controller controller = new Controller(rows,cols);
		
		viewer.setController(controller);
		controller.setViewer(viewer);
	}
}

/* Test-str�ngar
 * abcdefghijklmnopqrstuvwxyz���
 * ABCDEFGHIJKLMNOPQRSTUVWXYZ���
 * !"#%&/()=?
 * @�$�{[]}\
 */

/* Test-str�ngar som EJ fungerar
 * Yxm�rdaren Julia Blomqvist p� f�ktning i Schweiz
 * 
 */
