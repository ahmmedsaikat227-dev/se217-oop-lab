package week02;

import java.util.Scanner;

public class Main37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();

        evenOdd(a);

        sc.close();
    }
    static void evenOdd(int x){
        if(x%2 == 0)
            System.out.println("The number is Even!");
        else
            System.out.println("The number is Odd!");
    }
}
