// Max SubArray Sum
// Kadanes Algorithm
// Time Complexity -> O(n)

public class D03_MaxSubArraySum_Kadanes {
    public static void MaxSubArraySum_Kadanes(int numbers[]){
        int max_SubSum = Integer.MIN_VALUE;
        int max_SubSum2 = Integer.MIN_VALUE;
        int currentSum = 0;

        // if all negative values in arrays -> Special Case
        for(int i = 0;i<numbers.length;i++){
            if(numbers[i]>0){
                break;
            }
            else{
                if(max_SubSum2 < numbers[i]){
                    max_SubSum2 = numbers[i];
                }
            }
        }

        for(int i =0;i<numbers.length;i++){
            currentSum = currentSum + numbers[i];
            if(currentSum < 0){
                currentSum = 0;
            }

            if(currentSum > max_SubSum){
                max_SubSum = currentSum;
            }
        }

        //System.out.println("Max SubArray Sum = "+max_SubSum);

        if(max_SubSum > 0){
            System.out.println("Max SubArray Sum = "+max_SubSum);
        }
        else{
            System.out.println("Max SubArray Sum = "+max_SubSum2);
        }
    }
    public static void main(String[] args){
        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        MaxSubArraySum_Kadanes(numbers);

        int into[] = {-6,-2,-3,-4,-1,-9,-8,-4};
        MaxSubArraySum_Kadanes(into);
    }
}
