package ConditionalStatementsandScopes;
import java.util.Scanner;

public class hw4 {
    public static void main(String[] args) {
        int tempature;
        System.out.println("Enter the tempature");
        Scanner input = new Scanner(System.in);
        tempature = input.nextInt();
        input.close();
        System.out.println("You can go to ");
        if (tempature < 5)System.out.println("Ski");
        else if( tempature <= 25){
            if (tempature <= 15)System.out.println(" Sinema ");
            if(tempature >= 10)System.out.println(" Picnic ");
        } else System.out.println(" Swim");
    }
}