package me.samfreeman.july14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;

class IPCTrain {
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
			String[] l1 = in.readLine().split(" ");
			
			int N = Integer.parseInt(l1[0]);
			int D = Integer.parseInt(l1[1]);
			int[] Ls = new int[N];
			int[] Ds = new int[N];
			int[] Ss = new int[N];
			int sadness = 0;
			int cDay = 1;
			for (int j = 0; j < N; j++) {
				String[] l2 = in.readLine().split(" ");
				Ds[j] = Integer.parseInt(l2[0]);
				Ls[j] = Integer.parseInt(l2[1]);
				Ss[j] = Integer.parseInt(l2[2]);
			}
			
			ArrayList<Integer> a = new ArrayList<Integer>();
			
			while (D-- > 0) {
				
				for (int k = 0; k < N; k++) {
					if (Ds[k] <= cDay && Ls[k] > 0) {
						a.add(k);
					}
				}
				
				int h = 0;
				int c = 0;
				boolean hc = false;
				for (int b : a) {
					if (Ss[b] > h) {
						h = Ss[b];
						c = b;
						hc = true;
					}
				}
				if (hc) Ls[c]--;
				a.clear();
				cDay++;
				
			}
			for (int m = 0; m < N; m++) {
				if (Ls[m] > 0) sadness += Ss[m] * Ls[m]; 
			}
			
			out.println(sadness);
		}
	}
}
