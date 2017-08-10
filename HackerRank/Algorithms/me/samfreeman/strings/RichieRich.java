package me.samfreeman.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class RichieRich {
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
		int n = Integer.parseInt(l[0]);
		int k = Integer.parseInt(l[1]);
		
		String[] l1 = in.readLine().split("");
		int[] number = new int[n];
		for (int i = 0; i < n; i++) 
			number[i] = Integer.parseInt(l1[i]);
		int[] checker = number;
		for (int j = 0; j < k; j++) {
			checker = number;
			
		}
		
		out.println(check(number));
		
	}
	
	static boolean check(int[] possible) {
		for (int i = 0; i < possible.length / 2; i++) {
			if (possible[i] != possible[possible.length - 1 - i])
				return false;
		}
		return true;
	}
}
