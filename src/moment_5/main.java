package moment_5;

public class main {
	public static void main(String[] args) {
		
		int rows = 1;
		int cols = 50;
		
		Controller controller = new Controller(rows,cols);
		Viewer viewer = new Viewer(cols, rows, controller);
		controller.setViewer(viewer);

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
	}
	
}
