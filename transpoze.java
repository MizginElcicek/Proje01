package Kodluyoruz;

public class transpoze {
    public static void main(String[] args) {
        int [][] matrix = { {5,3,8},
                {2,6,7} };
        System.out.println("İlk Değişken");
        printArray(matrix);
        System.out.println("Son Değişken");
        change(matrix);
    }
    public static void change (int [][] matrix) {
        int [][] newMatrix = new int [matrix[0].length][matrix.length];
        for (int rows = 0; rows < matrix.length; rows++) {
            for (int col = 0; col < matrix[0].length; col++) {
                newMatrix[col][rows] = matrix [rows][col];
            }
        }
        printArray(newMatrix);
    }
    public static void printArray(int [][] matrix) {
        for (int [] rows : matrix) {
            for (int col : rows) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
