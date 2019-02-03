package moment_5_remake;

import moment_1.Array7x7;

public class Chars {

	public static Array7x7 getChar(char chr) {
		Array7x7 res;

		switch(chr) {

		case 'A' : res = new Array7x7(charA); 
		break;

		case 'B' : res = new Array7x7(charB); 
		break;

		case 'C' : res = new Array7x7(charC); 
		break;

		case 'D' : res = new Array7x7(charD); 
		break;

		case 'E' : res = new Array7x7(charE); 
		break;

		case 'F' : res = new Array7x7(charF); 
		break;

		case 'G' : res = new Array7x7(charG); 
		break;

		case 'H' : res = new Array7x7(charH); 
		break;

		case 'I' : res = new Array7x7(charI); 
		break;

		case 'J' : res = new Array7x7(charJ); 
		break;

		case 'K' : res = new Array7x7(charK); 
		break;

		case 'L' : res = new Array7x7(charL); 
		break;

		case 'M' : res = new Array7x7(charM); 
		break;

		case 'N' : res = new Array7x7(charN); 
		break;

		case 'O' : res = new Array7x7(charO); 
		break;

		case 'P' : res = new Array7x7(charP); 
		break;

		case 'Q' : res = new Array7x7(charQ); 
		break;

		case 'R' : res = new Array7x7(charR); 
		break;

		case 'S' : res = new Array7x7(charS); 
		break;

		case 'T' : res = new Array7x7(charT); 
		break;

		case 'U' : res = new Array7x7(charU); 
		break;

		case 'V' : res = new Array7x7(charV); 
		break;

		case 'W' : res = new Array7x7(charW); 
		break;

		case 'X' : res = new Array7x7(charX); 
		break;

		case 'Y' : res = new Array7x7(charY); 
		break;

		case 'Z' : res = new Array7x7(charZ); 
		break;

		case '�' : res = new Array7x7(char�); 
		break;

		case '�' : res = new Array7x7(char�); 
		break;

		case '�' : res = new Array7x7(char�); 
		break;
		
		case 'a' : res = new Array7x7(charSmallA); 
		break;

		case 'b' : res = new Array7x7(charSmallB); 
		break;

		case 'c' : res = new Array7x7(charSmallC); 
		break;

		case 'd' : res = new Array7x7(charSmallD); 
		break;

		case 'e' : res = new Array7x7(charSmallE); 
		break;

		case 'f' : res = new Array7x7(charSmallF); 
		break;

		case 'g' : res = new Array7x7(charSmallG); 
		break;

		case 'h' : res = new Array7x7(charSmallH); 
		break;

		case 'i' : res = new Array7x7(charSmallI); 
		break;

		case 'j' : res = new Array7x7(charSmallJ); 
		break;

		case 'k' : res = new Array7x7(charSmallK); 
		break;

		case 'l' : res = new Array7x7(charSmallL); 
		break;

		case 'm' : res = new Array7x7(charSmallM); 
		break;

		case 'n' : res = new Array7x7(charSmallN); 
		break;

		case 'o' : res = new Array7x7(charSmallO); 
		break;

		case 'p' : res = new Array7x7(charSmallP); 
		break;

		case 'q' : res = new Array7x7(charSmallQ); 
		break;

		case 'r' : res = new Array7x7(charSmallR); 
		break;

		case 's' : res = new Array7x7(charSmallS); 
		break;

		case 't' : res = new Array7x7(charSmallT); 
		break;

		case 'u' : res = new Array7x7(charSmallU); 
		break;

		case 'v' : res = new Array7x7(charSmallV); 
		break;

		case 'w' : res = new Array7x7(charSmallW); 
		break;

		case 'x' : res = new Array7x7(charSmallX); 
		break;

		case 'y' : res = new Array7x7(charSmallY); 
		break;

		case 'z' : res = new Array7x7(charSmallZ); 
		break;

		case '�' : res = new Array7x7(charSmall�); 
		break;

		case '�' : res = new Array7x7(charSmall�); 
		break;

		case '�' : res = new Array7x7(charSmall�); 
		break;

		case '1' : res = new Array7x7(char1); 
		break;

		case '2' : res = new Array7x7(char2); 
		break;

		case '3' : res = new Array7x7(char3); 
		break;

		case '4' : res = new Array7x7(char4); 
		break;

		case '5' : res = new Array7x7(char5); 
		break;

		case '6' : res = new Array7x7(char6); 
		break;

		case '7' : res = new Array7x7(char7); 
		break;

		case '8' : res = new Array7x7(char8); 
		break;

		case '9' : res = new Array7x7(char9); 
		break;

		case '0' : res = new Array7x7(char0); 
		break;

		case '+' : res = new Array7x7(PLUS); 
		break;

		case '-' : res = new Array7x7(MINUS); 
		break;

		case '*' : res = new Array7x7(ASTERISK); 
		break;

		case '=' : res = new Array7x7(EQUALS); 
		break;

		case '?' : res = new Array7x7(QUESTIONMARK); 
		break;

		case '@' : res = new Array7x7(ATSIGN); 
		break;

		case '[' : res = new Array7x7(STARTBRACKET); 
		break;

		case ']' : res = new Array7x7(ENDBRACKET); 
		break;
		
		case '{' : res = new Array7x7(STARTBRACKETCURLY); 
		break;

		case '}' : res = new Array7x7(ENDBRACKETCURLY); 
		break;
		
		case '(' : res = new Array7x7(STARTPARENTHESES); 
		break;

		case ')' : res = new Array7x7(ENDPARENTHESES); 
		break;

		case '.' : res = new Array7x7(DOT); 
		break;

		case ',' : res = new Array7x7(COMMA); 
		break;

		case ';' : res = new Array7x7(SEMICOLON); 
		break;

		case '/' : res = new Array7x7(SLASH); 
		break;
		
		case '\\' : res = new Array7x7(BACKSLASH); 
		break;
		
		case '&': res = new Array7x7(AMPERSAND); 
		break;

		case '%': res = new Array7x7(PERCENT); 
		break;

		case '\u0020' : res = new Array7x7(SPACE); 
		break;
		
		case '\"' : res = new Array7x7(DOUBLEQUOTE); 
		break;
		
		case '!' : res = new Array7x7(EXCLAMATION); 
		break;
		
		case '\'' : res = new Array7x7(SINGLEQUOTE); 
		break;
		
		case '�' : res = new Array7x7(EUROSIGN); 
		break;
		
		case '$' : res = new Array7x7(DOLLARSIGN); 
		break;
		
		case '�' : res = new Array7x7(POUNDSIGN); 
		break;
		
		case '|' : res = new Array7x7(POLE); 
		break;
		
		case '#' : res = new Array7x7(HASHTAG); 
		break;
		
		case '<' : res = new Array7x7(SMALLERTHAN); 
		break;
		
		case '>' : res = new Array7x7(BIGGERTHAN); 
		break;
		
		case '_' : res = new Array7x7(UNDERLINE); 
		break;
		
		default : res = new Array7x7(UNKNOWN); 
		break;
		}

		return res;
	}

	public static int[][] charA = {
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 1, 0, 1, 0, 0},
			{0, 0, 1, 0, 1, 0, 0},
			{0, 0, 1, 1, 1, 0, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0}
	};

	public static int[][] charB = {
			{0, 1, 1, 1, 0, 0, 0},
			{0, 1, 0, 0, 1, 0, 0},
			{0, 1, 0, 0, 1, 0, 0},
			{0, 1, 1, 1, 0, 0, 0},
			{0, 1, 0, 0, 1, 0, 0},
			{0, 1, 0, 0, 1, 0, 0},
			{0, 1, 1, 1, 0, 0, 0}
	};

	public static int[][] charC = {
			{0, 0, 0, 1, 1, 0, 0},
			{0, 0, 1, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 0, 0},
			{0, 1, 0, 0, 0, 0, 0},
			{0, 1, 0, 0, 0, 0, 0},
			{0, 0, 1, 0, 0, 1, 0},
			{0, 0, 0, 1, 1, 0, 0}
	};

	public static int[][] charD = {
			{0, 1, 1, 0, 0, 0, 0},
			{0, 1, 0, 1, 0, 0, 0},
			{0, 1, 0, 0, 1, 0, 0},
			{0, 1, 0, 0, 1, 0, 0},
			{0, 1, 0, 0, 1, 0, 0},
			{0, 1, 0, 1, 0, 0, 0},
			{0, 1, 1, 0, 0, 0, 0}
	};

	public static int[][] charE = {
			{0, 1, 1, 1, 1, 0, 0},
			{0, 1, 0, 0, 0, 0, 0},
			{0, 1, 0, 0, 0, 0, 0},
			{0, 1, 1, 1, 0, 0, 0},
			{0, 1, 0, 0, 0, 0, 0},
			{0, 1, 0, 0, 0, 0, 0},
			{0, 1, 1, 1, 1, 0, 0}
	};

	public static int[][] charF = {
			{0, 1, 1, 1, 1, 0, 0},
			{0, 1, 0, 0, 0, 0, 0},
			{0, 1, 0, 0, 0, 0, 0},
			{0, 1, 1, 1, 0, 0, 0},
			{0, 1, 0, 0, 0, 0, 0},
			{0, 1, 0, 0, 0, 0, 0},
			{0, 1, 0, 0, 0, 0, 0}
	};

	public static int[][] charG = {
			{0, 0, 0, 1, 1, 0, 0},
			{0, 0, 1, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 0, 0},
			{0, 1, 0, 0, 0, 0, 0},
			{0, 1, 0, 0, 1, 1, 0},
			{0, 0, 1, 0, 0, 1, 0},
			{0, 0, 0, 1, 1, 0, 0}
	};

	public static int[][] charH = {
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 1, 1, 1, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0}
	};

	public static int[][] charI = {
			{0, 0, 1, 1, 1, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 1, 1, 1, 0, 0}
	};

	public static int[][] charJ = {
			{0, 0, 1, 1, 1, 0, 0},
			{0, 0, 0, 0, 1, 0, 0},
			{0, 0, 0, 0, 1, 0, 0},
			{0, 0, 0, 0, 1, 0, 0},
			{0, 0, 0, 0, 1, 0, 0},
			{0, 0, 1, 0, 1, 0, 0},
			{0, 0, 0, 1, 0, 0, 0}
	};

	public static int[][] charK = {
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 1, 0, 0},
			{0, 1, 0, 1, 0, 0, 0},
			{0, 1, 1, 0, 0, 0, 0},
			{0, 1, 0, 1, 0, 0, 0},
			{0, 1, 0, 0, 1, 0, 0},
			{0, 1, 0, 0, 0, 1, 0}
	};

	public static int[][] charL = {
			{0, 1, 0, 0, 0, 0, 0},
			{0, 1, 0, 0, 0, 0, 0},
			{0, 1, 0, 0, 0, 0, 0},
			{0, 1, 0, 0, 0, 0, 0},
			{0, 1, 0, 0, 0, 0, 0},
			{0, 1, 0, 0, 0, 0, 0},
			{0, 1, 1, 1, 1, 0, 0}
	};

	public static int[][] charM = {
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 1, 0, 1, 1, 0},
			{0, 1, 0, 1, 0, 1, 0},
			{0, 1, 0, 1, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0}
	};

	public static int[][] charN = {
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 1, 0, 0, 1, 0},
			{0, 1, 1, 0, 0, 1, 0},
			{0, 1, 0, 1, 0, 1, 0},
			{0, 1, 0, 0, 1, 1, 0},
			{0, 1, 0, 0, 1, 1, 0},
			{0, 1, 0, 0, 0, 1, 0}
	};

	public static int[][] charO = {
			{0, 0, 1, 1, 1, 0, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 0, 1, 1, 1, 0, 0}
	};

	public static int[][] charP = {
			{0, 1, 1, 1, 0, 0, 0},
			{0, 1, 0, 0, 1, 0, 0},
			{0, 1, 0, 0, 1, 0, 0},
			{0, 1, 1, 1, 0, 0, 0},
			{0, 1, 0, 0, 0, 0, 0},
			{0, 1, 0, 0, 0, 0, 0},
			{0, 1, 0, 0, 0, 0, 0}
	};

	public static int[][] charQ = {
			{0, 0, 1, 1, 1, 0, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 0, 1, 1, 1, 1, 1}
	};

	public static int[][] charR = {
			{0, 1, 1, 1, 0, 0, 0},
			{0, 1, 0, 0, 1, 0, 0},
			{0, 1, 0, 0, 1, 0, 0},
			{0, 1, 1, 1, 0, 0, 0},
			{0, 1, 0, 1, 0, 0, 0},
			{0, 1, 0, 0, 1, 0, 0},
			{0, 1, 0, 0, 1, 0, 0}
	};

	public static int[][] charS = {
			{0, 0, 1, 1, 1, 0, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 0, 0},
			{0, 0, 1, 1, 1, 0, 0},
			{0, 0, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 0, 1, 1, 1, 0, 0}
	};

	public static int[][] charT = {
			{0, 1, 1, 1, 1, 1, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0}
	};

	public static int[][] charU = {
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 0, 1, 1, 1, 0, 0}
	};

	public static int[][] charV = {
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 0, 1, 0, 1, 0, 0},
			{0, 0, 1, 0, 1, 0, 0},
			{0, 0, 0, 1, 0, 0, 0}
	};

	public static int[][] charW = {
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 1, 0, 1, 0},
			{0, 1, 0, 1, 0, 1, 0},
			{0, 0, 1, 0, 1, 0, 0}
	};

	public static int[][] charX = {
			{0, 1, 0, 0, 0, 1, 0},
			{0, 0, 1, 0, 1, 0, 0},
			{0, 0, 1, 0, 1, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 1, 0, 1, 0, 0},
			{0, 0, 1, 0, 1, 0, 0},
			{0, 1, 0, 0, 0, 1, 0}
	};

	public static int[][] charY = {
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 0, 1, 0, 1, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0}
	};

	public static int[][] charZ = {
			{0, 1, 1, 1, 1, 1, 0},
			{0, 0, 0, 0, 1, 0, 0},
			{0, 0, 0, 0, 1, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 1, 0, 0, 0, 0},
			{0, 0, 1, 0, 0, 0, 0},
			{0, 1, 1, 1, 1, 1, 0}
	};

	public static int[][] char� = {
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 1, 1, 1, 0, 0},
			{0, 0, 1, 0, 1, 0, 0},
			{0, 0, 1, 1, 1, 0, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0}
	};

	public static int[][] char� = {
			{0, 0, 1, 0, 1, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 1, 1, 1, 0, 0},
			{0, 0, 1, 0, 1, 0, 0},
			{0, 0, 1, 1, 1, 0, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0}
	};

	public static int[][] char� = {
			{0, 0, 1, 0, 1, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 1, 1, 1, 0, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 0, 1, 1, 1, 0, 0}
	};
	
	public static int[][] charSmallA = {
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 1, 1, 1, 0, 0},
			{0, 0, 1, 0, 1, 0, 0},
			{0, 0, 1, 0, 1, 0, 0},
			{0, 0, 1, 1, 1, 1, 0}
	};

	public static int[][] charSmallB = {
			{0, 0, 1, 0, 0, 0, 0},
			{0, 0, 1, 0, 0, 0, 0},
			{0, 0, 1, 0, 0, 0, 0},
			{0, 0, 1, 1, 1, 0, 0},
			{0, 0, 1, 0, 1, 0, 0},
			{0, 0, 1, 0, 1, 0, 0},
			{0, 0, 1, 1, 1, 0, 0}
	};
	
	public static int[][] charSmallC = {
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 1, 1, 1, 0, 0},
			{0, 0, 1, 0, 0, 0, 0},
			{0, 0, 1, 0, 0, 0, 0},
			{0, 0, 1, 1, 1, 0, 0}
	};
	
	public static int[][] charSmallD = {
			{0, 0, 0, 0, 1, 0, 0},
			{0, 0, 0, 0, 1, 0, 0},
			{0, 0, 0, 0, 1, 0, 0},
			{0, 0, 1, 1, 1, 0, 0},
			{0, 0, 1, 0, 1, 0, 0},
			{0, 0, 1, 0, 1, 0, 0},
			{0, 0, 1, 1, 1, 0, 0}
	};
	
	public static int[][] charSmallE = {
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 1, 1, 1, 0, 0},
			{0, 0, 1, 0, 1, 0, 0},
			{0, 0, 1, 1, 1, 0, 0},
			{0, 0, 1, 0, 0, 0, 0},
			{0, 0, 1, 1, 1, 0, 0}
	};
	
	public static int[][] charSmallF = {
			{0, 0, 0, 1, 1, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 1, 1, 1, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0}
	};
	
	public static int[][] charSmallG = {
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 1, 1, 1, 0, 0},
			{0, 0, 1, 0, 1, 0, 0},
			{0, 0, 1, 1, 1, 0, 0},
			{0, 0, 0, 0, 1, 0, 0},
			{0, 0, 1, 0, 1, 0, 0},
			{0, 0, 1, 1, 1, 0, 0}
	};
	
	public static int[][] charSmallH = {
			{0, 0, 1, 0, 0, 0, 0},
			{0, 0, 1, 0, 0, 0, 0},
			{0, 0, 1, 0, 0, 0, 0},
			{0, 0, 1, 0, 0, 0, 0},
			{0, 0, 1, 1, 1, 0, 0},
			{0, 0, 1, 0, 1, 0, 0},
			{0, 0, 1, 0, 1, 0, 0}
	};
	
	public static int[][] charSmallI = {
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0}
	};
	
	public static int[][] charSmallJ = {
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 1, 1, 0, 0, 0}
	};
	
	public static int[][] charSmallK = {
			{0, 0, 1, 0, 0, 0, 0},
			{0, 0, 1, 0, 0, 0, 0},
			{0, 0, 1, 0, 0, 0, 0},
			{0, 0, 1, 0, 1, 0, 0},
			{0, 0, 1, 1, 0, 0, 0},
			{0, 0, 1, 0, 1, 0, 0},
			{0, 0, 1, 0, 1, 0, 0}
	};
	
	public static int[][] charSmallL = {
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0}
	};
	
	public static int[][] charSmallM = {
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 1, 1, 0, 1, 1, 0},
			{0, 1, 0, 1, 0, 1, 0},
			{0, 1, 0, 1, 0, 1, 0},
			{0, 1, 0, 1, 0, 1, 0}
	};
	
	public static int[][] charSmallN = {
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 1, 0, 0, 0, 0},
			{0, 0, 1, 1, 1, 0, 0},
			{0, 0, 1, 0, 1, 0, 0},
			{0, 0, 1, 0, 1, 0, 0},
			{0, 0, 1, 0, 1, 0, 0}
	};
	
	public static int[][] charSmallO = {
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 1, 1, 1, 0, 0},
			{0, 0, 1, 0, 1, 0, 0},
			{0, 0, 1, 0, 1, 0, 0},
			{0, 0, 1, 1, 1, 0, 0}
	};
	
	public static int[][] charSmallP = {
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 1, 1, 1, 0, 0},
			{0, 0, 1, 0, 1, 0, 0},
			{0, 0, 1, 1, 1, 0, 0},
			{0, 0, 1, 0, 0, 0, 0},
			{0, 0, 1, 0, 0, 0, 0}
	};
	
	public static int[][] charSmallQ = {
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 1, 1, 1, 0, 0},
			{0, 0, 1, 0, 1, 0, 0},
			{0, 0, 1, 1, 1, 0, 0},
			{0, 0, 0, 0, 1, 0, 0},
			{0, 0, 0, 0, 1, 0, 0}
	};
	
	public static int[][] charSmallR = {
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 1, 1, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0}
	};
	
	public static int[][] charSmallS = {
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 1, 1, 1, 0, 0},
			{0, 0, 1, 0, 0, 0, 0},
			{0, 0, 1, 1, 1, 0, 0},
			{0, 0, 0, 0, 1, 0, 0},
			{0, 0, 1, 1, 1, 0, 0}
	};
	
	public static int[][] charSmallT = {
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 1, 1, 1, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 1, 1, 0, 0}
	};
	
	public static int[][] charSmallU = {
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 1, 0, 1, 0, 0},
			{0, 0, 1, 0, 1, 0, 0},
			{0, 0, 1, 0, 1, 0, 0},
			{0, 0, 1, 1, 1, 0, 0}
	};
	
	public static int[][] charSmallV = {
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 1, 0, 1, 0, 0},
			{0, 0, 1, 0, 1, 0, 0},
			{0, 0, 1, 0, 1, 0, 0},
			{0, 0, 0, 1, 0, 0, 0}
	};
	
	public static int[][] charSmallW = {
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 1, 0, 1, 0, 1, 0},
			{0, 1, 0, 1, 0, 1, 0},
			{0, 1, 0, 1, 0, 1, 0},
			{0, 0, 1, 0, 1, 0, 0}
	};
	
	public static int[][] charSmallX = {
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 1, 0, 1, 0, 0},
			{0, 0, 1, 0, 1, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 1, 0, 1, 0, 0},
			{0, 0, 1, 0, 1, 0, 0}
	};
	
	public static int[][] charSmallY = {
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 1, 0, 1, 0, 0},
			{0, 0, 1, 0, 1, 0, 0},
			{0, 0, 0, 1, 1, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 1, 0, 0, 0, 0}
	};
	
	public static int[][] charSmallZ = {
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 1, 1, 1, 1, 0},
			{0, 0, 0, 0, 1, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 1, 1, 1, 1, 0}
	};
	
	public static int[][] charSmall� = {
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 1, 1, 1, 0, 0},
			{0, 0, 1, 0, 1, 0, 0},
			{0, 0, 1, 0, 1, 0, 0},
			{0, 0, 1, 1, 1, 1, 0}
	};
	
	
	public static int[][] charSmall� = {
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 1, 0, 1, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 1, 1, 1, 0, 0},
			{0, 0, 1, 0, 1, 0, 0},
			{0, 0, 1, 0, 1, 0, 0},
			{0, 0, 1, 1, 1, 1, 0}
	};
	
	public static int[][] charSmall� = {
			{0, 0, 1, 0, 1, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 1, 1, 1, 0, 0},
			{0, 0, 1, 0, 1, 0, 0},
			{0, 0, 1, 0, 1, 0, 0},
			{0, 0, 1, 1, 1, 0, 0}
	};
	public static int[][] char1 = {
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 1, 1, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 1, 1, 1, 0, 0}
	};

	public static int[][] char2 = {
			{0, 1, 1, 1, 1, 0, 0},
			{0, 0, 0, 0, 1, 0, 0},
			{0, 0, 0, 0, 1, 0, 0},
			{0, 1, 1, 1, 1, 0, 0},
			{0, 1, 0, 0, 0, 0, 0},
			{0, 1, 0, 0, 0, 0, 0},
			{0, 1, 1, 1, 1, 0, 0}
	};

	public static int[][] char3 = {
			{0, 1, 1, 1, 1, 0, 0},
			{0, 0, 0, 0, 1, 0, 0},
			{0, 0, 0, 0, 1, 0, 0},
			{0, 1, 1, 1, 1, 0, 0},
			{0, 0, 0, 0, 1, 0, 0},
			{0, 0, 0, 0, 1, 0, 0},
			{0, 1, 1, 1, 1, 0, 0}
	};

	public static int[][] char4 = {
			{0, 1, 0, 0, 1, 0, 0},
			{0, 1, 0, 0, 1, 0, 0},
			{0, 1, 0, 0, 1, 0, 0},
			{0, 1, 1, 1, 1, 0, 0},
			{0, 0, 0, 0, 1, 0, 0},
			{0, 0, 0, 0, 1, 0, 0},
			{0, 0, 0, 0, 1, 0, 0}
	};

	public static int[][] char5 = {
			{0, 1, 1, 1, 1, 0, 0},
			{0, 1, 0, 0, 0, 0, 0},
			{0, 1, 0, 0, 0, 0, 0},
			{0, 1, 1, 1, 1, 0, 0},
			{0, 0, 0, 0, 1, 0, 0},
			{0, 0, 0, 0, 1, 0, 0},
			{0, 1, 1, 1, 1, 0, 0}
	};

	public static int[][] char6 = {
			{0, 1, 1, 1, 1, 0, 0},
			{0, 1, 0, 0, 0, 0, 0},
			{0, 1, 0, 0, 0, 0, 0},
			{0, 1, 1, 1, 1, 0, 0},
			{0, 1, 0, 0, 1, 0, 0},
			{0, 1, 0, 0, 1, 0, 0},
			{0, 1, 1, 1, 1, 0, 0}
	};

	public static int[][] char7 = {
			{0, 1, 1, 1, 1, 0, 0},
			{0, 0, 0, 0, 1, 0, 0},
			{0, 0, 0, 0, 1, 0, 0},
			{0, 0, 0, 0, 1, 0, 0},
			{0, 0, 0, 0, 1, 0, 0},
			{0, 0, 0, 0, 1, 0, 0},
			{0, 0, 0, 0, 1, 0, 0}
	};

	public static int[][] char8 = {
			{0, 1, 1, 1, 1, 0, 0},
			{0, 1, 0, 0, 1, 0, 0},
			{0, 1, 0, 0, 1, 0, 0},
			{0, 1, 1, 1, 1, 0, 0},
			{0, 1, 0, 0, 1, 0, 0},
			{0, 1, 0, 0, 1, 0, 0},
			{0, 1, 1, 1, 1, 0, 0}
	};

	public static int[][] char9 = {
			{0, 1, 1, 1, 1, 0, 0},
			{0, 1, 0, 0, 1, 0, 0},
			{0, 1, 0, 0, 1, 0, 0},
			{0, 1, 1, 1, 1, 0, 0},
			{0, 0, 0, 0, 1, 0, 0},
			{0, 0, 0, 0, 1, 0, 0},
			{0, 0, 0, 0, 1, 0, 0}
	};

	public static int[][] char0 = {
			{0, 0, 1, 1, 0, 0, 0},
			{0, 1, 0, 0, 1, 0, 0},
			{0, 1, 0, 0, 1, 0, 0},
			{0, 1, 0, 0, 1, 0, 0},
			{0, 1, 0, 0, 1, 0, 0},
			{0, 1, 0, 0, 1, 0, 0},
			{0, 0, 1, 1, 0, 0, 0}
	};

	public static int[][] PLUS = {
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 1, 1, 1, 1, 1, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0}
	};

	public static int[][] MINUS = {
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 1, 1, 1, 1, 1, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0}
	};

	public static int[][] ASTERISK = {
			{0, 0, 0, 1, 0, 0, 0},
			{0, 1, 0, 1, 0, 1, 0},
			{0, 0, 1, 1, 1, 0, 0},
			{1, 1, 1, 1, 1, 1, 1},
			{0, 0, 1, 1, 1, 0, 0},
			{0, 1, 0, 1, 0, 1, 0},
			{0, 0, 0, 1, 0, 0, 0}
	};

	public static int[][] EQUALS = {
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 1, 1, 1, 1, 1, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 1, 1, 1, 1, 1, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0}
	};

	public static int[][] QUESTIONMARK = {
			{0, 0, 1, 1, 1, 0, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 0, 0, 0, 0, 1, 0},
			{0, 0, 0, 1, 1, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0}
	};

	public static int[][] ATSIGN = {
			{0, 1, 1, 1, 1, 1, 0},
			{0, 1, 0, 0, 0, 1, 0},
			{0, 1, 0, 1, 0, 1, 0},
			{0, 1, 0, 1, 0, 1, 0},
			{0, 1, 0, 1, 1, 1, 0},
			{0, 1, 0, 0, 0, 0, 0},
			{0, 1, 1, 1, 1, 1, 0}
	};

	public static int[][] STARTBRACKET = {
			{0, 0, 1, 1, 0, 0, 0},
			{0, 0, 1, 0, 0, 0, 0},
			{0, 0, 1, 0, 0, 0, 0},
			{0, 0, 1, 0, 0, 0, 0},
			{0, 0, 1, 0, 0, 0, 0},
			{0, 0, 1, 0, 0, 0, 0},
			{0, 0, 1, 1, 0, 0, 0}
	};

	public static int[][] ENDBRACKET = {
			{0, 0, 0, 1, 1, 0, 0},
			{0, 0, 0, 0, 1, 0, 0},
			{0, 0, 0, 0, 1, 0, 0},
			{0, 0, 0, 0, 1, 0, 0},
			{0, 0, 0, 0, 1, 0, 0},
			{0, 0, 0, 0, 1, 0, 0},
			{0, 0, 0, 1, 1, 0, 0}
	};

	public static int[][] DOT = {
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0}
	};

	public static int[][] COMMA = {
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 1, 0, 0},
			{0, 0, 0, 1, 0, 0, 0}
	};

	public static int[][] SEMICOLON = {
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 1, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 1, 0, 0},
			{0, 0, 0, 1, 0, 0, 0}
	};

	public static int[][] SLASH = {
			{0, 0, 0, 0, 0, 0, 1},
			{0, 0, 0, 0, 0, 1, 0},
			{0, 0, 0, 0, 1, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 1, 0, 0, 0, 0},
			{0, 1, 0, 0, 0, 0, 0},
			{1, 0, 0, 0, 0, 0, 0}
	};

	public static int[][] AMPERSAND = {
			{0, 0, 1, 1, 0, 0, 0},
			{0, 1, 0, 0, 1, 0, 0},
			{0, 1, 0, 0, 1, 0, 0},
			{0, 0, 1, 1, 0, 0, 0},
			{0, 1, 0, 0, 1, 1, 0},
			{0, 1, 0, 0, 1, 0, 0},
			{0, 0, 1, 1, 0, 1, 0}
	};

	public static int[][] PERCENT = {
			{0, 1, 0, 0, 0, 1, 0},
			{1, 1, 1, 0, 0, 1, 0},
			{0, 1, 0, 0, 1, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 1, 0, 0, 1, 0},
			{0, 1, 0, 0, 1, 1, 1},
			{0, 1, 0, 0, 0, 1, 0}
	};

	public static int[][] BACKSLASH = {
			{1, 0, 0, 0, 0, 0, 0},
			{0, 1, 0, 0, 0, 0, 0},
			{0, 0, 1, 0, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 0, 1, 0, 0},
			{0, 0, 0, 0, 0, 1, 0},
			{0, 0, 0, 0, 0, 0, 1}
	};

	public static int[][] SPACE = {
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0}
	};
	
	public static int[][] SINGLEQUOTE = {
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0}
	};
	
	public static int[][] DOUBLEQUOTE = {
			{0, 0, 1, 0, 1, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0}
	};
	
	public static int[][] EXCLAMATION = {
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0}
	};
	
	public static int[][] STARTBRACKETCURLY = {
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 1, 0, 0, 0, 0},
			{0, 0, 1, 0, 0, 0, 0},
			{0, 1, 1, 0, 0, 0, 0},
			{0, 0, 1, 0, 0, 0, 0},
			{0, 0, 1, 0, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0}
	};

	public static int[][] ENDBRACKETCURLY = {
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 0, 1, 0, 0},
			{0, 0, 0, 0, 1, 0, 0},
			{0, 0, 0, 0, 1, 1, 0},
			{0, 0, 0, 0, 1, 0, 0},
			{0, 0, 0, 0, 1, 0, 0},
			{0, 0, 0, 1, 0, 0, 0}
	};
	
	public static int[][] ENDPARENTHESES = {
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 0, 1, 0, 0},
			{0, 0, 0, 0, 1, 0, 0},
			{0, 0, 0, 0, 1, 0, 0},
			{0, 0, 0, 0, 1, 0, 0},
			{0, 0, 0, 0, 1, 0, 0},
			{0, 0, 0, 1, 0, 0, 0}
	};
	
	public static int[][] STARTPARENTHESES = {
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 1, 0, 0, 0, 0},
			{0, 0, 1, 0, 0, 0, 0},
			{0, 0, 1, 0, 0, 0, 0},
			{0, 0, 1, 0, 0, 0, 0},
			{0, 0, 1, 0, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0}
	};
	
	public static int[][] EUROSIGN = {
			{0, 0, 0, 1, 1, 0, 0},
			{0, 0, 1, 1, 0, 0, 0},
			{0, 1, 0, 0, 0, 0, 0},
			{0, 1, 1, 1, 1, 0, 0},
			{0, 1, 0, 0, 0, 0, 0},
			{0, 0, 1, 1, 0, 0, 0},
			{0, 0, 0, 1, 1, 0, 0}
	};
	
	public static int[][] DOLLARSIGN = {
			{0, 0, 1, 1, 1, 0, 0},
			{0, 1, 0, 1, 0, 1, 0},
			{0, 1, 0, 1, 0, 0, 0},
			{0, 0, 1, 1, 1, 0, 0},
			{0, 0, 0, 1, 0, 1, 0},
			{0, 1, 0, 1, 0, 1, 0},
			{0, 0, 1, 1, 1, 0, 0}
	};
	
	public static int[][] POUNDSIGN = {
			{0, 0, 0, 1, 1, 0, 0},
			{0, 0, 1, 0, 0, 0, 0},
			{0, 0, 1, 0, 0, 0, 0},
			{0, 0, 1, 1, 0, 0, 0},
			{0, 0, 1, 0, 0, 0, 0},
			{0, 0, 1, 0, 0, 0, 0},
			{0, 0, 1, 1, 1, 0, 0}
	};
	
	public static int[][] POLE = {
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0}
	};
	
	public static int[][] BIGGERTHAN = {
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 1, 0, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 0, 1, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 1, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0}
	};
	
	public static int[][] SMALLERTHAN= {
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 1, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 1, 0, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0},
			{0, 0, 0, 0, 1, 0, 0},
			{0, 0, 0, 0, 0, 0, 0}
	};
	
	public static int[][] HASHTAG = {
			{0, 0, 1, 0, 1, 0, 0},
			{0, 0, 1, 0, 1, 0, 0},
			{1, 1, 1, 1, 1, 1, 1},
			{0, 0, 1, 0, 1, 0, 0},
			{1, 1, 1, 1, 1, 1, 1},
			{0, 0, 1, 0, 1, 0, 0},
			{0, 0, 1, 0, 1, 0, 0}
	};
	
	public static int[][] UNDERLINE= {
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0},
			{0, 1, 1, 1, 1, 1, 0}
	};
	
	public static int[][] UNKNOWN = {
			{1, 1, 1, 1, 1, 1, 1},
			{1, 0, 0, 0, 0, 0, 1},
			{1, 0, 0, 0, 0, 0, 1},
			{1, 0, 0, 0, 0, 0, 1},
			{1, 0, 0, 0, 0, 0, 1},
			{1, 0, 0, 0, 0, 0, 1},
			{1, 1, 1, 1, 1, 1, 1}
	};
}