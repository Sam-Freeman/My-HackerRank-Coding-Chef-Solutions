package me.samfreeman.java.DataStructures;

import java.util.Scanner;

public class Java2DArray {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[][] = new int[6][6];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		in.close();

		int largest = -81;

		for (int i = 0; i < 4; i++) {
			for (int j = 1; j < 5; j++) {
				int sum = arr[j - 1][i] + arr[j - 1][i + 1] + arr[j - 1][i + 2] + arr[j][i + 1] + arr[j + 1][i]
						+ arr[j + 1][i + 1] + arr[j + 1][i + 2];
				largest = (sum > largest) ? sum : largest;
			}
		}
		System.out.println(largest);
	}
}
