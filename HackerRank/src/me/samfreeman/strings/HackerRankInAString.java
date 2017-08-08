package me.samfreeman.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class HackerRankInAString {
	static BufferedReader in;
	static PrintStream out;

	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintStream(System.out);
		complete();
		out.close();
	}

	static void complete() throws IOException {
		int n = Integer.parseInt(in.readLine());
		char[] hackerrank = "hackerrank".toCharArray();

		while (n-- > 0) {
			char[] s = in.readLine().toCharArray();

			boolean accomplished = false;
			int index = 0;
			for (int i = 0; i < s.length; i++) {
				if (s[i] == hackerrank[index]) {
					index++;
					if (index == hackerrank.length) {
						accomplished = true;
						break;
					}
				}
			}
			out.println((accomplished) ? "YES" : "NO");
		}

	}
}
