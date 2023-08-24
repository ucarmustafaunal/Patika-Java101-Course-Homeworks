package BasicConceptsandVariables;
import java.util.Scanner;

public class hw5 {
    public static void main(String[] args) {
        double r, pi = 3.14, a, sa;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        r = input.nextDouble();
        System.out.println("Enter the central angle: ");
        a = input.nextDouble();
        input.close();

        sa = (pi*(r*r)*a)/360;
        System.out.println("Sector Area Value is: "+sa);
    }
}