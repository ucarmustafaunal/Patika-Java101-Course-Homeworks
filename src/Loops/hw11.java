package Loops;

import java.util.Scanner;

public class hw11 {
    public static void main(String[] args) {
        int i=0, n, max, min;
        
        System.out.println("Enter how many values you want to enter: ");
        Scanner inpScanner = new Scanner(System.in);
        n = inpScanner.nextInt();
        int[] numbers = new int[n];
        while(i<n){
            System.out.println("Enter "+(i+1)+". number: ");
            numbers[i] = inpScanner.nextInt();
            i++;
        }
        inpScanner.close();
        min = numbers[0];
        max = numbers[0];
        for (i=0; i<n; i++){
            if(numbers[i]< min){
                min = numbers[i];
            }
            else if(numbers[i]> max){
                max = numbers[i];
            }
        }
        System.out.println("Min number is: "+min+" and Max number is: "+max);
    }
}