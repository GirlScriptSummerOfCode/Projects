package recurssion;

import java.util.ArrayList;

public class mazeadv {

	public static ArrayList<String> maz(int cr, int cc, int er, int ec) {
		if ((cr == er) && (cc == ec)) {
			ArrayList<String> blank = new ArrayList<>();
			blank.add("");
			return blank;
		}

		ArrayList<String> mr = new ArrayList<>();
		ArrayList<String> rr1 , rr2,rrd1,rrd2;
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
		
		if(cc==cr&&cc<ec&&cr<er){
			rrd1 = maz(cr+1, cc + 1, er, ec);
			for (String rs : rrd1) {
				String s = "d1" + rs;
				mr.add(s);
			}
		}

		if(cc+cr==ec&&cc>0&&cr<er){
			rrd2 = maz(cr+1, cc - 1, er, ec);
			for (String rs : rrd2) {
				String s = "d2" + rs;
				mr.add(s);
			}
		}
		
		
		    return mr;

	}

	public static void main(String[] args) {
		ArrayList<String> mr=maz(0,0,2,2);
		System.out.println(mr);
		System.out.println(mr.size());
	}

}
