package me.samfreeman.java.DataStructures;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaArrayList {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		ArrayList<ArrayList<Integer>> holder = new ArrayList<ArrayList<Integer>>();

		for (int i = 0; i < n; i++) {
			holder.add(new ArrayList<Integer>());
			int x = in.nextInt();
			for (int j = 0; j < x; j++) {
				holder.get(i).add(in.nextInt());
			}
		}

		int q = in.nextInt();
		for (int i = 0; i < q; i++) {
			try {
				System.out.println(holder.get(in.nextInt() - 1).get(in.nextInt() - 1));
			} catch (Exception e) {
				System.out.println("ERROR!");
			}
		}

		in.close();
	}

}