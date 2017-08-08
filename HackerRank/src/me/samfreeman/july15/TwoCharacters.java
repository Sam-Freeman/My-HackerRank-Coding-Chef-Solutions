package me.samfreeman.july15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;

public class TwoCharacters {

	static BufferedReader in;
	static PrintStream out;

	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintStream(System.out);
		complete();
		out.close();
	}

	static void complete() throws IOException {

		int l = Integer.parseInt(in.readLine());
		String[] s = in.readLine().split("");
		ArrayList<String> chars = charNumber(s);

		if (chars.size() < 2) {
			out.println(0);
		} else if (chars.size() == 2) {
			if (checkAlt(s))
				out.println(s.length);
			else
				out.println(0);
		} else {
			int possibleLength = s.length;

			for (String st : chars) {
				ArrayList<String> test = new ArrayList<String>();

				for (int t = 0; t < s.length; t++) {
					if (!st.equals(s[t]))
						test.add(s[t]);
				}

				ArrayList<String> news = charNumber(test.toArray(new String[0]));

				ArrayList<String> keepatit = new ArrayList<String>();
				boolean run = (news.size() == 2) ? false : true;
				while (run) {
					keepatit.clear();
					for (String p : news) {
						//out.println(p);
						for (int d = 0; d < test.size(); d++) {
							if (!p.equals(test.get(d))) keepatit.add(test.get(d));
						}
					}
					

					test = keepatit;
					ArrayList<String> pls = charNumber(keepatit.toArray(new String[0]));
					news = pls;
					if (pls.size() <= 2)
						run = false;
				}

				if (checkAlt((String[]) test.toArray(new String[0]))) {
					if (test.size() < possibleLength)
						possibleLength = test.size();
				}
			}

			if (possibleLength == s.length)
				possibleLength = 0;

			out.println(possibleLength);

		}
	}

	static ArrayList<String> charNumber(String[] arr) {
		ArrayList<String> check = new ArrayList<String>();
		for (int i = 0; i < arr.length; i++) {

			if (!check.contains(arr[i])) {
				check.add(arr[i]);
			}
		}

		return check;

	}

	static boolean checkAlt(String[] arr) {
		boolean alt = false;
		

		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i - 1].equals(arr[i + 1])) {
				alt = true;
			} else {
				alt = false;
				i = arr.length;
			}
		}
		return alt;
	}

}
