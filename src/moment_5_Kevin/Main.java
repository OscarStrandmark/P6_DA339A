package moment_5_Kevin;

public class Main {
	public static void main(String[] args) {
		
		int rows = 1;
		int cols = 10;
		String str = "Test";
		
		Viewer viewer = new Viewer(rows,cols);
		Controller controller = new Controller(rows,cols, str);
		
		viewer.setController(controller);
		controller.setViewer(viewer);
	}
}

/* Test-strängar
 * abcdefghijklmnopqrstuvwxyzåäö
 * ABCDEFGHIJKLMNOPQRSTUVWXYZÅÄÖ
 * !"#%&/()=?
 * @£$€{[]}\
 */

/* Test-strängar som EJ fungerar
 * Yxmördaren Julia Blomqvist på fäktning i Schweiz
 * 
 */
