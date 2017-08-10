package me.samfreeman.weekofcode34;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class OnceInATram {

	static BufferedReader in;
	static PrintStream out;
	
	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintStream(System.out);
		//complete();
		out.println(gcd(50, 110));
		out.close();
	}
	
	
	public static int gcd(int x, int y) {
		return (y==0) ? x : gcd(y, x % y);
	}
	
	static void complete() throws IOException {
		String x = in.readLine();
		boolean isLucky = false;
		int rotation = 1;
		String luck = Integer.toString(Integer.parseInt(x) + rotation);
		while (!isLucky) {
			
			luck = Integer.toString(Integer.parseInt(x) + rotation);
			isLucky = checkIfLucky(luck);
			rotation++;
		}
		out.println(luck);
	}
	
	static boolean checkIfLucky(String testcase) {
		
		int fs = 0;
		int bs = 0;
		
		for (int i = 0; i < testcase.length(); i++) {
			if (i < 3) {
				fs += Integer.parseInt(testcase.substring(i, i+1));
				
			} else {
				bs += Integer.parseInt(testcase.substring(i, i+1));
			}
		}
		
		if (fs == bs) {
			out.println(testcase);
			out.println(fs + " " + bs);
			return true;
		} else return false;
	}
	
	
}
