package main;

import java.util.Scanner;

public class Main37 {
    public static void main(String[] args) {
        // Pass the user's number to a method that checks its parity.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();

        evenOdd(a);

        sc.close();
    }
    static void evenOdd(int x){
        // An even number has no remainder when divided by 2.
        if(x%2 == 0)
            System.out.println("The number is Even!");
        else
            System.out.println("The number is Odd!");
    }
}
