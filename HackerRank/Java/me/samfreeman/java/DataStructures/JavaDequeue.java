package me.samfreeman.java.DataStructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

public class JavaDequeue {
	static BufferedReader in;
	static PrintStream out;

	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintStream(System.out);

		String[] line = in.readLine().split(" ");
		int n = Integer.parseInt(line[0]);
		int m = Integer.parseInt(line[1]);

		String[] arr = in.readLine().split(" ");
		Deque<Integer> de = new ArrayDeque<>();
		HashMap<Integer, Integer> count = new HashMap<>();
		int max = 0;

		for (int i = 0; i < n; i++) {
			de.addLast(Integer.parseInt(arr[i]));
			count.put(de.getLast(), (count.get(de.getLast()) != null) ? count.get(de.getLast()) + 1 : 1);
			if (de.size() == m) {
				max = (count.size() > max) ? count.size() : max;
				count.put(de.peek(), count.get(de.peek()) - 1);
				if (count.get(de.peek()) == 0)
					count.remove(de.peek());
				de.removeFirst();
			}
		}

		/*
		 * takes too long 
		 * for (int i = 0; i < n; i++) {
		 * de.addLast(Integer.parseInt(arr[i])); if (de.size() == m) { max =
		 * (max < de.stream().distinct().count()) ?
		 * de.stream().distinct().count() : max; de.removeFirst(); } }
		 */

		out.println(max);
		out.close();
	}

}
