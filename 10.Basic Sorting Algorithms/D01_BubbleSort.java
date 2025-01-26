// Bubble Sort
// Large elements come to the end of the array by swaping with the adjacent elements.

public class D01_BubbleSort {
    public static void bubblesort(int arr[]){
        int n = arr.length;
        for(int turn = 0;turn < n-1;turn++){
            for(int j =0;j<n-1-turn;j++){
                if(arr[j] > arr[j+1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args){
        int arr[] = {4,5,2,1,3};
        bubblesort(arr);
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
