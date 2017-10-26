package me.samfreeman.java.DataStructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.BitSet;

public class JavaBitset {
	static BufferedReader in;
	static PrintStream out;

	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintStream(System.out);

		String[] nm = in.readLine().split(" ");
		int n = Integer.parseInt(nm[0]);
		int m = Integer.parseInt(nm[1]);

		BitSet b1 = new BitSet(n);
		BitSet b2 = new BitSet(n);
		BitSet[] hold = { b1, b2 };

		for (int i = 0; i < m; i++) {
			String[] inpt = in.readLine().toLowerCase().split(" ");
			int a = Integer.parseInt(inpt[1]);
			int b = Integer.parseInt(inpt[2]);
			switch (inpt[0]) {
			case "and":
				hold[a - 1].and(hold[b - 1]);
				break;
			case "or":
				hold[a - 1].or(hold[b - 1]);
				break;
			case "xor":
				hold[a - 1].xor(hold[b - 1]);
				break;
			case "flip":
				hold[a - 1].flip(b);
				break;
			case "set":
				hold[a - 1].set(b);
				break;
			default:
				break;
			}

			out.println(hold[0].cardinality() + " " + hold[1].cardinality());

		}

		out.close();
	}

}
