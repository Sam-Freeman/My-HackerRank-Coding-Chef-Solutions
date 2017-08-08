package me.samfreeman.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class StrangeAdvertising {
	
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
		int peeps = 5;
		int amount = 0;
		
		while (n-- > 0) {
			amount += peeps / 2;
			peeps = peeps / 2 * 3;
		}
		
		out.println(amount);
	}
	
	
	
}
