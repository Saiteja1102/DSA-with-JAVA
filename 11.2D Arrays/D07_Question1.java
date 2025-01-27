/*
Print the number of 7’s that are in the 2d array.
Example :
Input - int[][] array = { {4,7,8},{8,8,7} };
Output - 2
 */

public class D07_Question1 {
    public static void searchcount(int array[][],int key){
        int count = 0;
        for(int i=0;i<array.length;i++){
            for(int j = 0;j<array[0].length;j++){
                if(array[i][j] == key){
                    count++;
                }
            }
        }
        System.out.println("Total number of "+key+"'s is: "+count);
    }
    public static void main(String[] args){
        int array[][] = { {4,7,8},{8,8,7} };
        int key = 7;

        searchcount(array, key);
    }
}
