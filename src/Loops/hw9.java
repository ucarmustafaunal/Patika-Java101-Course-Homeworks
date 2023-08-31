package Loops;

import java.util.Scanner;

public class hw9 {
    public static void main(String[] args) {
        String userName, password;
        int right = 3, balance = 3000, selection = 0;
        Scanner inpScanner = new Scanner(System.in);
        while (right > 0) {
            System.out.print("Enter your Username: ");
            userName = inpScanner.nextLine();
            System.out.print("Enter your Password: ");
            password = inpScanner.nextLine();

            if (userName.equals("patika") && password.equals("java101")) {
                System.out.println("Welcome to the Patika Bank!");

                do {
                    System.out.println("1- Deposit\n" +
                            "2- Withdraw\n" +
                            "3- Check Balance\n" +
                            "4- Logout");
                    System.out.print("Please select the desired operation: ");
                    selection = inpScanner.nextInt();

                    switch (selection) {
                        case 1:
                            System.out.print("Deposit amount: ");
                            int depositAmount = inpScanner.nextInt();
                            balance += depositAmount;
                            System.out.println("Your new balance is: " + balance);
                            break;
                        case 2:
                            System.out.print("Your balance is: ");
                            int withdrawAmount = inpScanner.nextInt();
                            if (withdrawAmount > balance) {
                                System.out.println("Not enough balance.");
                            } else {
                                balance -= withdrawAmount;
                                System.out.println("Your new balance is: " + balance);
                            }
                            break;
                        case 3:
                            System.out.println("Your balance is: " + balance);
                            break;
                        case 4:
                            System.out.println("Have a great day.");
                            break;
                        default:
                            System.out.println("Incorrect input.");
                            break;
                    }
                } while (selection != 4);

                break;
            } else {
                right--;
                System.out.println("Incorrect username or password. Please try again.");
                if (right == 0) {
                    System.out.println("Your account is blocked for your security. Please get contact with our customer service.");
                } else {
                    System.out.println("Your attempts left: " + right);
                }
            }
        }
        inpScanner.close();
    }
}