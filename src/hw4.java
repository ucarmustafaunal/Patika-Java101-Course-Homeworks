import java.util.Scanner;

public class hw4 {
    public static void main(String[] args) {
        double km, perKm = 2.20, sPrice = 10, mPrice = 20, checkout;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the distance: ");
        km = input.nextDouble();
        input.close();
        
        checkout = km * perKm + sPrice;
        checkout = (checkout > mPrice) ? checkout : mPrice;

        System.out.println("Checkout is: "+checkout);
    }
}