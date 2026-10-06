package main;

public class Main25 {
    public static void main(String[] args) {
        // A two-dimensional array is accessed with a row index and a column index.
        int[][] arr = new int[2][3];
        // Unassigned int elements contain the default value 0.
        arr[1][0] = 10;
        arr[1][1] = 20;

        int y = arr[1][0] + arr[1][1];
        System.out.println(y);

    }
}
