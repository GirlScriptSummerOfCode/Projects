package recurssion;

import java.util.ArrayList;

public class a8q6 {

	public static void main(String[] args) {
		int[] arr = { 1,  7, 3, 5 ,0};
		int target = 0;
		for (int val : arr)
			target += val;
		// ArrayList<String> ans = pair(arr, 0, 0, target);
		// System.out.println(ans);

		// printpair(arr, 0, 0, target, "");

		 System.out.println(countpair(arr, 0, 0, target));

//		count(arr, 0, 0, target);
//		System.out.println(count);

	}

	public static ArrayList<String> pair(int[] arr, int pos, int sum, int target) {
		if (sum > target / 2) {
			ArrayList<String> blank = new ArrayList<>();
			// blank = null;
			return blank;
		}
		if (2 * sum == target) {
			ArrayList<String> blank = new ArrayList<>();
			blank.add("");
			return blank;
		}
		ArrayList<String> rr = new ArrayList<>();

		for (int i = pos; i < arr.length; ++i) {
			rr = pair(arr, i + 1, sum + arr[i], target);

			rr.add("true");

		}
		return rr;
	}

	public static void printpair(int[] arr, int pos, int sum, int target, String ans) {
		if (sum > target / 2) {
			return;
		}
		if (2 * sum == target) {
			System.out.println("[" + ans + "]");
		}

		for (int i = pos; i < arr.length; ++i)
			printpair(arr, i + 1, sum + arr[i], target, ans + arr[i] + " ");

	}

	public static int countpair(int[] arr, int pos, int sum, int target) {
		if (sum > target / 2) {
			return 0;
		}
		if (2 * sum == target) {
			return 1;
		}
		int count = 0;
		for (int i = pos; i < arr.length; ++i)
			count += countpair(arr, i + 1, sum + arr[i], target);

		return count;
	}

	static int count;

	public static void count(int[] arr, int pos, int sum, int target) {
		if (sum > target / 2) {
			return;
		}
		if (2 * sum == target) {
			++count;
//			return;
		}
		for (int i = pos; i < arr.length; ++i)
			count(arr, i + 1, sum + arr[i], target);

		return;
	}

}
