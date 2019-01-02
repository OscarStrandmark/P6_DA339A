package moment_3;

import java.awt.Dimension;
import moment_1.Array7x7;

public class Test2UI_Main {

	public static void main(String[] args) {
		Controller controller = new Controller();
		Test2UI test = new Test2UI(controller);
		test.setPreferredSize(new Dimension(600, 400));
		test.pack();
		test.setVisible(true);
		
		int[][] array = {{1,2,3,4,5,6,7},{1,2,3,4,5,6,7},{1,2,3,4,5,6,7},{1,2,3,4,5,6,7},{1,2,3,4,5,6,7},{1,2,3,4,5,6,7},{1,2,3,4,5,6,7}};
		Array7x7 testArray = new Array7x7(array);
		
		test.updateInterface(array);
		
		
	}
}
