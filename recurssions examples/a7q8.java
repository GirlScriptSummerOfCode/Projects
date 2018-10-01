package recurssion;
public class a7q8 {
	public static String repl(String que, String find) {
		if (que.length() < find.length()) {
			return que;
		}
		char ch=que.charAt(0);
		String rr = repl(que.substring(1), find);

rr=ch+rr;
		if (rr.substring(0, 2).equals(find))
			rr = "bye" + rr.substring(2);

		return rr;
	}

	public static void main(String[] args) {
		// Scanner scan = new Scanner(System.in);
		// String s = scan.next();
		System.out.println(repl("hinamehi", "hi"));
	}

}
