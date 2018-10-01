package recurssion;

public class nQueen {
	public static void pnq(boolean[][] board, int row, String ans) {
		if (row == board.length) {
			System.out.println(ans);
			return;
		}

		for (int col = 0; col < board[0].length; ++col) {
			if (safe(board, row, col) == true) {
				board[row][col] = true;
				pnq(board, row + 1, ans + "[" + row + col + "]");
				board[row][col] = false;
			}
		}
	}

	private static boolean safe(boolean[][] board, int row, int col) {

		int i = row, j = col;
		while (i > 0 && j > 0) {
			i--;
			j--;
			if (board[i][j] == true) {
				return false;
			}
		}
		i = row;
		j = col;
		while (i > 0 && j < board[0].length - 1) {
			i--;
			j++;
			if (board[i][j] == true) {
				return false;
			}
		}
		i = row;
		while (i > 0) {
			i--;

			if (board[i][col] == true) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		boolean[][] board = new boolean[5][5];
		pnq(board, 0, "");

	}

}
