package main;

public class Main38 {
    public static void main(String[] args) {
        divisors(10);
    }
    static void divisors(int num){
        for(int i = 1; i <= num; i++){
            if(num % i == 0)
                System.out.println(i);
        }
    }
}
