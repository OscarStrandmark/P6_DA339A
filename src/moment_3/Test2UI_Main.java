package moment_3;

import moment_1.Array7x7;

public class Test2UI_Main {

	public static void main(String[] args) {
		
		int[][] array = {{1,2,3,4,5,6,7},{1,2,3,4,5,6,7},{1,2,3,4,5,6,7},{1,2,3,4,5,6,7},{1,2,3,4,5,6,7},{1,2,3,4,5,6,7},{1,2,3,4,5,6,7}};
		
		Array7x7 testArray = new Array7x7(array);
		Test2UI test = new Test2UI();
		Controller controller = new Controller( test, testArray);
		
		controller.initController();
		
	}
}
