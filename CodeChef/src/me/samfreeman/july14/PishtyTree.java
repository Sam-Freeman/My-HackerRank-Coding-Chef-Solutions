package me.samfreeman.july14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

class PishtyTree {
	static BufferedReader in;
	static PrintStream out;

	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintStream(System.out);
		out.println(2 ^ 5);
		// complete();
		out.close();
	}

	static void complete() throws IOException {
		int T = Integer.parseInt(in.readLine());
		for (int i = 0; i < T; i++) {

			int N = Integer.parseInt(in.readLine());
			Node[] tree = new Node[N];

			while (N-- > 0) {
				String[] l1 = in.readLine().split(" ");
				int u = Integer.parseInt(l1[0]);
				int v = Integer.parseInt(l1[1]);
				int c = Integer.parseInt(l1[2]);

				tree[tree.length - N] = new Node(u, v, c);
			}

			int M = Integer.parseInt(in.readLine());
			while (M-- > 0) {
				String[] l2 = in.readLine().split(" ");
				int start = Integer.parseInt(l2[0]);
				int end = Integer.parseInt(l2[1]);
				int K = Integer.parseInt(l2[2]);

				for (Node n : tree) {
					if (n.name == start) {

					}
				}

			}
		}
	}

	static class Node {
		int name;
		int connection;
		int magic;

		public Node(int ownN, int otherN, int mNum) {
			this.name = ownN;
			this.connection = otherN;
			this.magic = mNum;
		}
	}

}
