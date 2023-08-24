package ConditionalStatementsandScopes;
import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int math, physics, chemistry, turkish, history, music, totalValidClass =0;
        double average = 0;
        String validClasses="", notValidClasses="";
        System.out.println("Enter your grades\n Mathematics Grade: ");
        math= scanner.nextInt();
        if (math>=0 && math<=100){
            validClasses += " Math ";
            average += math;
            ++totalValidClass;
        }
        else notValidClasses += " Math ";

        System.out.println("Physics Grade: ");
        physics = scanner.nextInt();
        if (physics>=0 && physics<=100){
            validClasses += " Physics ";
            average += physics;
            ++totalValidClass;
        }
        else notValidClasses += " Physics ";

        System.out.println("Chemistry Grade: ");
        chemistry = scanner.nextInt();
        if (chemistry>=0 && chemistry<=100){
            validClasses += " Chemistry ";
            average += chemistry;
            ++totalValidClass;
        }
        else notValidClasses += " Chemistry ";

        System.out.println("Turkish Grade: ");
        turkish = scanner.nextInt();
        if (turkish>=0 && turkish<=100){
            validClasses += " Turkish ";
            average += turkish;
            ++totalValidClass;
        }
        else notValidClasses += " Turkish ";

        System.out.println("History Grade: ");
        history = scanner.nextInt();
        if (history>=0 && history<=100){
            validClasses += " History ";
            average += history;
            ++totalValidClass;
        }
        else notValidClasses += " History ";
    
        System.out.println("Music Grade: ");
        music = scanner.nextInt();
        scanner.close();
        if (music>=0 && music<=100){
            validClasses += " Music ";
            average += music;
            ++totalValidClass;
        }
        else notValidClasses += " Music ";

        average /= totalValidClass;
        
        System.out.println("Your Grade is: "+average);
        if(average>=55)System.out.println("You Passed");
        else System.out.println("You Not Passed");
    }
}
