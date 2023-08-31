package Loops;

import java.util.Scanner;

public class hw6 {
    public static void main(String[] args) {
        int number, temp, digit, sum=0;
        System.out.println("Enter a number: ");
        Scanner inpScanner = new Scanner(System.in);
        number = inpScanner.nextInt();
        inpScanner.close();
        temp = number;
        while (number > 0){
            digit = number % 10;
            sum += digit;
            number /= 10;
        }
        System.out.println("Number is: "+temp+" and Sum of Digits are: "+sum);
    }
}