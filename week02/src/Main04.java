package main;

public class Main04 {
    public static void main(String[] args) {
        // && requires both tests; || requires at least one test to pass.
        int x = 22;
        // The else-if handles values that meet only one divisibility test.
        if(x % 2 == 0 && x % 5 == 0){
            System.out.println("Hi");
        }
        else if(x % 2 == 0 || x % 5 == 0){
            System.out.println("Hlw");
        }
        else{
            System.out.println("Fail");
        }
    }
}
