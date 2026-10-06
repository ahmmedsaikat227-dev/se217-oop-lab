package main;

public class Main31 {
    public static void main(String[] args) {
        // Both delimiters split on whitespace; one is literal and one is a regex.
        String s = "I love Bangladesh";

        String[] a = s.split(" ");   //both use for space
        // The regex whitespace character class can match tabs as well as spaces.
        String[] b = s.split("\\s"); 


        // Both loops display the words produced by their respective split calls.
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
        System.out.println();
        for(int i = 0; i < b.length; i++){
            System.out.println(b[i]);
        }
    }
}
