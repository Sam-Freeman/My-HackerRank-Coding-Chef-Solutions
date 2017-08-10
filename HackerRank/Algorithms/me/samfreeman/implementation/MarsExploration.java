package me.samfreeman.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class MarsExploration {
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
		int replace = 0;
		for (int i = 0; i < s.length() / 3; i++) {
			
			String ss = s.substring(i * 3, (i * 3) + 3);
			char[] sos = ss.toCharArray();
			if (sos[0] != 'S') replace++;
			if (sos[1] != 'O') replace++;
			if (sos[2] != 'S') replace++;
			
		}
		out.println(replace);
	}
}
