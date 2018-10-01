package recurssion;

public class a8q10 {

	public static int permu(String que, String ans, String q) {
		if (que.length() == 0) {
			System.out.println(ans);
			if (ans.equals(q))
				return -1;
			return 1;
		}
		int n = -1;
		for (int i = 0; i < que.length(); ++i) {
			char ch = que.charAt(i);
			String roq = que.substring(0, i) + que.substring(i + 1);
			n = permu(roq, ans + ch, q);
			if (n == -1)
				break;
		}
		return n;
	}

	public static String sort(String str) {

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); ++i)
			sb.append(str.charAt(i));

		for (int i = 0; i < sb.length() - 1; ++i) {
			for (int j = 0; j < sb.length() - i - 1; ++j) {
				if (sb.charAt(j) > sb.charAt(j + 1)) {
					char ch = sb.charAt(j + 1);
					sb.setCharAt((j + 1), sb.charAt(j));
					sb.setCharAt(j, ch);
				}
			}
		}

		return sb.toString();

	}

	public static void main(String[] args) {

		String s = "string";
		String s1=sort(s);

		permu(s1, "", s);
	}

}
