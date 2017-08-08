package me.samfreeman.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class MinimumDistances {
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
		String[] A = in.readLine().split(" ");

		int[] ar = new int[n];
		for (int i = 0; i < n; i++)
			ar[i] = Integer.parseInt(A[i]);

		int sDist = n;
		boolean hc = false;
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				if (ar[i] == ar[j]) {
					sDist = (Math.abs(i - j) < sDist) ? Math.abs(i - j) : sDist;
					hc = true;
				}
			}
		}
		out.println((hc) ? sDist : -1);
	}
}
