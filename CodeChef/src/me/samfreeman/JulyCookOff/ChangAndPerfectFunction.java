package me.samfreeman.JulyCookOff;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.HashMap;

class ChangAndPerfectFunction {
	static BufferedReader in;
	static PrintStream out;

	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintStream(System.out);
		complete();
		out.close();

	}

	static void complete() throws IOException {
		String[] l = in.readLine().split(" ");
		int A = Integer.parseInt(l[0]);
		int B = Integer.parseInt(l[1]);

		int total = 0;

		int min = 3;
		int max = A * A + B;

		int test = (int) (Math.floor(Math.sqrt(max)) - Math.ceil(Math.sqrt(min)) + 1);

		HashMap<Integer, Integer> memo = new HashMap<Integer, Integer>();

		for (int x = 1; x <= A; x++) {
			for (int y = x + 1; y <= B; y++) {
				
				int ans = x * x + y;

				if (memo.containsKey(ans)) {
					total++;
				} else {
					int sq = (int) Math.sqrt(ans);
					if (sq * sq == ans) {
						memo.put(ans, sq);
						total++;
					}
				}
				if (total >= test) break;
			}
		}
		out.println(total);
	}
}
