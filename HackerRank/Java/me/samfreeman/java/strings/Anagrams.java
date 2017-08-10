package me.samfreeman.java.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;

public class Anagrams {

	static BufferedReader in;
	static PrintStream out;

	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintStream(System.out);

		char[] a = in.readLine().toLowerCase().toCharArray();
		char[] b = in.readLine().toLowerCase().toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);

		boolean working = true;
		if (a.length != b.length)
			working = false;
		else {
			for (int i = 0; i < a.length; i++) {
				if (a[i] != b[i]) {
					working = false;
					break;
				}
			}
		}

		out.println((working) ? "Anagrams" : "Not Anagrams");

		out.close();
	}

}
