package me.samfreeman.JulyCookOff;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;

public class ChangeAndBitwiseOR {
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
			int n = Integer.parseInt(in.readLine());
			String[] l = in.readLine().split(" ");
			int[] ls = new int[n];
			for (int i = 0; i < n; i++)
				ls[i] = Integer.parseInt(l[i]);
			
			int total = 0;
			int sum = 0;
			ArrayList<Integer> toRemove = new ArrayList<Integer>();
			
			
			
		}
	}
}
