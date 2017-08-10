package me.samfreeman.graphtheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class RepeatedString {
	static BufferedReader in;
	static PrintStream out;

	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintStream(System.out);
		complete();
		out.close();
	}

	static void complete() throws IOException {
		String s = in.readLine();
		int length = s.length();
		boolean allA = true;
		int a_initial = 0;
		for (char c : s.toCharArray()) {
			if (c == 'a')
				a_initial++;
			else
				allA = false;
		}

		long n = Long.parseLong(in.readLine());
		long total = (n / length) * a_initial;
		if (allA)
			total = n;
		else {

			for (int i = 0; i < length; i++) {
				if (i < n % length) {
					if (s.toCharArray()[i] == 'a')
						total++;
				}
			}
		}

		out.println(total);
	}

}
