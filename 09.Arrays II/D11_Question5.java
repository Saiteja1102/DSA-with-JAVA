/*
Given an integer array nums, return all the triplets [nums[i], nums[j],
nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
Notice that the solution set must not contain duplicate triplets.

Example 1:
    Input: nums = [-1, 0, 1, 2,-1,-4]
    Output: [[-1, -1, 2] , [-1, 0, 1]]
Example 2:
    Input: nums = [ ]
    Output: [ ]
Example 3:
    Input: nums = [ 0 ]
    Output: [ ]
Constraints:
    • 0 <= nums . length <= 3000
    • -105 <= nums [ i ] <= 105
 */

public class D11_Question5 {
    public static void triplets(int nums[]){
        for(int i = 0;i<nums.length;i++){
            for(int j =0;j<nums.length;j++){
                for(int k=0;k<nums.length;k++){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        if(i!=j && i!=j && j!=k){
                            System.out.print("["+nums[i]+","+nums[j]+","+nums[k]+"] ,");
                        }
                    }
                }
            }
        }
    }
    public static void main(String[] args){
        int nums[] = {-1, 0, 1, 2,-1,-4};
        triplets(nums);
    }
}


// Answer will be updated in the future
