package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {
        int[] list = {15,12,788,1,-1,-778,2,0};
        int target;
        Scanner inpScanner = new Scanner(System.in);

        int closestSmaller = Integer.MIN_VALUE;
        int closestBigger = Integer.MAX_VALUE;
        System.out.println("Array : "+Arrays.toString(list));
        System.out.println("Enter a target number : ");
        target = inpScanner.nextInt();
        inpScanner.close();

        for (int i : list) {
            if (i <= target && i > closestSmaller) {
                closestSmaller = i;
            }
            if (i >= target && i < closestBigger) {
                closestBigger = i;
            }
        }

        System.out.println("Closest Smaller is : " + closestSmaller);
        System.out.println("Closest Bigger is : " + closestBigger);

    }
}