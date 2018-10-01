package recurssion;

import java.util.Scanner;

public class pattern {

	public static void pattern(int row) {

		if (row == 0) {
			return;
		}
		for (int i = 0; i < row; ++i)
			System.out.print("*\t");
		System.out.println();
		pattern(row - 1);
	
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		pattern(scan.nextInt());

	}

}
