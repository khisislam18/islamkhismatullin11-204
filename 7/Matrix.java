public class Matrix {
    private final int[][] innerMatrix;

    public Matrix(int length){
        innerMatrix = new int[length][length];
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

    public static int determinant(Matrix matrix1){
        return matrix1.getElement(0, 0) * matrix1.getElement(1, 1) * matrix1.getElement(2, 2)
                    + matrix1.getElement(0, 1) * matrix1.getElement(1, 2) * matrix1.getElement(2, 0)
                    + matrix1.getElement(0, 2) * matrix1.getElement(2, 1) * matrix1.getElement(1, 0)
                    - matrix1.getElement(0, 2) * matrix1.getElement(1, 1) * matrix1.getElement(2, 0)
                    - matrix1.getElement(0, 1) * matrix1.getElement(2, 2) * matrix1.getElement(1, 0)
                    - matrix1.getElement(0, 0) * matrix1.getElement(1, 2) * matrix1.getElement(2, 1);
    }
    public static int sum(Matrix matrix1){
        int sum = 0;
        for (int i = 0; i < matrix1.getMatrixSize(); i++) {
            for (int j = 0; j < matrix1.getMatrixSize(); j++) {
                sum += matrix1.getElement(i, j);
            }
        }
        return sum;
    }
}
