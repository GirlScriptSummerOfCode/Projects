package recurssion;
import java.util.Scanner;
public class hanoi {

	public static void main(String[] args) {
	    Scanner scan= new Scanner(System.in);
	    int n = scan.nextInt();
		han(n, "T1","T3","T2");
		System.out.println(count);
	}
public static int count=0;
	private static void han(int n, String from, String aux, String to) {
		if (n == 0) {
			return;
		}

		han(n - 1, from, to, aux);
		System.out.println("Move " + (n) + "th disc from " + from + " to " + to);
		++count;
		han(n - 1, aux, from, to);

	}

}

