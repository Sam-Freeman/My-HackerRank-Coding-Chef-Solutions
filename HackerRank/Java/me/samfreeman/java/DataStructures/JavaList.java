package me.samfreeman.java.DataStructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class JavaList {
	static BufferedReader in;
	static PrintStream out;

	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintStream(System.out);

		int n = Integer.parseInt(in.readLine());
		String[] input = in.readLine().split(" ");
		List<Integer> hold = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			hold.add(Integer.parseInt(input[i]));
		}

		int x = Integer.parseInt(in.readLine());
		for (int i = 0; i < x; i++) {
			if (in.readLine().equals("Insert")) {
				String[] q = in.readLine().split(" ");
				hold.add(Integer.parseInt(q[0]), Integer.parseInt(q[1]));
			} else {
				hold.remove(Integer.parseInt(in.readLine()));
			}
		}

		for (int i = 0; i < hold.size(); i++)
			out.print(hold.get(i) + " ");

		out.close();
	}

}
