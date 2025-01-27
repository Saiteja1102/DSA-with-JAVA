// Largest element and Smallest element

import java.util.Scanner;

public class D03_Largest_Smallest_in_2DArray {
    // For Largest element
    public static void largestnum(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        for(int i =0;i<matrix.length;i++){
            for(int j =0;j<matrix[0].length;j++){
                if(largest < matrix[i][j]){
                    largest = matrix[i][j];
                }
            }
        }
        System.out.println("Largest number = "+largest);
    }

    // For Smallest element
    public static void smallestnum(int matrix[][]){
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j =0;j<matrix[0].length;j++){
                if(smallest > matrix[i][j]){
                    smallest = matrix[i][j];
                }
            }
        }
        System.out.println("Smallest number = "+smallest);
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];

        // input
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<matrix.length;i++){
            for(int j =0;j<matrix[0].length;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();

        // largest
        largestnum(matrix);

        // smallest
        smallestnum(matrix);
    }
}
