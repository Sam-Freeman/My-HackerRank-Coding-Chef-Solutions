package me.samfreeman.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;

public class MarcsCakewalk {

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
		int[] cc_cal = new int[n];
		long miles = 0;
		for (int i = 0; i < n; i++) {
			cc_cal[i] = Integer.parseInt(l[i]);
		}
		Arrays.sort(cc_cal);
		for (int j = cc_cal.length - 1; j >= 0; j--) {
			miles += Math.pow(2, n - j - 1) * cc_cal[j];
		}
		out.println(miles);
	}

}
