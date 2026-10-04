package main

public class Main13 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 30; i <= 120; i++){
            if(i % 3 == 0 && i % 5 == 0){
                sum += i;
            }
        }
        System.out.println("The sum is: " + sum);
    }
}
