package Methods;

import java.util.Scanner;

public class hw4 {
    public static int calculateExponent(int i, int j){
        if(j < 0) throw new IllegalArgumentException("Negative exponent entered.");
        else if(j == 0) return 1;
        else return i * calculateExponent(i, j-1);
    }
    public static void main(String[] args) {
        System.out.println("Enter base value: ");
        Scanner inpScanner = new Scanner(System.in);
        int i = inpScanner.nextInt();
        System.out.println("Enter exponent value: ");
        int j = inpScanner.nextInt();
        inpScanner.close();

        System.out.println(calculateExponent(i,j));
    }
}