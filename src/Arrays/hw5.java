package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class hw5 {

    public static void main(String[] args) {
        System.out.println("Please enter the range of array: ");
        Scanner inpScanner = new Scanner(System.in);
        int n = inpScanner.nextInt();

        int[] list = new int[n];
        for(int i = 0; i<n; i++){
            System.out.println("Please enter "+(i+1)+". number: ");
            list[i] = inpScanner.nextInt();
        }
        inpScanner.close();
        System.out.println("Entered array is : "+Arrays.toString(list));
        Arrays.sort(list);
        System.out.println("Sorted array is : "+Arrays.toString(list));
    }
}