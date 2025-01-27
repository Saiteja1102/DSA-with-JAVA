/*
Print out the sum of the numbers in the second row of the "nums” array.
Example :
Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
Output - 18
 */

public class D08_Question2 {
    public static void rowsum(int nums[][],int row){
        int sum = 0;
        for(int i =0;i<nums[row-1].length;i++){
            sum += nums[row-1][i];
        }
        System.out.println("Sum = "+sum);
    }
    public static void main(String[] args){
        int nums[][] = { {1,4,9},{11,4,3},{2,2,3} };
        int row = 2;

        rowsum(nums, row);
    }
}
