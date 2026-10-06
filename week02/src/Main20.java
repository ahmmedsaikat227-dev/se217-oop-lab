package main;

public class Main20 {
    public static void main(String[] args) {
        // The inner loop adds one more star on each new row.
        for(int i = 1; i <= 5; i++){
            // Use the row number as the number of stars to print.
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
