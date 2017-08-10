package me.samfreeman.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class AppleAndOrange {
	static BufferedReader in;
	static PrintStream out;

	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintStream(System.out);
		complete();
		out.close();
	}

	static void complete() throws IOException {
		String[] l0 = in.readLine().split(" ");
		int s = Integer.parseInt(l0[0]);
		int t = Integer.parseInt(l0[1]);

		String[] l1 = in.readLine().split(" ");
		int a = Integer.parseInt(l1[0]);
		int b = Integer.parseInt(l1[1]);

		String[] l2 = in.readLine().split(" ");
		int m = Integer.parseInt(l2[0]);
		int n = Integer.parseInt(l2[1]);

		String[] l3 = in.readLine().split(" ");
		int[] dist_apple = new int[m];
		for (int i = 0; i < m; i++)
			dist_apple[i] = Integer.parseInt(l3[i]);

		String[] l4 = in.readLine().split(" ");
		int[] dist_orange = new int[n];
		for (int j = 0; j < n; j++)
			dist_orange[j] = Integer.parseInt(l4[j]);

		int apples = 0;
		int oranges = 0;

		for (int apple : dist_apple) {
			if (apple < 0)
				continue;
			else {
				int loc = (a + apple);
				if (loc >= s && loc <= t)
					apples++;
			}
		}

		for (int orange : dist_orange) {
			if (orange > 0)
				continue;
			else {
				int loc = b + orange;
				if (loc >= s && loc <= t)
					oranges++;
			}
		}

		out.println(apples);
		out.println(oranges);
		
	}
}
