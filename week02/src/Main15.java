package main;

public class Main15 {
    public static void main(String[] args) {
        // Add successive multiples of 5 from 5 through 100.
        int i = 5, sum = 0;

        while(i <= 100){
            sum += i;
            i+=5;
        }
        System.out.println("The sum is: " + sum);
    }
}
