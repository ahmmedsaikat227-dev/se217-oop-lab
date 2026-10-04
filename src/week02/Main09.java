package week02;

public class Main09 {
    public static void main(String[] args) {
        int x = 5;

        
        System.out.println(x++); 
        System.out.println(++x);

        x = 5;

        System.out.println(x--);
        System.out.println(--x);

        int s = 10 + 2 * 4 - 3; // Follow the precedence
        System.out.println(s);
    }
}
