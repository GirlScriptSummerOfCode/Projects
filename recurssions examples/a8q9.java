package recurssion;

public class a8q9 {

	public static void permu(String que, String ans, String q) {
		if (que.length() == 0) {
			if(flag)
			System.out.println(ans);
			if (ans.equals(q))
				flag=true;
				return ;
		}

		for (int i = 0; i < que.length(); ++i) {
			char ch = que.charAt(i);
			String roq = que.substring(0, i) + que.substring(i + 1);
			permu(roq, ans + ch, q);
			
		}
	
	}
	static boolean flag=false;

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
