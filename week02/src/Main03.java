package main;

public class Main03 {
    public static void main(String[] args) {
    // Convert before division so the average can include a fractional part.
    int a, b, c;
    a = 15;
    b = 22;
    c = 37;
    

    float avg;
    avg = (float)(a+b+c)/3;
    
    System.out.println("The averaage is: " + avg);
    }
}