package main;

public class Main31 {
    public static void main(String[] args) {
        String s = "I love Bangladesh";

        String[] a = s.split(" ");   //both use for space
        String[] b = s.split("\\s"); 


        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
        System.out.println();
        for(int i = 0; i < b.length; i++){
            System.out.println(b[i]);
        }
    }
}
