// Diagonal Sum

public class D05_DiagonalSum {
    public static void diagonalsumbrute(int matrix[][]){ // O(n^2)
        // Brute force method
        int sum = 0;
        for(int i =0;i<matrix.length;i++){
            for(int j =0;j<matrix[0].length;j++){
                // Primary Diagonal
                if(i==j){
                    sum += matrix[i][j];
                }
                else if(i+j == matrix.length-1){ // Secondary Diagonal
                    sum += matrix[i][j];
                }
            }
        }
        System.out.println("Diagonal Sum = "+sum);
    }

    public static void diagonalsumopti(int matrix[][]){ // O(n)
        int sum = 0;
        for(int i =0;i<matrix.length;i++){
            // Primary diagonal
            sum += matrix[i][i];

            // Secondary diagonal
            // i + j = n - 1
            // j = n - i - 1
            if(i != matrix.length-i-1){
                sum += matrix[i][matrix.length-i-1];
            }
        }
        System.out.println("Optimized sum = "+sum);
    }
    public static void main(String[] args){
        int matrix[][] = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        
        diagonalsumbrute(matrix);
        diagonalsumopti(matrix);
    }
}
