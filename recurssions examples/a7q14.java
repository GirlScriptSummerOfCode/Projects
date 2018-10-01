package recurssion;

import java.util.Scanner;

public class a7q14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		print(str, "", false);
	}

	private static void print(String que, String ans, boolean b) {
		if (ans.length() != 0 && b == false) {
			System.out.println(ans.substring(1));
			return;
		}

		char ch = que.charAt(0);

		if (ch == '(')
			b = true;
		if (ch == ')')
			b = false;
		if (b == true) {
			ans += ch;
		}
		print(que.substring(1), ans, b);
	}

}
