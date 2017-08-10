package me.samfreeman.dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.math.BigInteger;
import java.util.Arrays;

public class ModifiedFibonacci {
	static BufferedReader in;
	static PrintStream out;

	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintStream(System.out);
		complete();
		out.close();
	}

	static long t_1 = 0;
	static long t_2 = 0;

	static void complete() throws IOException {
		
		String[] l1 = in.readLine().split(" ");
		t_1 = Long.parseLong(l1[0]);
		t_2 = Long.parseLong(l1[1]);
		int n = Integer.parseInt(l1[2]);
		BigInteger[] memos = new BigInteger[n];
		Arrays.fill(memos, BigInteger.valueOf(0));
		
		BigInteger ans = fib(n-1, memos);
		out.println(ans);

	}

	static BigInteger fib(int n, BigInteger[] memo) {
		if (n <= 0)
			return BigInteger.valueOf(t_1);
		else if (n == 1)
			return BigInteger.valueOf(t_2);
		else if (memo[n] == BigInteger.valueOf(0)) {
			memo[n] = fib(n - 2, memo).add(fib((n - 1), memo).multiply(fib((n - 1), memo)));
		}
		return memo[n];
		
	}

}
