import java.util.Scanner;

public class hw6 {
    public static void main(String[] args) {
        double height, weight, bmi;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your height as meter: ");
        height = input.nextDouble();
        System.out.println("Enter your weight as kilogram: ");
        weight = input.nextDouble();
        input.close();

        bmi = weight/(height*height);
        System.out.println("Your BMI is: "+bmi);
    }
}