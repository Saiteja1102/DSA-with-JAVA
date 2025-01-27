// Staircase Search
// Time Complexity -> O(n+m)

public class D06_StaircaseSearch {
    public static boolean staircaseSearch(int matrix[][],int key){
        int row = 0,col = matrix[0].length-1;
        while(row < matrix.length && col >= 0){
            // Taking the special cell from above i.e., 
            if(matrix[row][col] == key){
                System.out.println("Key found at cell ("+row+","+col+")");
                return true;
            }
            else if(key > matrix[row][col]){
                // Bottom
                row++;
            }
            else{
                // Left
                col--;
            }
        }
        System.out.println("key not found...");
        return false;
    }
    public static void main(String[] args){
        int matrix[][] = {{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};

        staircaseSearch(matrix, 33);
    }
}
