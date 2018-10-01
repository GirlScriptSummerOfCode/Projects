package recurssion;

import java.util.ArrayList;

public class maze {

	public static ArrayList<String> maz(int cr, int cc, int er, int ec) {
		if ((cr == er) && (cc == ec)) {
			ArrayList<String> blank = new ArrayList<>();
			blank.add("");
			return blank;
		}

		ArrayList<String> mr = new ArrayList<>();
		ArrayList<String> rr1 , rr2;
		if (cr < er) {
			rr1 = maz(cr + 1, cc, er, ec);
			for (String rs : rr1) {
				String s = 'v' + rs;
				mr.add(s);
			}
		}

		if (cc < ec) {
			rr2 = maz(cr, cc + 1, er, ec);
			for (String rs : rr2) {
				String s = 'h' + rs;
				mr.add(s);
			}
		}

		
		
		    return mr;

	}

	public static void main(String[] args) {
		ArrayList<String> mr=maz(0,0,2,2);
		System.out.println(mr);
	}

}
