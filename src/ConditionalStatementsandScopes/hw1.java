package ConditionalStatementsandScopes;
import java.util.Scanner;


public class hw1 {
    public static void main(String[] args) {
        int n1,n2, selection;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        n1 = input.nextInt();
        System.out.println("Enter the second number: ");
        n2 = input.nextInt();
        System.out.println("Select the operation that you wanted to return: \n 1: Addition \n 2: Substraction \n 3: Multipication \n 4: Division");
        selection = input.nextInt();
        input.close();

        if(selection == 1)System.out.println("Result is: "+(n1+n2));
        else if(selection == 2)System.out.println("Result is: "+(n1-n2));
        else if(selection == 3)System.out.println("Result is: "+(n1*n2));
        else if(selection == 4)System.out.println("Result is: "+(n1/n2));
        else System.out.println("Please try again and enter selection between 1-4");    
    }
}