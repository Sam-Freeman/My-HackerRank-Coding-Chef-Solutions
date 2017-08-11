package me.samfreeman.java.strings;

import java.util.Scanner;

public class JavaRegex {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String IP = in.next();
			System.out.println(IP.matches(new MyRegex().pattern));
		}
		in.close();
	}
}

class MyRegex {
	String pattern = 
			"\\b(0?1?[0-9]{1,2}|2[0-4][0-9]|25[0-5])\\b\\." +
			"\\b(0?1?[0-9]{1,2}|2[0-4][0-9]|25[0-5])\\b\\." +
			"\\b(0?1?[0-9]{1,2}|2[0-4][0-9]|25[0-5])\\b\\." +
			"\\b(0?1?[0-9]{1,2}|2[0-4][0-9]|25[0-5])\\b";
}
