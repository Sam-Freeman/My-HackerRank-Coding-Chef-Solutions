package me.samfreeman.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class JumpingOnClouds {
	static BufferedReader in;
	static PrintStream out;

	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintStream(System.out);
		complete();
		out.close();
	}

	static void complete() throws IOException {
		int n = Integer.parseInt(in.readLine());
		String[] l = in.readLine().split(" ");
		int[] descrip = new int[n];
		
		for (int i = 0; i < n; i++) descrip[i] = Integer.parseInt(l[i]);
		
		
		int steps = 0;
		for (int i = 0; i < n-1; i++) {
			if (i < n-2 && descrip[i+2] == 1) {
				steps++;
//				out.println("b jumped 1 " + i);
				continue;
			} else {
//				out.println("d Jumped " + ((i == n-2) ? 1 : 2));
				steps++;
				i += (i == n-2) ? 0 : 1;
			}
		}
		out.println(steps);
		
	}
}
