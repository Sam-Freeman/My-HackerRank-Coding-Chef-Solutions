package me.samfreeman.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class DivisibleSumPairs {
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
		int k = Integer.parseInt(l1[1]);
		
		String[] l2 = in.readLine().split(" ");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) a[i] = Integer.parseInt(l2[i]);
		
		int total = 0;
				
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				if ((a[i] + a[j]) % k == 0) total++;
			}
		}
		
	}
	
	
}
