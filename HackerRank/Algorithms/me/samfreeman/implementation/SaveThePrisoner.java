package me.samfreeman.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class SaveThePrisoner {
	static BufferedReader in;
	static PrintStream out;

	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintStream(System.out);
		complete();
		out.close();

	}

	static void complete() throws IOException {
		int T = Integer.parseInt(in.readLine());
		while (T-- > 0) {
			String[] input = in.readLine().split(" ");
			int n = Integer.parseInt(input[0]);
			int m = Integer.parseInt(input[1]);
			int s = Integer.parseInt(input[2]);

			if ((m + s - 1) % n == 0)
				out.println(n);
			else
				out.println((m + s - 1) % n);
		}
	}
}
