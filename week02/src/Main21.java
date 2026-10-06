package main;

public class Main21 {
    public static void main(String[] args) {
        // Array positions start at 0, and changing an element affects later reads.
        int[] a = new int[5];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;

        int x = a[0] + a[2];
        System.out.println("Value of X: " + x);

        a[2] = 100;
        x = a[0] + a[2];
        System.out.println("Value of X: " + x);
    }
}
