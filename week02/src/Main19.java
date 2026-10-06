package main;

public class Main19 {
    public static void main(String[] args) {
        // Nested loops print three rows with four stars in each row.
        int i, j;
        for(i = 0; i <= 2; i++){
            // Print one row of stars before moving to the next row.
            for(j = 0; j <= 3; j++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
