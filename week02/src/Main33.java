package main;

import java.util.Scanner;

public class Main33 {
    public static void main(String[] args) {
        // nextInt reads the next integer token entered by the user.
        Scanner sc = new Scanner(System.in);
        
        int x;
        System.out.print("Enter the value of x: ");
        x = sc.nextInt();
        System.out.println("x = " + x);

        sc.close();
    }
}
