package me.samfreeman.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;

public class SockMerchant {

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
		int[] cs = new int[n];
		boolean[] paired = new boolean[n];
		Arrays.fill(paired, false);
		for (int a = 0; a < n; a++) cs[a] = Integer.parseInt(l[a]);
		
		int n_s = 0;
		
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (cs[i] == cs[j] && (!paired[i] && !paired[j])) {
					out.println("Pair: i: " + cs[i] + " j: " + cs[j]);
					n_s++;
					paired[j] = true;
					paired[i] = true;
					break;
				}
			}
		}
		out.println(n_s);
	}
	
	
}
