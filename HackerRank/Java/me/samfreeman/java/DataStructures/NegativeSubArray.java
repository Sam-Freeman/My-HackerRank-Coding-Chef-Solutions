package me.samfreeman.java.DataStructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class NegativeSubArray {
	static PrintStream out;

	public static void main(String[] args) throws IOException {

		out = new PrintStream(System.out);

		try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in));) {
			int n = Integer.parseInt(in.readLine());
			String[] inpt = in.readLine().split(" ");
			int[] arr = new int[n];

			int negs = 0;

			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(inpt[i]);

				int partialSum = arr[i];
				negs = (partialSum < 0) ? negs + 1 : negs;

				for (int j = i - 1; j >= 0; j--) {
					partialSum += arr[j];
					negs = (partialSum < 0) ? negs + 1 : negs;
				}
			}
			out.println(negs);
		}

		out.close();
	}
}
