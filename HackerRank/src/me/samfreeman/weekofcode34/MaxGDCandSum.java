package me.samfreeman.weekofcode34;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class MaxGDCandSum {

	static BufferedReader in;
	static PrintStream out;

	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintStream(System.out);
		int n = Integer.parseInt(in.readLine());

		int[] A = new int[n];
		String[] A_s = in.readLine().split(" ");
		for (int A_i = 0; A_i < n; A_i++) {
			A[A_i] = Integer.parseInt(A_s[A_i]);
		}

		int[] B = new int[n];
		String[] B_s = in.readLine().split(" ");
		for (int B_i = 0; B_i < n; B_i++) {
			B[B_i] = Integer.parseInt(B_s[B_i]);
		}
		int res = complete(A, B);
		out.println(res);
		out.close();
	}
	
	public static int complete(int[] A, int[] B) {
		LinkedHashMap<Integer, Integer> possible = new LinkedHashMap<Integer, Integer>();
		HashMap<Integer, Integer> memo = new HashMap<Integer, Integer>();
		int highestGCD = 0;

		Arrays.sort(A);
		Arrays.sort(B);

		for (int i = A.length - 1; i >= 0; i--) {
			if (A[i] < highestGCD)
				continue;
			for (int j = B.length - 1; j >= 0; j--) {
				if (B[j] < highestGCD)
					continue;
				//int x = gcd(A[i], B[j], highestGCD);
				int x = gcdx(A[i], B[i], memo);
				out.println("A: " + A[i] + " B: " + B[j] + " GDC: " + x);
				if (x > highestGCD) {
					highestGCD = x;
					possible.clear();
					possible.put(A[i], B[j]);
				}
			}
		}

		/*
		 * for (int a : A) { if (a < highestGCD) continue; for (int b : B) { if
		 * (b < highestGCD) continue; int x = gcd(a, b); out.println("A: " + a +
		 * " B: " + b + " GDC: " + x); if (x > highestGCD) { highestGCD = x;
		 * possible.clear(); possible.put(a, b); } } }
		 */

		int highestSum = 0;
		for (int i = 0; i < possible.size(); i++) {
			int sum = (new ArrayList<Integer>(possible.values())).get(i)
					+ (new ArrayList<Integer>(possible.keySet())).get(i);
			highestSum = (sum > highestSum) ? sum : highestSum;
		}

		return highestSum;

	}

	public static int gcd(int x, int y, int high) {
		if (x < high)
			return 0;
		else
			return (y == 0) ? x : gcd(y, x % y, high);
	}

	public static int gcdx(int x, int y, HashMap<Integer, Integer> memo) {
		//System.out.println("x: " + x + " y: " + y);
		//for (int m = 0; m < memo.size(); m++) System.out.println("keys: " + memo.keySet() + " values: " + memo.values());
		if (x % y == 0){
			System.out.println("0, x: " + x + " y: " + y);
			return x;
		}
		else {
			if (memo.get(x) == null) {
				System.out.println("memo 1, x: " + x + " y: " + y);
				int a = gcdx(y, x % y, memo);
				memo.put(x, a);

				System.out.println("memo 2, x: " + x + " y: " + y + " gcd: " + a);
			}
		}
		return (memo.get(x));
		
	}
	
}
