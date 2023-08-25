package ConditionalStatementsandScopes;

import java.util.Scanner;

public class hw7 {
    public static void main(String[] args) {
        double distance, price, checkout=0, pricePKM=0.1, totalDiscount=0;
        int age, travelType;
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter the disctance as KM: ");
        distance = inputScanner.nextFloat();
        System.out.println("Enter your age: ");
        age = inputScanner.nextInt();
        System.out.println("Choose your travel type.\n 1: One Way \n 2: Round Trip");
        travelType = inputScanner.nextInt();
        inputScanner.close();

        if(distance<=0 || age <= 0 || (travelType !=1 && travelType != 2))System.out.println("Invalid data entered. System terminated.");
        else {
            price = distance * pricePKM;
            checkout = price;
            if (travelType == 1){
                if (age < 12) {
                    totalDiscount += price * 0.5;
                    checkout -= totalDiscount;
                    System.out.println("Checkout without discount: "+price+"\nTotal Discount: "+totalDiscount+"\nCheckout: "+checkout);
                }
                else if (age >= 12 && age <= 24){
                    totalDiscount += price * 0.1;
                    checkout -= totalDiscount;
                    System.out.println("Checkout without discount: "+price+"\nTotal Discount: "+totalDiscount+"\nCheckout: "+checkout);
                }
                else if (age >= 65){
                    totalDiscount += price * 0.3;
                    checkout -= totalDiscount;
                    System.out.println("Checkout without discount: "+price+"\nTotal Discount: "+totalDiscount+"\nCheckout: "+checkout);
                }
                else {
                    System.out.println("Checkout: "+price);
                }
            }
            else /*travelType == 2*/{
                if(age < 12){
                    totalDiscount += price * 0.5;
                    totalDiscount += price * 0.2;
                    checkout -= totalDiscount;
                    System.out.println("Checkout without discount: "+price+"\nAge Discount: "+(price*0.5)+"\nTravel Type Discount: "
                    +(price*0.2)+"\nTotal Discount"+totalDiscount+"\nCheckout: "+checkout);
                }
                else if(age >= 12 && age <=24){
                    totalDiscount += price * 0.1;
                    totalDiscount += price * 0.2;
                    checkout -= totalDiscount;
                    System.out.println("Checkout without discount: "+price+"\nAge Discount: "+(price*0.1)+"\nTravel Type Discount: "
                    +(price*0.2)+"\nTotal Discount"+
                    totalDiscount+"\nCheckout: "+checkout);
                }
                else if(age >= 65){
                    totalDiscount += price * 0.3;
                    totalDiscount += price * 0.2;
                    checkout -= totalDiscount;
                    System.out.println("Checkout without discount: "+price+"\nAge Discount: "+(price*0.3)+"\nTravel Type Discount: "
                    +(price*0.2)+"\nTotal Discount"+
                    totalDiscount+"\nCheckout: "+checkout);
                }
                else{
                    totalDiscount += price * 0.2;
                    checkout -= totalDiscount;
                    System.out.println("Checkout without discount: "+price+"\n Travel Type Discount: "+totalDiscount+"\nCheckout: "
                    +checkout);
                }
            }
        }
    }
}