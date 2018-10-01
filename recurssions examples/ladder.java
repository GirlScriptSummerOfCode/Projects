package recurssion;

import java.util.ArrayList;

public class ladder {

	public static void main(String[] args) {

		System.out.println(ladder1(0,10));
		System.out.println(ladder1(0,10).size());

	}

	public static ArrayList<String> ladder1(int curr, int end) {
		if (curr == end) {
			ArrayList<String> blank = new ArrayList<>();
			blank.add("");
			return blank;
		}
		ArrayList<String> mrdice = new ArrayList<>();
		ArrayList<String> mr = new ArrayList<>();
		for (int dice = 1; dice <= 6; ++dice) {
			if(dice+curr<=end){
			mrdice = ladder1(dice + curr, end);
			for (String ms : mrdice) {
				mr.add(dice+ms);
			}
		}
		}
		return mr;
	}
}
