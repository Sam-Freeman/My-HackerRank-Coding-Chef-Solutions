package me.samfreeman.java.DataStructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

public class JavaMap {

	static BufferedReader in;
	static PrintStream out;

	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintStream(System.out);

		Map<String, Integer> phoneBook = new HashMap<String, Integer>();

		int n = Integer.parseInt(in.readLine());
		for (int i = 0; i < n; i++) {
			String name = in.readLine();
			int number = Integer.parseInt(in.readLine());

			phoneBook.put(name, number);
		}
		String query;
		while ((query = in.readLine()) != null) {
			if (phoneBook.containsKey(query))
				out.println(query + "=" + phoneBook.get(query));
			else
				out.println("Not found");
		}

		out.close();
	}

}
