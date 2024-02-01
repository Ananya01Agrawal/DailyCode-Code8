import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();

        int[][] matrix = new int[row][column];

        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        int[][] result = setMatrixZero(matrix);

        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int[][] setMatrixZero(int[][] matrix){
        int row = matrix.length;
        int column = matrix[0].length;

        boolean[] rowZero = new boolean[row];
        boolean[] columnZero = new boolean[column];

        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(matrix[i][j]==0){
                    rowZero[i] = true;
                    columnZero[j] = true;
                }
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(rowZero[i] || columnZero[j]){
                    matrix[i][j] = 0;
                }
            }
        }

        return matrix;
    }
}
