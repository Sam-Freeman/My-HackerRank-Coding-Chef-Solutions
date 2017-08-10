package me.samfreeman.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class DesignerPDFViewer {

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
		char[] word = in.readLine().toCharArray();

		int[] alphaHeight = new int[26];
		for (int i = 0; i < 26; i++)
			alphaHeight[i] = Integer.parseInt(l[i]);

		int height = 0;
		for (char c : word) {
			height = (alphaHeight[Character.getNumericValue(c) - 10] > height)
					? alphaHeight[Character.getNumericValue(c) - 10] : height;
		}

		out.println(word.length * height);

	}
}
