package me.samfreeman.july14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

class ChefBestFriend {

	static BufferedReader in;
	static PrintStream out;
	static boolean kr = true;
	
	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintStream(System.out);
		complete();
		out.close();
	}
	
	static int sec = 0;
	static void complete() throws IOException {
		int T = Integer.parseInt(in.readLine());
		for (int i = 0; i < T; i++) {
			int N = Integer.parseInt(in.readLine());
			
			String l = in.readLine();
			int[] A = new int[N];
			for (int j = 0; j < N; j++) A[j] = Integer.parseInt(l.split(" ")[j]);
			
			swap(A);
			while(kr) {
				swap(A);
			}
			out.println(sec);
			sec = 0;
			kr = true;
		}
	}
	
	static void swap(int[] line) {
		int ns = 0;
		for (int b = 0; b < line.length; b++) {
			if (b < line.length - 1) {
				if (line[b] == 0 && line[b+1] == 1) {
					line[b] = 1;
					line[b+1] = 0;
					ns++;
					b++;
				}
			}
		}
		if (ns == 0) kr = false;
		else sec++;
	}
}
