/*
Use the following sorting algorithms to sort an array in DESCENDING order :
a. Bubble Sort
b. Selection Sort
c. Insertion Sort
d. Counting Sort

You can use this array as an example : [3, 6, 2, 1, 8, 7, 4, 5, 3, 1]
 */

public class D06_Question1 {
    public static void printArr(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    // bubble sort
    public static void bubblesort(int arr[]){
        for(int i = 0;i<arr.length-1;i++){
            for(int j = 0;j<arr.length-1-i;j++){
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    // selection sort
    public static void selectionsort(int arr[]){
        for(int i =0;i<arr.length;i++){
            int min = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            // swap
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    // Insertion sort 
    public static void insertionsort(int arr[]){
        for(int i =1;i<arr.length;i++){  
            int curr = arr[i];
            int prev = i-1;

            while(prev >= 0 && arr[prev] > curr){
                arr[prev + 1] = arr[prev];
                prev--;
            }

            arr[prev+1] = curr;
        }
    }

    // counting sort
    public static void countingsort(int arr[]){
        // 1. Find the largest number in the array
        int largest = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            largest = Math.max(largest,arr[i]);
        }

        // 2. Create a counting(frequency) array
        int countarr[] = new int[largest+1];
        for(int i =0;i<arr.length;i++){
            countarr[arr[i]]++;
        }

        // sorting
        int key = 0;
        for(int i =0;i<countarr.length;i++){
            while(countarr[i] > 0){
                arr[key] = i; 
                key++;
                countarr[i]--;
            }
        }
    }
    public static void main(String[] args){
        int arr[] ={3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        //bubblesort(arr);
        //selectionsort(arr);
        //insertionsort(arr);
        countingsort(arr);
        printArr(arr);

    }
}
