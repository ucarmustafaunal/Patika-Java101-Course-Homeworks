package Arrays;

public class hw3 {
    public static void main(String[] args) {
        String[][] bWithStars = new String[5][4];

        for(int i = 0; i < bWithStars.length; i ++){
            for (int j = 0; j < bWithStars[i].length; j++){
                if (i == 0 || i == 2 || i == 4){
                    if (j != 3) bWithStars[i][j] = "* ";
                    else bWithStars[i][j] = "  ";
                }
                else if(i == 1 || i == 3){
                    if(j == 1 || j == 2) bWithStars[i][j] = "  ";
                    else bWithStars[i][j] = "* "; 
                }
                else{
                    bWithStars[i][j] = "  ";
                }
            }
        }
        for (int i = 0; i < bWithStars.length; i++) {
            for (int j = 0; j < bWithStars[i].length; j++) {
                System.out.print(bWithStars[i][j]);
            }
            System.out.println();
        }
    }
}