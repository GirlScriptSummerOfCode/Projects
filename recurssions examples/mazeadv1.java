package recurssion;

import java.util.ArrayList;

public class mazeadv1 {

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

		rr1 = maz(cr + 1, cc, er, ec);
		for (String rs : rr1) {
			String s = 'v' + rs;
			mr.add(s);
		}

		rr2 = maz(cr, cc + 1, er, ec);
		for (String rs : rr2) {
			String s = 'h' + rs;
			mr.add(s);
		}

		if (cc == cr || cc + cr == ec) {
			rrd1 = maz(cr + 1, cc + 1, er, ec);
			for (String rs : rrd1) {
				String s = "d" + rs;
				mr.add(s);
			}
		}

		return mr;

	}

	public static void main(String[] args) {
		ArrayList<String> mr = maz(0, 0, 2, 2);
		System.out.println(mr);
		System.out.println(mr.size());
	}

}
