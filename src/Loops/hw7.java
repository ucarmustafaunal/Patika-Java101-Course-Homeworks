package Loops;

import java.util.Scanner;

public class hw7 {
    public static void main(String[] args) {
        System.out.println("Enter a number to calculate it's harmonic serie: ");
        Scanner inpScanner = new Scanner(System.in);
        int n = inpScanner.nextInt();
        inpScanner.close();
        double sum = 0;
        for(double i=1; i<=n; i++){
            sum += (1/i);
        }
        System.out.println("Harmonic serie of "+n+" is "+sum);
    }
}