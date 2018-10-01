package recurssion;

public class permuadv {
	public static void printpermu(String qst, String ans) {
		if (qst.length() == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < qst.length(); ++i) {
			char ch = qst.charAt(i);
System.out.println("hi "+ch);
			String roq = qst.substring(0, i) + qst.substring(i + 1);
			printpermu(roq, ans + ch);
			System.out.println("bye "+ch);
		}
	}

	public static void main(String[] args) {
		printpermu("abc", "");
	}

}
