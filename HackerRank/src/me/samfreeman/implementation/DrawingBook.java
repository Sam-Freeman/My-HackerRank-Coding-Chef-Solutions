package me.samfreeman.implementation;

import java.util.Scanner;

public class DrawingBook {
	static int solve(int n, int p){
        int d2_front = p/2; // Distance to front
        int d2_back = (n / 2) - (p / 2); // Distance to back
       
        return (d2_front < d2_back) ? d2_front : d2_back;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
        in.close();
    }
}
