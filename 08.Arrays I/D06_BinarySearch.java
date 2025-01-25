// Binary Search
// Time Complexity -> O(log n) 

public class D06_BinarySearch {

    public static int binarySearch(int numbers[],int key){
        int start = 0;
        int end = numbers.length - 1;

        while(start <= end){
            int mid = (start + end)/2;

            // comparisons
            if(numbers[mid] == key){
                return mid;
            }

            if(numbers[mid] > key){ // Left
                end = mid - 1;
            }
            else{ // Right
                start = mid + 1;
            }
        }

        return -1;
    }
    public static void main(String[] args){
        int numbers[] = {2,4,6,8,10,12,14};
        int key = 12;

        System.out.println("Key is at a index : "+binarySearch(numbers, key));
    }
}
