package BasicConceptsandVariables;
import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double u,a,b,c,area;
        
        System.out.println("Enter the values of Triangle's side lenghts \n a: ");
        a = input.nextDouble();
        System.out.println("b: ");
        b = input.nextDouble();
        System.out.println("c: ");
        c = input.nextDouble();
        input.close();
        u = a+b+c;

        System.out.println("Perimeter is: "+u);
        
        u /= 2;
        area = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Area is: "+area);
    }
}