package recurssion;

import java.util.ArrayList;

public class queen {

	public static ArrayList<String> maz(int cr, int cc, int er, int ec) {
		if ((cr == er) && (cc == ec)) {
			ArrayList<String> blank = new ArrayList<>();
			blank.add("");
			return blank;
		}
		if ((cr > er) || (cc > ec)) {
			ArrayList<String> blank = new ArrayList<>();
			return blank;
		}

		ArrayList<String> mr = new ArrayList<>();
		ArrayList<String> rr1, rr2, rrd1;

		for (int i = 1; i <=(er); ++i) {
			rr1 = maz(cr + i, cc, er, ec);
			for (String rs : rr1) {
				String s = "v" + i + rs;
				mr.add(s);
			}
		}

		for (int j = 1; j <=ec; ++j) {
			rr2 = maz(cr, cc + j, er, ec);
			for (String rs : rr2) {
				String s = "h" + j + rs;
				mr.add(s);
			}

		}
		for (int i = 1; (i<=er&&i<=ec); ++i) {
			rrd1 = maz(cr + i, cc + i, er, ec);
			for (String rs : rrd1) {
				String s = "d" + i + rs;
				mr.add(s);
			}
		}

		return mr;

	}

	public static void main(String[] args) {
		System.out.println(maz(0, 0, 2, 2).size());
		System.out.println(maz(0, 0, 2, 2));

	}

}
