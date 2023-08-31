package Loops;

import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {
        int n;
        Scanner inpScanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = inpScanner.nextInt();
        inpScanner.close();
        System.out.println("Powers of 4 are: ");
        for (int i = 1; i <= n; i*=4)System.out.println(i);
        System.out.println("Powers of 5 are: ");
        for (int i = 1; i <= n; i*=5)System.out.println(i);
    }
}