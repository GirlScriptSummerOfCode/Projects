package recurssion;

public class a7q3 {

	public static void main(String[] args) {
		System.out.println(check("anand", "dnana"));
	}

	private static boolean check(String string1, String string2) {
		if (string1.length() != string2.length()) {
			return false;
		}
		if (string2.length() == 1) {
			if (string1.charAt(0) == string2.charAt(0))
				return true;
			else
				return false;
		}
		boolean ans = false;
		if (string1.charAt(0) != string2.charAt(string2.length() - 1))
			return ans;
		else
			ans = check(string1.substring(1), string2.substring(0, (string2.length() - 1)));
		return ans;

	}

}
