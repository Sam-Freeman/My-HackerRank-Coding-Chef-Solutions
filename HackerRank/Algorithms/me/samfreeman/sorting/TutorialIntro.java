package me.samfreeman.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashMap;

public class TutorialIntro {

	static BufferedReader in;
	static PrintStream out;

	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintStream(System.out);
		complete();
		out.close();
	}

	static void complete() throws IOException {
		int v = Integer.parseInt(in.readLine());
		int n = Integer.parseInt(in.readLine());
		String[] l3 = in.readLine().split(" ");

		for (int i = 0; i < n; i++)
			if (Integer.parseInt(l3[i]) == v) out.println(i);

		
	}

}
