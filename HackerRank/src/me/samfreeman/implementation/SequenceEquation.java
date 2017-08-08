package me.samfreeman.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class SequenceEquation {

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
		String[] l = in.readLine().split(" ");
		
		int[] n_int = new int[n + 1];
		for (int i = 1; i <= n; i++) 
			n_int[Integer.parseInt(l[i-1])] = i;
		
		for (int j = 1; j <= n; j++) {
			int ans = n_int[n_int[j]];
			out.println(ans);
		}
		
		
	}
}
