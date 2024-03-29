package me.samfreeman.java.BigNumber;

import java.math.BigDecimal;
import java.util.Scanner;

public class JavaBigDecimal {
	public static void main(String[] args) {
		// Input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n + 2];
		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
		}
		sc.close();
		
		// Insertion Sort
		for (int i = 0; i < n; i++) {
			int j = i - 1;
			BigDecimal x = BigDecimal.valueOf(Double.parseDouble(s[i]));
			String hold = s[i];
			while (j >= 0 && BigDecimal.valueOf(Double.parseDouble(s[j])).compareTo(x) < 0) {
				s[j + 1] = s[j];
				j--;
			}
			s[j + 1] = hold;
		}

		// Output
		for (int i = 0; i < n; i++) {
			System.out.println(s[i]);
		}
	}
}
