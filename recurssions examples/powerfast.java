package recurssion;

public class powerfast {
	public static int power(int x, int y) {
		if (y == 0)
			return 1;
		int k = power(x, y / 2);
		if (y % 2 == 0) {
			return k * k;
		} else {

			return k * k * x;
		}
	}

	public static void main(String[] args) {

		System.out.println(power(3, 5));
	}

}
