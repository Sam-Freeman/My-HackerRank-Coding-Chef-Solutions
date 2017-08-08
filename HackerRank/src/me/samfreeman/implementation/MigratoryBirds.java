package me.samfreeman.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class MigratoryBirds {

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
		int[] nT = { 0, 0, 0, 0, 0 };

		String[] l = in.readLine().split(" ");
		for (int i = 0; i < l.length; i++) {
			nT[Integer.parseInt(l[i]) - 1]++;
		}

		int high = 0;
		int ind = 0;
		for (int a = 0; a < nT.length; a++) {
			if (nT[a] > high) {
				high = nT[a];
				ind = a;
			}
			
		}
		out.println(ind + 1);

	}

}
