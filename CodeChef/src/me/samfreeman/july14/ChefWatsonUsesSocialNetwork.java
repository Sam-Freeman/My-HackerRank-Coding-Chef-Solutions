package me.samfreeman.july14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

class ChefWatsonUsesSocialNetwork {
	
	static BufferedReader in;
	static PrintStream out;
	
	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintStream(System.out);
		complete();
		out.close();
	}
	
	public static void complete() throws IOException {
		String l1 = in.readLine();
		int N = Integer.parseInt(l1.split(" ")[0]);
		int M = Integer.parseInt(l1.split(" ")[1]);
		
		String l2 = in.readLine();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(l2.split(" ")[i]);
		} 
		
		int[] f = new int[M];
		Map<Integer, String> ps = new TreeMap<Integer, String>(Collections.reverseOrder());
				
		for (int j = 0; j < M; j++) {
			String l3 = in.readLine();
			f[j] = Integer.parseInt(l3.split(" ")[0]);
			int h = Integer.parseInt(l3.split(" ")[1]);
			for (int k : A) {
				if (f[j] == k) h += 100000;
			}
			ps.put(h, l3.split(" ")[2]);
		}	
		
		Collection<String> pr = ps.values();
		for (String s : pr) {
			out.println(s);
		}
	}	
}
