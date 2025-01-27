// Searching

import java.util.Scanner;

public class D02_Search_in_2DArray {
    public static boolean search(int matrix[][],int key){
        for(int i =0;i<matrix.length;i++){
            for(int j =0;j<matrix[0].length;j++){
                if(matrix[i][j] == key){
                    System.out.println("Found at cell ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        
        // input
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();


        search(matrix, 2);
    }
}
