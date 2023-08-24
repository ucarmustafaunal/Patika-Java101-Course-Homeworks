package ConditionalStatementsandScopes;
import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {
        String userName, passWord, selection;
        Scanner input = new Scanner(System.in);

        System.out.println("Username: ");
        userName = input.nextLine();
        System.out.println("Password: ");
        passWord = input.nextLine();

        if(userName.equals("patika") && passWord.equals("java101"))System.out.println("Logged In Successfully");
        else{
            System.out.println("Your values are incorrect. Do you want to change password? \n Y/N ? ");
            selection = input.nextLine();
            if(selection.equals("Y") || selection.equals("y")){
                System.out.println("Enter new password: ");
                passWord = input.nextLine();
                if(passWord.equals("java101"))System.out.println("New password cannot be same with the old password. Program Terminated.");
                else System.out.println("Password changing is completed.");
            }
            else if(selection.equals("N") || selection.equals("n"))System.out.println("Program Terminated.");
            else System.out.println("Wrong input entered. Program Terminated.");
        }
        input.close();
    }
}