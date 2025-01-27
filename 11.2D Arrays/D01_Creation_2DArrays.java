import java.util.Scanner;

public class D01_Creation_2DArrays {
    public static void main(String[] args){
        int matrix[][] = new int[3][3];

        // input
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();

        // Output
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
