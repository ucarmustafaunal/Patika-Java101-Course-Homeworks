package Arrays;

public class hw7 {

    public static int[][] transposeMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        int[][] transpoze = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpoze[j][i] = matrix[i][j];
            }
        }
        return transpoze;
    }

    public static void printMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] x = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] y = transposeMatrix(x);

        System.out.println("Base Matrix :");
        printMatrix(x);

        System.out.println("Transposed Matrix :");
        printMatrix(y);
    }
}