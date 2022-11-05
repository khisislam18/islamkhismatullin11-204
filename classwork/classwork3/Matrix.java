import java.util.Arrays;

public class Matrix {
    private final int[][] innerMatrix;

    public Matrix(int len){
        innerMatrix = new int[len][len];
    }

    public int getElement(int i, int j){
        return innerMatrix[i][j];
    }

    public void setElement(int i, int j,int value){
        innerMatrix[i][j] = value;
    }

    public int getMatrixSize(){
        return innerMatrix.length;
    }

    public void printMatrix(){
        for (int i = 0; i <innerMatrix.length ; i++) {
            System.out.println(Arrays.toString(innerMatrix[i]));
        }
    }
    public static Matrix sumMatrix(Matrix matrix1, Matrix matrix2){
        int l = matrix1.getMatrixSize();
        Matrix newMatrix = new Matrix(l);
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++){
                newMatrix.setElement(i, j, matrix1.getElement(i,j) + matrix2.getElement(i,j));
            }
        }
        return newMatrix;
    }

    public int[] mainDiagonal(){
        int[] arr = new int[innerMatrix.length];
        for (int i = 0; i < innerMatrix.length; i++) {
            arr[i] = innerMatrix[i][i];
        }
        return arr;
    }

    public int[] oddDiagonal(){
        int[] arr = new int[innerMatrix.length];
        for (int i = 0; i < innerMatrix.length; i++) {
            arr[i] = innerMatrix[i][innerMatrix.length - 1 - i];
        }
        return arr;
    }
}
