package Loops;

import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {
        int n, total=0;
        Scanner inpScanner = new Scanner(System.in);
        
        do{
            System.out.println("Enter a number: ");
            n = inpScanner.nextInt();
            if (n % 2 == 0 && n % 4 == 0) total += n;

        }while (n % 2 == 0);
        inpScanner.close();
        System.out.println(total);
    }   
}