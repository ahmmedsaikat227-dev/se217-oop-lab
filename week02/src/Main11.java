package main;

public class Main11 {
    public static void main(String[] args) {
        // break ends the loop as soon as the counter reaches 5.
        for(int i = 1; i <=10; i++){
            System.out.println(i);

            if(i == 5){
                break;
            }
        }
    }
}