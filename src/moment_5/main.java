package moment_5;

public class main {
	public static void main(String[] args) {
		
		int rows = 1;
		int cols = 50;
		
		Controller controller = new Controller(rows,cols);
		Viewer viewer = new Viewer(cols, rows, controller);
		controller.setViewer(viewer);

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
	}
	
}
