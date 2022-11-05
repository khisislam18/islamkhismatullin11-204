import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(2);
        Matrix matrix2 = new Matrix(2);
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < matrix1.getMatrixSize(); i++) {
            for (int j = 0; j <matrix1.getMatrixSize() ; j++) {
                matrix1.setElement(i,j,scanner.nextInt());
            }
        }
        matrix1.printMatrix();
        for (int i = 0; i < matrix2.getMatrixSize(); i++) {
            for (int j = 0; j <matrix2.getMatrixSize() ; j++) {
                matrix2.setElement(i,j,scanner.nextInt());
            }
        }
        matrix2.printMatrix();
        System.out.println("Sum matrix: ");
        Matrix.sumMatrix(matrix1, matrix2).printMatrix();
        System.out.println("Arrays of main diagonal: ");
        System.out.println(Arrays.toString(matrix1.mainDiagonal()));
        System.out.println(Arrays.toString(matrix2.mainDiagonal()));
        System.out.println(Arrays.toString(Matrix.sumMatrix(matrix1, matrix2).mainDiagonal()));
        System.out.println("Arrays of odd diagonal: ");
        System.out.println(Arrays.toString(matrix1.oddDiagonal()));
        System.out.println(Arrays.toString(matrix2.oddDiagonal()));
        System.out.println(Arrays.toString(Matrix.sumMatrix(matrix1, matrix2).oddDiagonal()));
    }
}