package Arrays;

public class hw4 {
    static boolean isEvenandDuplicate(int[] arr, int value) {
        for (int i : arr) {
            if ((i == value) && (value % 2 == 0)) {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        int[] list = {2, 4, 3, 3, 6, 5, 2, 4, 7, 9, 5, 9, 13, 14, 14, 15};
    
        for (int i = 0; i < list.length; i++) {
            if (isEvenandDuplicate(list, list[i])) {
                System.out.println(list[i]);
            }
        }
    }
}