package ConditionalStatementsandScopes;

import java.util.Scanner;

public class hw9 {
    public static void main(String[] args) {
        int year;
        Scanner inpScanner = new Scanner(System.in);
        System.out.println("Enter a year: ");
        year = inpScanner.nextInt();
        inpScanner.close();
        if(!(year%400 == 0)){
            if(!(year%100 == 0)){
                if(year%4 == 0)System.out.println(year+" is a Leap Year");
                else System.out.println(year+" is not a Leap Year");
            }
            else System.out.println(year+" is not a Leap Year");
        }
        else System.out.println(year+" is not a Leap Year");
    }
}