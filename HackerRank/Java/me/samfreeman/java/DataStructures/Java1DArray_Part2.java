package me.samfreeman.java.DataStructures;

import java.util.Scanner;

public class Java1DArray_Part2 {
	public static boolean canWin(int leap, int[] game, int pos) {
		if (pos < 0 || game[pos] == 1)
			return false;
		if (pos == game.length - 1 || pos + leap > game.length - 1)
			return true;

		game[pos] = 1; // Visited

		return canWin(leap, game, pos + 1) || canWin(leap, game, pos - 1) || canWin(leap, game, pos + leap);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();
		while (q-- > 0) {
			int n = scan.nextInt();
			int leap = scan.nextInt();

			int[] game = new int[n];
			for (int i = 0; i < n; i++) {
				game[i] = scan.nextInt();
			}

			System.out.println((canWin(leap, game, 0)) ? "YES" : "NO");
		}
		scan.close();
	}
}