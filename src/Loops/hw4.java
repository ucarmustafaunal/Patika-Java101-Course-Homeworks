package Loops;

import java.util.Scanner;

public class hw4 {

    public static int factorial(int n){
        if(n == 0 || n == 1) return 1;
        return n * factorial(n-1);
    }
    public static void main(String[] args) {
        int n, r, result;
        Scanner inpScanner = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        n = inpScanner.nextInt();
        System.out.println("Enter value of r: ");
        r = inpScanner.nextInt();
        inpScanner.close();

        if(n>=0 && r>=0 && n>=r){
            result = factorial(n) / (factorial(r) * factorial(n-r));
            System.out.println("C("+n+","+r+") = "+result);
        }else System.out.println("Invalid values entered. System terminated");
    }
}