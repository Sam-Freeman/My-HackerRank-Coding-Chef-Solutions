package me.samfreeman.july15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;

public class Optiver_RainingDeltas {

	static BufferedReader in;
	static PrintStream out;

	static int boardHeight = 0;
	static int boardWidth = 0;

	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintStream(System.out);
		complete();
		out.close();
	}

	static void complete() throws IOException {
		int collected = 0;
		int currentTick = 0;

		String l = in.readLine();
		boardHeight = Integer.parseInt(l.split(" ")[1]) + 1;
		boardWidth = Integer.parseInt(l.split(" ")[0]);
		int N = Integer.parseInt(in.readLine());
		ArrayList<Delta> deltas = new ArrayList<Delta>();
		ArrayList<Delta> visibleDeltas = new ArrayList<Delta>();

		int boxX = boardWidth / 2;

		for (int s = 0; s < N; s++) {
			// collect all deltas;
			currentTick++;
			String[] s_deltaX = in.readLine().split(" ");
			if (!s_deltaX[0].equals("-")) {
				for (int a = 0; a < s_deltaX.length; a++) {
					deltas.add(new Delta(Integer.parseInt(s_deltaX[a]), -currentTick));
				}
			}
		}

		currentTick += boardHeight; // add to make 'game loop'

		// [y][x]

		int[][] visibleBoard = new int[boardHeight][boardWidth]; // includes
		int closestX = 0; // ground

		while (currentTick-- > 0) {
			// game loop
			clearCurrentBoard(visibleBoard);
			visibleDeltas.clear();
			for (Delta d : deltas) {
				d.checkVisible();
				if (d.isVisible) {
					visibleBoard[d.yD][d.xD] = 1;
					visibleDeltas.add(d);
				}

				d.tick();

				if (visibleDeltas.contains(d) && !d.isVisible) {
					visibleDeltas.remove(d);
				}

			}

			int closestDistanceY = boardHeight;
			int closestDistanceX = boardWidth;
			for (Delta dd : visibleDeltas) {

				int xDistance = Math.abs(boxX - dd.xD);
				int yDistance = boardHeight - dd.yD;

				if (yDistance < closestDistanceY) {
					closestDistanceY = yDistance;
					closestDistanceX = xDistance;
					closestX = dd.xD;
				} else if (yDistance == closestDistanceX) {
					if (xDistance < closestDistanceX) {
						closestDistanceX = xDistance;
						closestX = dd.xD;
					}
				}

			}

			// move box
			if (closestX > boxX)
				boxX++;
			else if (closestX < boxX)
				boxX--;
			visibleBoard[boardHeight - 1][boxX] = 4;

			for (Delta vd : visibleDeltas) {
				if (vd.yD == boardHeight && vd.xD == boxX)
					collected++;
			}

			System.out.println("---------- Tick: " + (boardHeight + N - currentTick) + " ----------");

			for (int[] r : visibleBoard) {
				System.out.println(Arrays.toString(r));
			}

			System.out.println("X Close: " + closestX + " Box X: " + boxX);
			System.out.println("Current Score: " + collected);
		}
		System.out.println("Final Score: " + collected);
	}

	static void clearCurrentBoard(int[][] board) {
		for (int[] someRow : board) {
			Arrays.fill(someRow, 0);
		}
	}

	static class Delta {
		int xD;
		int yD;
		boolean isVisible = false;

		public Delta(int x, int startY) {
			this.xD = x;
			this.yD = startY;
		}

		void tick() {
			yD++;
		}

		void checkVisible() {
			if (yD >= 0 && yD < boardHeight)
				isVisible = true;
			else
				isVisible = false;
		}

	}

}
