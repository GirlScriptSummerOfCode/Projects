package recurssion;

public class a7q7 {

	public static void main(String[] args) {
		shift("abxexdvxg", "", 'x');
	}

	private static void shift(String que, String ans, char c) {
		if (que.length() == 0) {
			System.out.println(ans);
			return;

		}
		char ch = que.charAt(0);
		if (ch == c)
			ans = ans + ch;
		else
			ans = ch + ans;
		shift(que.substring(1), ans, c);

	}

}
