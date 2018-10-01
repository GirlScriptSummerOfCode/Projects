package recurssion;

public class a7q15 {

	public static void main(String[] args) {
		System.out.println(check("{a+(b+c)-[f*g]}", 0));
	}

	private static boolean check(String string, int count) {
		if (string.length() == 0) {
			if (count == 0)
				return true;
			else
				return false;
		}
		char ch = string.charAt(0);
		switch (ch) {
		case '{': {
			++count;
			break;
		}
		case '(': {
			++count;
			break;
		}
		case '[': {
			++count;
			break;
		}
		case '}': {
			--count;
			break;
		}
		case ']': {
			--count;
			break;
		}
		case ')': {
			--count;
			break;

		}
		}
		
		boolean ans=check(string.substring(1), count);
		return ans;
	}

}
