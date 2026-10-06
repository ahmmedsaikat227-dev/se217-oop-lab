package main;

public class Main30 {
    public static void main(String[] args) {
        // split uses the given delimiter to divide a string into parts.
        String s = "I@love@Bangladesh";

        String[] a = s.split("@");

        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
}
