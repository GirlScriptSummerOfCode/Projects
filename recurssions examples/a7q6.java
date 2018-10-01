package recurssion;

public class a7q6 {

	public static void main(String[] args) {
		seperate_duplicate("hello", " "); // taken space because at 1st itration
											// ans.length-1 becomes out of bonds
	}

	private static void seperate_duplicate(String que, String ans) {
		if (que.length() == 0) {
			System.out.println(ans);
			return;
		}

		char ch = que.charAt(0);
		if (ch != ans.charAt(ans.length() - 1)) // here
			ans = ans + ch;
		seperate_duplicate(que.substring(1), ans);

	}

}
