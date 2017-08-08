package me.samfreeman.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class InsertionSort2 {

	static BufferedReader in;
	static PrintStream out;

	public static void main(String[] args) throws IOException {

		in = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintStream(System.out);
		complete();
		out.close();

	}

	static void complete() throws IOException {

		// Get input and create array
		int size = Integer.parseInt(in.readLine());
		int[] arr = new int[size];
		String[] startArr = in.readLine().split(" ");
		for (int i = 0; i < size; i++)
			arr[i] = Integer.parseInt(startArr[i]);
		//int shifts = 0; // for running time (another challenge)
		// Sort
		for (int i = 1; i < size; i++) {
			int j = i - 1;
			int x = arr[i];
			while (j >= 0 && arr[j] > x) {
				arr[j + 1] = arr[j];
				j--;
				//shifts++;
			}
			arr[j + 1] = x;
			printArray(arr);
		}
		//out.println(shifts); // for running time (another challenge)
	}

	static void printArray(int[] arr) {
		for (int n : arr) {
			out.print(n + " ");
		}
		out.println();
	}

}
