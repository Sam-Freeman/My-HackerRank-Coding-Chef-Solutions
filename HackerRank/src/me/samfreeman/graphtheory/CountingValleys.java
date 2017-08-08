package me.samfreeman.graphtheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class CountingValleys {
	static BufferedReader in;
	static PrintStream out;

	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintStream(System.out);
		complete();
		out.close();
	}

	static void complete() throws IOException {
		int steps = Integer.parseInt(in.readLine());
		String[] stepTrack = in.readLine().split("");
		
		int currentPlace = 0; // 0 --> sea-level
		int valleys = 0;
		
		for (String s : stepTrack) {
			if (s.equals("U")) {
				currentPlace++;
				if (currentPlace == 0) valleys++;
			} else {
				currentPlace--;
			}
		}
		out.println(valleys);
	}
}
