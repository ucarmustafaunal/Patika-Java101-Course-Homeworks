package Loops;

import java.util.Scanner;

public class hw5 {
    public static void main(String[] args) {
        int base,exponent,result=1;
        Scanner inpScanner = new Scanner(System.in);
        System.out.println("Enter the base: ");
        base = inpScanner.nextInt();
        System.out.println("Enter the exponent: ");
        exponent = inpScanner.nextInt();
        inpScanner.close();

        for(int i = 0; i < exponent; i++)result *= base;
        System.out.println("Result is: "+result);
    }
}