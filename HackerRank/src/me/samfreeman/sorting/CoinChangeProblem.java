package me.samfreeman.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class CoinChangeProblem {
	static BufferedReader in;
	static PrintStream out;

	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintStream(System.out);
		complete();
		out.close();
	}

	static void complete() throws IOException {
		String[] l1 = in.readLine().split(" ");
		int n = Integer.parseInt(l1[0]);
		int m = Integer.parseInt(l1[1]);
		
	}
}