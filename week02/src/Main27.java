package main

public class Main27 {
    public static void main(String[] args) {
        int[][] arr = {{10,20,30} , {40,50,60}};
        int sum = 0;

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                sum += arr[i][j];
            } 
        }
        System.out.println("The avarage is: " + sum/6);
    }
}
