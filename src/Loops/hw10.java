package Loops;

import java.util.Scanner;

public class hw10{
    public static void main(String[] args) {
        System.out.println("Enter the first number: ");
        Scanner inpScanner = new Scanner(System.in);
        int n1 = inpScanner.nextInt();
        System.out.println("Enter the second number: ");
        int n2 = inpScanner.nextInt();
        inpScanner.close();
        int i = 1;
        while (i <= (n1*n2)){
            if(i % n1 == 0 && i % n2 == 0)System.out.println(i);
            i++;
        }
    }
}