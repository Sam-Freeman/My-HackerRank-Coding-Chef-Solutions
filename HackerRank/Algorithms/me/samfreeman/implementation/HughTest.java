package me.samfreeman.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;


public class HughTest {
	
	static BufferedReader in;
	static PrintStream out;
	
	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new InputStreamReader(in));
		out = new PrintStream(System.out);
		
		int line1 = Integer.parseInt(in.readLine());
		String[] line2 = in.readLine().split(" ");
		
		int[] birdsTotal = {0, 0, 0, 0, 0};
		
		for (String s : line2) {
			int currentBird = Integer.parseInt(s);
			birdsTotal[currentBird - 1]++;
		}
		
		int max = 0;
		int indx = 6;
		for (int i = 0; i < birdsTotal.length; i++) {
			if (birdsTotal[i] > max) {
				max = birdsTotal[i];
				indx = i + 1;
			}
		}
		
		out.println(indx);
		
		out.close();
	}
}
