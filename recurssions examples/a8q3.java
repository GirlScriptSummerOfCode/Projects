package recurssion;

public class a8q3 {
	
	public static String getcode(char key) {
		if (key == '1') {
			return "abc";
		}
		if (key == '2') {
			return "def";
		}
		if (key == '3') {
			return "ghi";
		}
		if (key == '4') {
			return "jkl";
		}
		if (key == '5') {
			return "mno";
		}
		if (key == '6') {
			return "pqrs";
		}
		if (key == '7') {
			return "tuv";
		}
		if (key == '8') {
			return "wx";
		}
		if (key == '9') {
			return "yx";
		}
		if (key == '0') {
			return ".,";
		}
		return "null";

	}

	public static void main(String[] args) {
		print("628","");

	}

	private static void print(String que, String ans) {
		if (que.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch= que.charAt(0);
		String code=getcode(ch);
		for(int i=0;i<code.length();++i)
		{
			print(que.substring(1), code.charAt(i)+ans);
		}

	}

}
