package recurssion;

public class a7q11 {

	public static void main(String[] args) {
		System.out.println(count("aaabaaaad", "aaa"));

		count1("aaaabaaad", "aaa", 0);
	}

	private static int count(String que, String find) {
		if (que.length() < find.length()) {
			return 0;
		}
		int counter = count(que.substring(1), find);
		String poq = que.substring(0, 3);
		if (poq.equals(find))
			++counter;
		return counter;
	}

	private static void count1(String que, String find, int counter) {
		if (que.length() < find.length()) {
			System.out.println(counter);
			return;
		}

		String poq = que.substring(0, 3);
		if (poq.equals(find)) {
			++counter;
			que = "xxx" + que.substring(3);
		}
		count1(que.substring(1), find, counter);

	}

}
