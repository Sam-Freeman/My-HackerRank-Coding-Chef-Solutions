package me.samfreeman.july14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

class Calculator {
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
			String[] l = in.readLine().split(" ");
			int eRemaining = Integer.parseInt(l[0]);
			int eCost = Integer.parseInt(l[1]);
			
			int s1 = 0;
			int s2 = 0;
			int cH = 0;
			
			int nP = Math.round(eRemaining / eCost);
			
			for (int j = 1; j <= nP; j++) {
				int x = eCost * j;				
				s1 = eRemaining - x;
				eRemaining = x;
				
				while (eRemaining > 0) {
					s2 += s1;
					eRemaining -= eCost;
				}
				
				if (s2 > cH) {
					cH = s2;
					
				} else {
					//j = nP + 1;
				}
				s2 = 0;
				s1 = 0;
				eRemaining = Integer.parseInt(l[0]);
			}
			out.println(cH);
		}
	}	
}
