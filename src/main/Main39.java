package main;

import java.util.Scanner;

public class Main39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = sc.nextInt();
        System.out.print("Enter y: ");
        int y = sc.nextInt();
        
        System.out.println("Choice 1 = Add, 2 = Subtract, 3 = Multiply, 4 = Divide");
        System.out.print("Choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println(add(x,y));
                break;
            case 2:
                System.out.println(sub(x,y));
                break;
            case 3:
                System.out.println(mul(x,y));
                break;
            case 4:
                System.out.println(div(x,y));
                break;
                
                default:
                    System.out.println("Invalid choice!");
                    break;
                }
        sc.close();
 }
    static int add(int x, int y){
        return x + y;
    }

    static int sub(int x, int y){
        return x - y;
    }
    static int mul(int x, int y){
        return x * y;
    }
    static int div(int x, int y){
        return x / y;
    }
}