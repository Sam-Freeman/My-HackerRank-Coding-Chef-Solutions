package me.samfreeman.july14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

class MalvikaProgrammingCamp {

	static BufferedReader in;
	static PrintStream out;
	
	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintStream(System.out);
		complete();
		out.close();
	}
	
	static void complete() throws IOException {
		int T = Integer.parseInt(in.readLine());
		for (int i = 0; i < T; i++) {
			String l = in.readLine();
			int n = Integer.parseInt(l.split(" ")[0]); 
			int m = Integer.parseInt(l.split(" ")[1]);
			if (n == 1) out.println("0");
			else if (n == 2) out.println(m);
			else out.println((n-1) + 2 * (m-1));
		}
	}
}
