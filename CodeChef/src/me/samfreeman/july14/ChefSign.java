package me.samfreeman.july14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

class ChefSign {
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
			String[] s = in.readLine().split("");
			int cH = 1;
			int cN = 1;
			
			int nLT = 0;
			int nGT = 0;
			
			for (int j = 0; j < s.length; j++) {
				switch (s[j]) {
				case ">":
					nGT++;
					if (nLT == 0) {
						cH++;
						cN++;
					} else cN--;
					break;
				case "<":
					nLT++;
					if (nLT > nGT) cN++;
					if (cN > cH) cH++;
					break;
				default:
					break;
				}
			}
			out.println(cH);
		}
	}
}
