/*

Given an integer array nums, return true if any value appears at least twice in the
array, and return false if every element is distinct.

Example 1:
    Input: nums = [1, 2, 3, 1]
    Output: true
Example 2:
    Input: nums = [1, 2, 3, 4]
    Output: false
Example 3:
    Input: nums = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2]
    Output: true

Constraints:
    • 1 <= nums . lengtth <= 105
    • -109 <= nums [ i ] <= 109

 */

public class D07_Question1 {
    public static boolean counteritems(int nums[]){
        //int count[] = new int[nums.length];
        int counter = 0;
        for(int i = 0;i<nums.length;i++){
            int key = nums[i];
            for(int j =0;j<nums.length;j++){
                if(key == nums[j]){
                    counter++;
                }
            }
            if(counter >= 2){
                return true;
            }
            counter = 0;
        }
        return false;
    }
    public static void main(String[] args){
        int nums[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(counteritems(nums));
        int nums2[] = {1, 2, 3, 4};
        System.out.println(counteritems(nums2));
        int nums3[] = {1, 2, 3, 1};
        System.out.println(counteritems(nums3));

    }
}
