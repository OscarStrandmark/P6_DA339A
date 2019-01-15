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

/* Test-strängar
 * abcdefghijklmnopqrstuvwxyzåäö
 * ABCDEFGHIJKLMNOPQRSTUVWXYZÅÄÖ
 * !"#%&/()=?
 * @£$€{[]}\
 * Yxmördaren Julia Blomqvist på fäktning i Schweiz
 */
