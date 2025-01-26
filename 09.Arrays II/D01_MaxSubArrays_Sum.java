// Maximum SubArray Sum
// Time Complexity = O(n^3) -> because 3 loops

// Brute Force Method
public class D01_MaxSubArrays_Sum {
    public static void maxSubArraysSum(int numbers[]){
        int maxSubSum = Integer.MIN_VALUE;
        for(int i =0;i<numbers.length;i++){
            int start = i;
            for(int j = i;j<numbers.length;j++){
                int end = j;
                int subarraySum = 0;
                for(int k = start;k<=end;k++){
                    subarraySum = numbers[k] + subarraySum;
                }
                if(subarraySum > maxSubSum){
                    maxSubSum = subarraySum;
                }
            }
        }

        System.out.println("Max SubArray Sum = "+maxSubSum);
    }
    public static void main(String[] args){
        int numbers[] = {1,-2,6,-1,3};
        maxSubArraysSum(numbers);
    }
}
