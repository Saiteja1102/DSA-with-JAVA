// Counting Sort
// is used mostly for positive numbers
// and for a near range values

/*
Steps:
    1. Find the largest number in the arr
    2. Create a counting(frequency) arr for each number
    3. Sort by decreasing the frequency
*/


public class D05_CountingSort {
    public static void countingSort(int arr[]){
        // Find the largest number in the arr
        int largest = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            largest = Math.max(largest,arr[i]);
        }

        // Create a counting(frequency) arr for each number
        int countingarr[] = new int[largest+1];
        for(int i=0;i<arr.length;i++){
            countingarr[arr[i]]++;
        }

        // Sort by decreasing the frequency
        int j = 0;
        for(int i = 0;i<countingarr.length;i++){
            while(countingarr[i] > 0){
                arr[j] = i;
                j++;
                countingarr[i]--;
            }
        }
    }
    public static void main(String[] args){
        int arr[] = {1,2,1,3,4,3,4,7};
        countingSort(arr);
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
