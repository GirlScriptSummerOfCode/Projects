package recurssion;

import java.util.Arrays;
import java.util.HashMap;

public class a8bq7 {

	public static void main(String[] args) {
		int n = 15;
		HashMap<Integer, Integer> ladder = new HashMap<>();
		int left = 2, right = 15;
		boolean[] arr = soe(n);
		
		while (left < right) {

			while (!arr[left]) {
				++left;
			}

			while (!arr[right]) {
				--right;
			}

			if (left < right) {
				ladder.put(left, right);
				++left;
				--right;
			}
		}

		ans(0, n, "", ladder);
	}

	public static boolean[] soe(int n) {
		boolean[] arr = new boolean[n + 1];
		Arrays.fill(arr, true);
		arr[0] = arr[1] = false;
		for (int i = 2; i * i <= n; ++i) {
			if (arr[i] == false) {
				continue;
			}

			for (int ja = 2; ja * i <= n; ++ja) {
				arr[ja * i] = false;
			}
		}
		return arr;
	}

	public static void ans(int curr, int end, String psf, HashMap<Integer, Integer> ladder) {

		if (end == curr) {
			System.out.println(psf);
		}
		if (end < curr) {
			return;
		}

		for (int i = 1; i < 7; ++i) {
			if (ladder.containsKey(curr)) {
				ans(ladder.get(curr), end, psf + "[L" + curr + "->" + ladder.get(curr) + "]", ladder);
			} else {
				ans(curr + i, end, psf + "[" + i + "]", ladder);
			}
		}

	}
}
