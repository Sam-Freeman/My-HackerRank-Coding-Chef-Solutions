package me.samfreeman.graphtheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class BeautifulDaysAtMovies {

	static BufferedReader in;
	static PrintStream out;

	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintStream(System.out);
		complete();
		out.close();
	}

	static void complete() throws IOException {
		String[] l = in.readLine().split(" ");
		int i = Integer.parseInt(l[0]);
		int j = Integer.parseInt(l[1]);
		int k = Integer.parseInt(l[2]);

		int total = 0;

		for (int a = i; a < j + 1; a++) {
			int rev = reverse(a);
			if ((Math.abs(rev - a)) % k == 0)
				total++;
		}

		out.println(total);

	}

	static int reverse(int toReverse) {
		int digit = 0;
		int newNum = 0;
		while (toReverse != 0) {
			digit = toReverse % 10;
			newNum = newNum * 10 + digit;
			toReverse /= 10;
		}
		return newNum;
	}

}
