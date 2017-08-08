package me.samfreeman.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class BonAppetit {

	static BufferedReader in;
	static PrintStream out;

	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintStream(System.out);
		complete();
		out.close();
	}

	static void complete() throws IOException {
		String[] l = in.readLine().split(" ");
		int n = Integer.parseInt(l[0]);
		int k = Integer.parseInt(l[1]); // 0-indexed

		String[] i = in.readLine().split(" ");
		int[] c = new int[i.length]; // cost of each
		for (int j = 0; j < n; j++)
			c[j] = (j == k) ? 0 : Integer.parseInt(i[j]);

		int c_actual = 0;
		for (int c_i : c)
			c_actual += c_i;
		c_actual /= 2;

		int c_charged = Integer.parseInt(in.readLine());
		out.println((c_actual == c_charged) ? "Bon Appetit" : c_charged - c_actual);

	}

}
