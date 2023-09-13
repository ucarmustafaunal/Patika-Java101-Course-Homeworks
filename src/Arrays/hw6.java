package Arrays;
import java.util.Arrays;

public class hw6 {
    public static void main(String[] args) {
        int[] x = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] y = new int[x.length];

        System.out.println("Array is : "+Arrays.toString(x)+"\nDuplicate numbers are : ");
        for (int i = 0; i < x.length; i++) {
            if (y[i] == 0) {
                int countedValue = 1;
                for (int j = i + 1; j < x.length; j++) {
                    if (x[i] == x[j]) {
                        countedValue++;
                        y[j] = 1;
                    }
                }
                System.out.println(x[i] + " number is " + countedValue + " times recounted.");
            }
        }
    }
}