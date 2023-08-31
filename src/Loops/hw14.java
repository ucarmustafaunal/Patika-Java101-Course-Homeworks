package Loops;

public class hw14 {
    public static void main(String[] args) {
        for(int i = 2; i <= 100; i++){
            Boolean isntPrime = false;
            for(int j = 2; j < i; j++){
                if (i % j == 0){
                    isntPrime = true;
                    break;
                }
            }
            if(isntPrime==false)System.out.print(i+" ");
        }
    }
}