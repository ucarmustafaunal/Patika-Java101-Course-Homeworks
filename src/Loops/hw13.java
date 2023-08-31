package Loops;

import java.util.Scanner;

public class hw13 {
    public static void main(String[] args) {
        Scanner inpScanner=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=inpScanner.nextInt();
        inpScanner.close();

        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }   
            for(int k=2*n-1;k>=(2*i+1);k--){
                System.out.print("*");
            }
                System.out.println();
        }
    }
}