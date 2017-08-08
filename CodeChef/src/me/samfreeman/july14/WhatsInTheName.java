package me.samfreeman.july14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

class WhatsInTheName {

	static BufferedReader in;
	static PrintStream out;
	static boolean kr = true;
	
	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintStream(System.out);
		complete();
		out.close();
	}
	
	static void complete() throws IOException {
		int T = Integer.parseInt(in.readLine());
		
		for (int i = 0; i < T; i++) {
			String l = in.readLine();
			int np = l.split(" ").length;
			switch (np) {
			case 1:
				out.println(l.substring(0, 1).toUpperCase() + l.substring(1).toLowerCase());
				break;
			case 2:
				out.println(l.split(" ")[0].substring(0, 1).toUpperCase() + ". " + l.split(" ")[1].substring(0, 1).toUpperCase() + l.split(" ")[1].substring(1).toLowerCase());
				break;
			case 3:
				out.println(l.split(" ")[0].substring(0, 1).toUpperCase() + ". " + l.split(" ")[1].substring(0, 1).toUpperCase() + ". "+ l.split(" ")[2].substring(0, 1).toUpperCase() + l.split(" ")[2].substring(1).toLowerCase());
				break;
			default:
				break;
			}
		}
	}
}
