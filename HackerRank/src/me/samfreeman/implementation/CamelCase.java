package me.samfreeman.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class CamelCase {
	static BufferedReader in;
	static PrintStream out;

	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintStream(System.out);
		complete();
		out.close();
	}

	static void complete() throws IOException {
		char[] s = in.readLine().toCharArray();
		int total = 1;

		for (char c : s) {
			if (Character.isUpperCase(c))
				total++;
		}

		out.println(total);

	}
}
