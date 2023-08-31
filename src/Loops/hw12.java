package Loops;

import java.util.Scanner;

public class hw12 {
    public static void main(String[] args) {
        int sum=0;
        System.out.println("Enter a value: ");
        Scanner inpScanner = new Scanner(System.in);
        int value = inpScanner.nextInt();
        inpScanner.close();
        for (int i = 1; i <= value/2; i++){
            if(value%i==0)sum += i;
        }
        if(value == 1 || value < 1) System.out.println(value+" is not a perfect number.");
        else if(sum == value) System.out.println(value+" is a perfect number.");
        else System.out.println(value+" is not a perfect number.");
    }
}
