package me.samfreeman.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;

public class EqualityInAnArray {
	static BufferedReader in;
	static PrintStream out;

	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintStream(System.out);
		complete();
		out.close();
	}

	static void complete() throws IOException {
		String l1 = in.readLine();
		String[] l2 = in.readLine().split(" ");

		int[] a = new int[Integer.parseInt(l1)];
		for (int i = 0; i < a.length; i++)
			a[i] = Integer.parseInt(l2[i]);

		Arrays.sort(a);

		int highest = 0;
		int hold = 0;

		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] == a[i + 1]) {
				hold++;
			} else if (a[i] < a[i + 1]) {
				hold = 0;
			}

			highest = (hold > highest) ? hold : highest;
			out.println(highest);
		}
		
		out.println(a.length - highest - 1);

	}
}
