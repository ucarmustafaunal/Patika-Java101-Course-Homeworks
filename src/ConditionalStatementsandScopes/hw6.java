package ConditionalStatementsandScopes;

import java.util.Scanner;

public class hw6 {

    public static boolean isBetween(int value, int min, int max){
        return value >= min && value <= max;
    }
    public static void main(String[] args) {
        int month, day, minMonth=1, maxMonth=12, minDay=1, maxDay=31;
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter your birth Month: ");
        month = inputScanner.nextInt();
        System.out.print("Enter your birth Day: ");
        day = inputScanner.nextInt();
        inputScanner.close();
        
        System.out.print("Your Zodiac Sign is");
        if (!(isBetween(month, minMonth, maxMonth) && isBetween(day, minDay, maxDay)))
        System.out.println(" cannot be calculated because of your values that entered. System terminated.");
        else if (month == 1){
            if (day > 21)System.out.println(": Aquarius");
            else System.out.println(": Capricorn");
        }
        else if (month == 2){
            if (day > 19) System.out.println(": Pisces");
            else System.out.println(": Aquarius");
        }
        else if (month == 3){
            if (day > 20) System.out.println(": Aries");
            else System.out.println(": Pisces");
        }
        else if (month == 4){
            if (day > 20) System.out.println(": Taurus");
            else System.out.println(": Aries");
        }
        else if (month == 5){
            if (day > 21)System.out.println(": Gemini");
            else System.out.println(": Taurus");
        }
        else if (month == 6){
            if (day > 22)System.out.println(": Cancer");
            else System.out.println(": Gemini");
        }
        else if (month == 7){
            if(day > 22)System.out.println(": Leo");
            else System.out.println(": Cancer");
        }
        else if (month == 8){
            if(day > 22)System.out.println(": Virgo");
            else System.out.println(": Leo");
        }
        else if (month == 9){
            if (day > 22) System.out.println(": Libra");
            else System.out.println(": Virgo");
        }
        else if (month == 10){
            if (day > 22) System.out.println(": Scorpio");
            else System.out.println(": Libra");
        }
        else if (month == 11){
            if (day > 21) System.out.println(": Sagittarius");
            else System.out.println(": Scorpio");
        }
        else {
            if (day > 21) System.out.println(": Capricorn");
            else System.out.println(": Saggitarius");
        }
    }
}