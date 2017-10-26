package me.samfreeman.java.DataStructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Stack;

public class JavaStack {
	static BufferedReader in;
	static PrintStream out;
	
	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintStream(System.out);
		
<<<<<<< HEAD
		String currentIn;
		while ((currentIn = in.readLine()) != null) {
			// Reads to EOF
			
			Stack<String> st = new Stack<String>();
			for (int i = 0; i < currentIn.length(); i++) {
				st.add(currentIn.split("")[i]);
			}
			
			
=======
		String inpt;
		while ((inpt = in.readLine()) != null) {
			Stack<Character> stack = new Stack<>();
			for (int i = 0; i < inpt.length(); i++) {
				if (!stack.isEmpty()) {
					switch (inpt.charAt(i)) {
					case '}':
						if (stack.peek() == '{')
							stack.pop();
						break;
					case ']':
						if (stack.peek() == '[')
							stack.pop();
						break;
					case ')':
						if (stack.peek() == '(')
							stack.pop();
						break;
					default:
						stack.push(inpt.charAt(i));
						break;
					}
				} else {
					stack.push(inpt.charAt(i));
				}
			}
			out.println(stack.isEmpty());
>>>>>>> refs/remotes/origin/Desktop
		}
		
		out.close();
	}
<<<<<<< HEAD
	
=======
>>>>>>> refs/remotes/origin/Desktop
}
