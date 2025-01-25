public class D10_Subarrays_Question {
    public static void subarraysSum(int numbers[]){
        int minSub = Integer.MAX_VALUE;
        int maxSub = Integer.MIN_VALUE;
        for(int i =0;i<numbers.length;i++){
            int start = i;
            for(int j = i;j<numbers.length;j++){
                int end = j;
                int subSum = 0;
                for(int k = start;k<=end;k++){
                    System.out.print(numbers[k]+" ");
                    subSum = numbers[k] + subSum;
                }
                System.out.print(" : ");
                System.out.println("Sum of Subarray = "+subSum);
                if(subSum < minSub){
                    minSub = subSum;
                }
                if(subSum > maxSub){
                    maxSub = subSum;
                }
            }
            System.out.println();
        }

        System.out.println("Minimum Subarray Sum = "+minSub);
        System.out.println("Maximum Subarray Sum = "+maxSub);
    }
    public static void main(String[] args){
        int numbers[] = {2,4,6,8,10};
        subarraysSum(numbers);
    }
}
