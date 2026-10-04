package main

public class Main04 {
    public static void main(String[] args) {
        int x = 22;
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
