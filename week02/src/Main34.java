package main;

import java.util.Scanner;

public class Main34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Compare reading an entire line with reading a single token.
        System.out.print("Enter s1: ");
        String s1 = sc.nextLine(); //full line
        System.out.print("Enter s2: ");
        String s2 = sc.next(); // Read the next whitespace-delimited token.

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);

        sc.close();
    }
}