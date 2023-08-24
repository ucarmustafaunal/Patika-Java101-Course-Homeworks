package BasicConceptsandVariables;
import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int math, physics, chemistry, turkish, history, music;

        System.out.println("Enter your grades\n Mathematics Grade: ");
        math= scanner.nextInt();

        System.out.println("Physics Grade: ");
        physics = scanner.nextInt();

        System.out.println("Chemistry Grade: ");
        chemistry = scanner.nextInt();

        System.out.println("Turkish Grade: ");
        turkish = scanner.nextInt();

        System.out.println("History Grade: ");
        history = scanner.nextInt();
    
        System.out.println("Music Grade: ");
        music = scanner.nextInt();
        scanner.close();

        double toplam = math+physics+chemistry+turkish+history+music;
        double average = toplam/6;
        
        System.out.println("Your Grade is: "+average);
        boolean isPassed = (average>60) ? true : false;
        String status = (isPassed == true) ? "Passed" : "Not Passed";
        System.out.println(status);
    }
}