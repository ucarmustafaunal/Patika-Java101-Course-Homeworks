package ConditionalStatementsandScopes;
import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int math, physics, chemistry, turkish, history, music;
        double average = 0;
        String validClasses="", notValidClasses="";
        System.out.println("Enter your grades\n Mathematics Grade: ");
        math= scanner.nextInt();
        if (math>=0 && math<=100){
            validClasses += " Math ";
            average += math;
        }
        else notValidClasses += " Math ";

        System.out.println("Physics Grade: ");
        physics = scanner.nextInt();
        if (physics>=0 && physics<=100){
            validClasses += " Physics ";
            average += physics;
        }
        else notValidClasses += " Physics ";

        System.out.println("Chemistry Grade: ");
        chemistry = scanner.nextInt();
        if (chemistry>=0 && chemistry<=100){
            validClasses += " Chemistry ";
            average += chemistry;
        }
        else notValidClasses += " Chemistry ";

        System.out.println("Turkish Grade: ");
        turkish = scanner.nextInt();
        if (turkish>=0 && turkish<=100){
            validClasses += " Turkish ";
            average += turkish;
        }
        else notValidClasses += " Turkish ";

        System.out.println("History Grade: ");
        history = scanner.nextInt();
        if (history>=0 && history<=100){
            validClasses += " History ";
            average += history;
        }
        else notValidClasses += " History ";
    
        System.out.println("Music Grade: ");
        music = scanner.nextInt();
        scanner.close();
        if (music>=0 && music<=100){
            validClasses += " Music ";
            average += music;
        }
        else notValidClasses += " Music ";

        average /= 6;
        
        System.out.println("Your Grade is: "+average+"\nValid Classes are: "+validClasses+"\nNot Valid Classes are: "+notValidClasses);
        if(average>=55)System.out.println("You Passed");
        else System.out.println("You Shall Not Pass");
    }
}