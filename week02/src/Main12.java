package main;

public class Main12 {
    public static void main(String[] args) {
        // continue skips even values and moves to the next iteration.
        for(int i = 1; i <=10; i++){

            // Only odd values reach the print statement below.
            if(i % 2 == 0)
                continue;
            
            System.out.println(i);
        }
    }
}