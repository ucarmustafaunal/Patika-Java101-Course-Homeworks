package Methods;

import java.util.Scanner;

public class hw6 {
    public static void function(int currentNumber, int targetNumber) {
        System.out.print(currentNumber + " ");
        
        if (currentNumber <= 0 && currentNumber != targetNumber) function(currentNumber + 5, targetNumber);
        else if (currentNumber < targetNumber) function(currentNumber + 5, targetNumber);
        
    }

    public static void main(String[] args) {
        Scanner inpScanner = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int number = inpScanner.nextInt();
        inpScanner.close();
        
        if (number <= 0) System.out.println("Entered value must be higher than 0");
        else {
            System.out.println("Iterations: ");
            function(number, number);
        }
    }
}