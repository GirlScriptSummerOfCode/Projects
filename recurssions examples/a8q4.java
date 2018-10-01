package recurssion;

import java.util.ArrayList;

public class a8q4 {

	public static void main(String[] args) {
//		permu("abc", "", 0);
		ArrayList<String> s1 = permu1("abc");
		System.out.println(s1);
	}

	private static ArrayList<String> permu1(String que) {

		if (que.length() == 0) {
			ArrayList<String> blank = new ArrayList<>();
			blank.add("");
			return blank;
		}
		char ch=que.charAt(0);
		String roq=que.substring(1);
		ArrayList<String> rr = permu1(roq);
		ArrayList<String> mr = new ArrayList<>();

		for(String s:rr )
		{
			for(int i=0;i<=s.length();++i){
				  String ms=s.substring(0, i)+ch+s.substring(i);

			mr.add(ms);
			}
		}
	return mr;

	}

	private static void permu(String que, String ans, int count) {
		if (que.length() == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < que.length(); ++i) {
			char ch = que.charAt(i);
			permu(que.substring(0, i) + que.substring(i + 1), ans + ch, count);
		}

	}

}
