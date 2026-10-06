package main;

public class Main17 {
    public static void main(String[] args) {
        // The body runs once before this initially false condition is checked.
        int x = -30;
        do{
            System.out.println("Hi");
            x++;
        } while(x >= -25);
    }
}
