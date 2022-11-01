import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(3);
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < matrix1.getMatrixSize(); i++) {
            for (int j = 0; j < matrix1.getMatrixSize(); j++) {
                matrix1.setElement(i,j, scanner.nextInt());
            }
        }
        if(matrix1.getMatrixSize() == 3){
            System.out.println("Determinant of matrix = " + Matrix.determinant(matrix1));
        }
        System.out.println("Sum of elements of matrix = " + Matrix.sum(matrix1));
    }
}
