package me.samfreeman.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class ElectronicsShop {
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
		String[] l2 = in.readLine().split(" ");
		String[] l3 = in.readLine().split(" ");

		int s = Integer.parseInt(l1[0]);
		int n = Integer.parseInt(l1[1]);
		int m = Integer.parseInt(l1[2]);

		int[] kb_b = new int[n];
		int[] ud_b = new int[m];

		for (int i = 0; i < n; i++)
			kb_b[i] = Integer.parseInt(l2[i]);
		for (int i = 0; i < m; i++){
			ud_b[i] = Integer.parseInt(l3[i]);
			out.println(ud_b[i]);
		}
		

		int cost = -1;

		for (int k : kb_b) {
			if (k > s)
				continue;
			for (int u : ud_b) {
				if (u > s)
					continue;
				out.println("k: " + k + " u: " + u);
				cost = (k + u <= s && k + u > cost) ? k + u : cost;
				out.println(cost);
			}
		}

		out.println(cost);

	}
}
