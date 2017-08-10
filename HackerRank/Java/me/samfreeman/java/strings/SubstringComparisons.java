package me.samfreeman.java.strings;
import java.util.Scanner;

public class SubstringComparisons {
  
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        for (int i = 0; i < s.length() - k + 1; i++) {
            String hold = s.substring(i, i+k);
            if (smallest.equals("")) {
                smallest = hold;
            }
            else if (hold.compareTo(smallest) < 0) smallest = hold;
            if (hold.compareTo(largest) > 0) largest = hold;
        }
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
