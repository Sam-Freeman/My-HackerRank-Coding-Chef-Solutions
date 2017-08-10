package me.samfreeman.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashMap;

public class SherlockAndTheValidString {
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

		HashMap<Character, Integer> letters = new HashMap<Character, Integer>();
		for (char c : s) {
			if (letters.containsKey(c)) {
				letters.put(c, letters.get(c) + 1);
			} else {
				letters.put(c, 1);
			}
		}

		int[] occurances = new int[letters.size()];

		int index = 0;
		for (int i : letters.values()) {
			occurances[index] = i;
			index++;
		}

		// find the number of numbers that are off of the main one.
		int streak = 1;
		int longest = streak;
		Arrays.sort(occurances);
		for (int j = 0; j < occurances.length - 1; j++) {
			if (occurances[j] == occurances[j + 1]) {
				streak++;
				longest = (streak > longest) ? streak : longest;
			} else {
				streak = 1;
			}
		}
		out.println(((occurances.length - longest == 1) || longest == occurances.length) ? "YES" : "NO");

	}
}
