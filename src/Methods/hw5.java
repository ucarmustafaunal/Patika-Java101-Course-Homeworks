package Methods;

import java.util.Scanner;

public class hw5 {
    public static Boolean isPrime(int i, int j){
        if (j<=1) return true;
        if (i % j == 0) return false;
        return isPrime(i, j-1);
    }

    public static void main(String[] args) {
        System.out.println("Enter a value: ");
        Scanner inpScanner = new Scanner(System.in);
        int value = inpScanner.nextInt();
        inpScanner.close();

        boolean result = isPrime(value, value-1);
        if (result) System.out.println(value+" is a Prime number.");
        else System.out.println(value+" is not a Prime number.");
    }
}