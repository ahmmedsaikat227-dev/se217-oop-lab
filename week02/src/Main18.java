package main;

public class Main18 {
    public static void main(String[] args) {
        // The inner loop runs four times for each outer-loop iteration.
        int i, j;
        for(i = 0; i <= 2; i++){
            System.out.println("Outer loop start:");

            for(j = 0; j <= 3; j++){
                System.out.println("Hi");

            }
            System.out.println("Outer loop end");
        }
    }
}
