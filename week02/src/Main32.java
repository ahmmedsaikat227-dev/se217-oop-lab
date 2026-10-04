package main

public class Main32 {
    public static void main(String[] args) {
        String s = "I        love      Bangladesh";

        String[] a = s.split("\\s+"); // (\\s+) use for find multiple spaces

        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
}
