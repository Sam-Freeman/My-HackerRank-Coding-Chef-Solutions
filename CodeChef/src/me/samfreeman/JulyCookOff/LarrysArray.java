package me.samfreeman.JulyCookOff;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;

public class LarrysArray {
	static BufferedReader in;
	static PrintStream out;

	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintStream(System.out);

		int T = Integer.parseInt(in.readLine());
		while (T-- > 0) {

			int n = Integer.parseInt(in.readLine());
			String[] l0 = in.readLine().split(" ");
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = Integer.parseInt(l0[i]);

			complete(a);

		}

		out.close();

	}

	static void complete(int[] arr) throws IOException {
		int[] sortedArr = Arrays.copyOf(arr, arr.length);
		Arrays.sort(sortedArr);
		boolean rotated = false;
		int[] arrs = arr;

		int rotations = 0;
		boolean possible = true;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arrs[i] != sortedArr[i]) {
				if (!rotated) {

					boolean cond_c = (i == arr.length - 2) ? arrs[i - 1] != sortedArr[i - 1]
							: arrs[i + 2] != sortedArr[i + 2];

					while (arrs[i] != sortedArr[i] || arrs[i + 1] != sortedArr[i + 1] || cond_c) {
						int j = (i == arr.length - 2) ? i - 1 : i;
						arrs = rotate(j, arrs);
						if (rotations > 2) {
							possible = false;
							break;
						}
						rotations++;
						cond_c = (i == arr.length - 2) ? arrs[i - 1] != sortedArr[i - 1]
								: arrs[i + 2] != sortedArr[i + 2];

					}
				} else
					possible = false;
			}

		}

		out.println((possible) ? "YES" : "NO");

	}

	static int[] rotate(int index, int[] arr) {
		int hold = arr[index + 2];
		arr[index + 2] = arr[index];
		arr[index] = arr[index + 1];
		arr[index + 1] = hold;

		return arr;
	}

}
