package BasicConceptsandVariables;
import java.util.Scanner;

public class hw7 {
    public static void main(String[] args) {
        double pearKg, pear =2.14 , appleKg, apple = 3.67, tomatoKg, tomato = 1.11, bananaKg, banana =0.95, aubergineKg, aubergine=5, checkout;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the weights of your groceries. Pear: ");
        pearKg = input.nextDouble();
        System.out.println("Apple: ");
        appleKg = input.nextDouble();
        System.out.println("Tomato: ");
        tomatoKg = input.nextDouble();
        System.out.println("Banana: ");
        bananaKg = input.nextDouble();
        System.out.println("Aubergine: ");
        aubergineKg = input.nextDouble();
        input.close();

        checkout = pear*pearKg + apple*appleKg + tomato*tomatoKg + banana*bananaKg + aubergine*aubergineKg;
        System.out.println("Your checkout is: "+checkout+" TL");
    }
}