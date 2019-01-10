package moment_4;

public class Skoj2 {
//
	public static void main(String[] args) {
		Array7x7 a = new Array7x7();
		
		Characters c = new Characters();
		
	
		a.setArray(c.getChar('X'));
		ColorDisplay di = new ColorDisplay(Color.GREEN, Color.BLUE);
		di.toColors(a);
		
		Skoj s = new Skoj(c, a, Color.GREEN, Color.BLACK);
		
	}
}
