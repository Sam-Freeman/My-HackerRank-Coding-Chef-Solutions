package me.samfreeman.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;

public class MinimumAbsDifferenceArray {
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

		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = Integer.parseInt(l[i]);
		
		Arrays.sort(arr);
		int min = Math.abs(arr[arr.length - 1]);
		for (int j = 0; j < n-1; j++) {
			min = (Math.abs(arr[j] - arr[j+1]) < min) ? Math.abs(arr[j] - arr[j+1]) : min;
		}
		out.println(min);
	}
}
