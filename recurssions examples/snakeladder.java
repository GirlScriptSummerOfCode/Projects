package recurssion;

import java.util.Scanner;

public class snakeladder {
	public static boolean prime(int n) {
		for (int i = 2; i * i <= n; ++i) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
		int n=20;
		int[] arr = new int[n + 1];
		int count = 2, i = 0;
		while (count <= n) {
			if (prime(count) == true) {
				arr[i] = count;
				++i;
			}
			++count;
		}
		scan.close();
		int counter = 0;
		for (int val : arr) {
			if (val != 0) {
//				System.out.print(val + "\t");
				++counter;
			}
		}
//		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		int[] list = new int[n + 1];
		for (i = 0; i < counter / 2; i++) {
			if (i % 2 == 0)
				list[arr[i]] = arr[counter - i - 1];
			else {
				list[arr[counter - i - 1]] = arr[i];
			}
		}

		
		int[] arr1={1,1,1,1,2,4};
	System.out.println(	bm(0, 10, list, arr1, 0));
	}

	public static boolean bm(int curr, int end, int[] snlarray, int[] movesarray, int move) {
		if (curr == end) {
//			System.out.println("true");
			return true;

		}
		boolean c=false;
		if(move>movesarray.length)
		{
			return false;
		}

		if (snlarray[curr] != 0) {
			c=bm(snlarray[curr], end, snlarray, movesarray, move);
		}
		
			if(curr+movesarray[move]<=end)
			
				c=bm(curr+movesarray[move], end, snlarray, movesarray, move+1);
			
		
		return c;
	}

}
