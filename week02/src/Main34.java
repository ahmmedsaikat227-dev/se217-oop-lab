package main

import java.util.Scanner;

public class Main34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter s1: ");
        String s1 = sc.nextLine(); //full line
        System.out.print("Enter s2: ");
        String s2 = sc.next(); //only one word

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);

        sc.close();
    }
}