package me.samfreeman.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Kanagroo {
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
		int x_1 = Integer.parseInt(l[0]);
		int v_1 = Integer.parseInt(l[1]);
		int x_2 = Integer.parseInt(l[2]);
		int v_2 = Integer.parseInt(l[3]);

		while (true) {
			if (x_1 == x_2) {
				out.println("YES");
				break;
			}

			x_1 += v_1;
			x_2 += v_2;

			if ((x_1 > x_2) || (v_2 > v_1)) {
				out.println("NO");
				break;
			}

		}

	}
}
