package main;

public class Main23 {
    public static void main(String[] args) {
        // The <= bound reaches index x.length, which is outside the valid indices.
        int[] x = {11, 34, 55, -67, 57};
        
        for(int i = 0; i <= x.length; i++){
            System.out.println(x[i]);
        }
    }
}
