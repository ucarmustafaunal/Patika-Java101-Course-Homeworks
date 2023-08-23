import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {
        double chekout, taxAmount, tax;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the Price: ");
        double price = input.nextDouble();
        input.close();

        tax = (price < 1000) ? 0.18 : 0.08;
        taxAmount = price*tax;
        chekout = price+taxAmount;

        System.out.print("Price: "+price);
        System.out.println("Tax: "+tax);
        System.out.println("Tax Amount: "+taxAmount);
        System.out.println("Checkout: "+chekout);
    }
}