package main;

public class Main06 {
    public static void main(String[] args) {
        // Compare the character with each lowercase vowel.
        char ch;
        ch = 'a';
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonant");
        }
    }
}
