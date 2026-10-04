package main;

public class Main29 {
    public static void main(String[] args) {
        String s = "Dhaka, Bangladesh";
        
        System.out.println(s.length());
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.charAt(0));

        String s1 = "Dhaka";
        String s2 = "dhaka";

        if(s1.equals(s2)){
            System.err.println("Equal");
        }
        else{
            System.out.println("Not equal");
        }

        if(s1.equalsIgnoreCase(s2)){  // ignore case
            System.err.println("Equal");
        }
        else{
            System.out.println("Not equal");
        }
    }
}
