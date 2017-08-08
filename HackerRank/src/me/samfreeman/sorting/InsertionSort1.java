package me.samfreeman.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class InsertionSort1 {
	
	static BufferedReader in;
	static PrintStream out;

	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintStream(System.out);
		complete();
		out.close();
	}

	static void complete() throws IOException {
		int s = Integer.parseInt(in.readLine());
		int[] arr = new int[s];
		String[] input = in.readLine().split(" ");
		
		
		for (int i = 0; i < s; i++) {
			arr[i] = Integer.parseInt(input[i]);
		}
	
		
		for (int i = 0; i < s; i++) {
			int j = i - 1;
			int x = arr[i];
			while (j >= 0 && arr[j] > x) {
				arr[j+1] = arr[j];
				j--;
				printarr(arr);
			}
			arr[j+1] = x;
			
		}
		printarr(arr);
		
		
		
		
		
	}
	static void printarr(int[] arr) {
		 for(int n: arr){
	         out.print(n+" ");
	      }
	        out.println("");
	}
	
}
