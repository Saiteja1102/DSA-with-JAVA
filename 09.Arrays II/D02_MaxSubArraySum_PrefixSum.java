// Max SubArray Sum
// Prefix Sum Method 
// Time Complexity -> O(n^2)

public class D02_MaxSubArraySum_PrefixSum {
    public static void MaxSubArraySum_Prefix(int numbers[]){
        int maxSubSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];

        // prefix values adding
        for(int i = 1;i<numbers.length;i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }

        for(int i =0;i<numbers.length;i++){
            int start = i;
            for(int j =i;j<numbers.length;j++){
                int end = j;
                int subSum = 0;
                if(start == 0){
                    subSum = prefix[end];
                }
                else{
                    subSum = prefix[end] - prefix[start-1];
                }

                // Maxsub Comparision
                if(maxSubSum < subSum){
                    maxSubSum = subSum;
                }
            }
        }

        System.out.println("max SubArray Sum : "+maxSubSum);
    }
    public static void main(String[] args){
        int numbers[] = {1,-2,6,-1,3};
        MaxSubArraySum_Prefix(numbers);
    }
}
