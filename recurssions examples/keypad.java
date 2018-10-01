package recurssion;

import java.util.ArrayList;

public class keypad {

	public static void main(String[] args) {
		String s = "68";
		ArrayList<String> s1 = getkpc(s);
		System.out.println(s1);
	}

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

	public static ArrayList<String> getkpc(String s) {

		if (s.length() == 0) {
			ArrayList<String> blank = new ArrayList<>();
			blank.add(s);
			return blank;
		}

		String opt = getcode(s.charAt(0));
		String smaller = s.substring(1);
		ArrayList<String> rr = getkpc(smaller);

		ArrayList<String> mr = new ArrayList<>();
		for (String rs : rr) {
			for (int k = 0; k < opt.length(); ++k) {
				char ch = opt.charAt(k);
				String ms = ch + rs;
				mr.add(ms);

			}
		}
		return mr;
	}
}
