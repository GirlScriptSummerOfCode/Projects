package recurssion;
public class lexico {
	public static void main(String[] args) {
		printLexico(1, 1000);
	}
	public static void printLexico(int num, int max) {
		System.out.println(num);
		for (int i = 0; i <= 9; i++) {
			if (num * 10 + i <= max) {
				printLexico(num * 10 + i, max);
			}
		}
		if (num < 9) {
			printLexico(num + 1, max);
		}
	}
}