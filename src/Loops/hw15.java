package Loops;

import java.util.Scanner;

public class hw15 {
    public static void main(String[] args) {
        System.out.println("Enter the size of Fibonacci Series: ");
        Scanner inpScanner = new Scanner(System.in);
        int size = inpScanner.nextInt();
        inpScanner.close();

        int n1=0, n2=1, n3;
        System.out.print(n1+" "+n2+" ");
        for(int i=2; i<=size; i++){
            n3 = n1+n2;
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;
        }
    }
}