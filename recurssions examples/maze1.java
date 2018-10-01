package recurssion;

public class maze1 {

	public static void maze(int cr, int cc, int er, int ec, String ans) {
		if (cr == er && cc == ec) {
			System.out.println(ans);
			return;
		}
		if (cr > er || cc > ec) {
			return;
		}
		maze(cr + 1, cc, er, ec, ans + "v");
		maze(cr , cc+1, er, ec, ans + "h");
		maze(cr + 1, cc+1, er, ec, ans + "d");
	}

	public static void main(String[] args) {

	maze(0, 0, 2, 2, "");
	}

}
