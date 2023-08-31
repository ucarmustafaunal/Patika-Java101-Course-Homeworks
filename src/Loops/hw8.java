package Loops;

import java.util.Scanner;

/*
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
 */

public class hw8 {
    public static void main(String[] args) {
        int n, spaces, stars;
        System.out.print("Enter a value for Diamond with Stars: ");
        Scanner inpScanner = new Scanner(System.in);
        n = inpScanner.nextInt();
        inpScanner.close();

        spaces = n - 1;
        stars = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
            spaces--;
            stars += 2;
        }

        spaces = 1;
        stars = n * 2 - 3;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
            spaces++;
            stars -= 2;
        }
    }
}