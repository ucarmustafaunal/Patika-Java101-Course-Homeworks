package Loops;

import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) throws Exception {
        Scanner inpScanner = new Scanner(System.in);
        int a, count=0, total=0;
        System.out.println("Enter a number: ");
        a = inpScanner.nextInt();
        inpScanner.close();
        for(int i = 1; i <= a; i++){
            if(i%3==0 && i%4==0){
                total+=i;
                ++count;
                System.out.println(i);
            }
        }
        System.out.println("The average of numbers divisible by 3 and 4 according to the input you provided: "+total/count);
    }
}
