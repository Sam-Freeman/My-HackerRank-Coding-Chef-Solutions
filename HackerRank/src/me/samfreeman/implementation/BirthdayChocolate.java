package me.samfreeman.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class BirthdayChocolate {
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
		String[] s = in.readLine().split(" ");
		String[] dm = in.readLine().split(" ");

		int[] si = new int[n];
		for (int i = 0; i < n; i++)
			si[i] = Integer.parseInt(s[i]);

		int d = Integer.parseInt(dm[0]);
		int m = Integer.parseInt(dm[1]);

		int ways = 0;
		for (int i = 0; i <= n - m; i++) {
			int sum = 0;
			for (int j = i; j < i + m; j++) {
				sum += si[j];
				if (sum > d)
					break;
			}
			if (sum == d)
				ways++;
		}
		out.println(ways);
	}
}
