package recurssion;

public class a6q4 {

	public static int print(int i, int j) {
		if (i == -1) {
			return 1;
		}
		if (j >= i) {
			print(i - 1, 0);
			System.out.println();
			return 1;
		}
		if (j < i) {

			int n = print(i, j + 1);
			System.out.print(n);
			n = (n * (i - j) )/ (j + 1);
			return n;
		}
		return 1;
	}

	public static void printfor(int n) {
		if (n == -1)
			return;
		printfor(n - 1);
		System.out.println();
		int num = 1;
		for (int j = 0; j <= n; ++j) {
			System.out.print(num + "\t");
			num = num * (n - j) / (j + 1);
		}
	}

	public static void main(String[] args) {

		print(4, 0);
		// printfor(6);
	}

}
