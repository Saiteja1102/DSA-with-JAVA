/*
Write a program to Find Transpose of a Matrix.
What is Transpose?
Transpose of a matrix is the process of swapping the rows to columns. For a 2x3 matrix,
Matrix
a11 a12 a13
a21 a22 a23

Transposed Matrix
a11 a21
a12 a22
a13 a23

 */

public class D09_Question3 {
    public static void transposematrix(String matrix[][]){
        int n = matrix.length;
        int m = matrix[0].length;
        
        int trN = m;
        int trM = n;
        String transpmatrix[][] = new String[trN][trM];
        for(int i =0;i<trN;i++){
            for(int j =0;j<trM;j++){
                transpmatrix[i][j] = matrix[j][i];
            }
        }

        for(int i = 0;i<transpmatrix.length;i++){
            for(int j =0;j<transpmatrix[0].length;j++){
                System.out.print(transpmatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        String matrix[][] = {{"a11","a12","a13"},
                            {"a21","a22","a23"}};

        transposematrix(matrix);
        
    }
}
