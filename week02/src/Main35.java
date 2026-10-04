package week02;

public class Main35 {
    public static void main(String[] args) {
        System.out.println("Program start: ");
        sayHi();

        System.out.println("Sum is: " + getSum(10,20));
    }
    static int getSum (int x, int y){
        int sum = x + y;
        return sum;
    }

    static void sayHi(){
        System.out.println("Hi");
    }
}
