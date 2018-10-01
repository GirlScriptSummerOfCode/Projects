package recurssion;

public class nknights {

	public static void main(String[] args) {
		boolean[][] board = new boolean[3][3];
		Nknights(1, board, " ", 0);
	}

	private static void Nknights(int cellno, boolean[][] board, String psf, int kpsf) {
		if (kpsf == board.length) {
			++count;
			System.out.println(count + psf);
		}
		for (int i = cellno; i <= board.length * board.length; ++i) {
			int cr = (i - 1) / board.length;
			int cc = (i - 1) % board.length;
			if (isitsafetoplace(cr, cc, board)) {
				board[cr][cc] = true;
				// call
				Nknights(i + 1, board, psf + "[" + cr + " " + cc + "] ", kpsf + 1);
				board[cr][cc] = false;

			}
		}
	}

	public static int count = 0;

	private static boolean isitsafetoplace(int cr, int cc, boolean[][] board) {

		if (cc + 1 < board.length && cr - 2 >= 0 && board[cr - 2][cc + 1] == true)
			return false;

		if (cc - 1 >= 0 && cr - 2 >= 0 && board[cr - 2][cc - 1] == true)
			return false;

		if (cc + 2 < board.length && cr - 1 >= 0 && board[cr - 1][cc + 2] == true)
			return false;

		if (cc - 2 >= 0 && cr - 1 >= 0 && board[cr - 1][cc - 2] == true)
			return false;

		return true;
	}

}
