/*
Given n non-negative integers representing an elevation map where the width of
each bar is 1, compute how much water it can trap after raining.

Example 1:
    Input: height = [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]
    Output: 6
    Explanation:
    The above elevation map (black section) is represented by array
    [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section)
    are being trapped.
Example 2:
    Input: height = [4, 2, 0, 3, 2, 5]
    Output: 9
Constraints:
    • n == height . length
    • 1 <= n <= 2 * 104
    • 0 <= height [ i ] < = 105

 */

public class D10_Question4 {
    public static void rainwatertrap(int height[]){
        int n = height.length;
        // left max array
        int leftmaxarray[] = new int[n];
        leftmaxarray[0] = height[0];
        for(int i =1;i<n;i++){
            leftmaxarray[i] = Math.max(leftmaxarray[i-1],height[i]);
        }

        // right max array
        int rightmaxarray[] = new int[n];
        rightmaxarray[n-1] = height[n-1];
        for(int i =n-2;i>=0;i--){
            rightmaxarray[i] = Math.max(rightmaxarray[i+1],height[i]);
        }

        //loop
        int watertrapped = 0;
        for(int i =0;i<n;i++){
            // water height
            int waterheight = Math.min(rightmaxarray[i],leftmaxarray[i]);
            // trapped water
            watertrapped += (waterheight - height[i]) * 1;
        }

        System.out.println(watertrapped);

    } 
    public static void main(String[] args){
        int height[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        rainwatertrap(height);
        int height2[] = {4, 2, 0, 3, 2, 5};
        rainwatertrap(height2);
    }
}
