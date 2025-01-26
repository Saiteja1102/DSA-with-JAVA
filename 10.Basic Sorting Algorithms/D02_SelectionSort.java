// Selection Sort
// Pick the smallest from the unsorted and put it at the beginning.

public class D02_SelectionSort {
    public static void selectionsort(int arr[]){
        for(int turn = 0;turn < arr.length-1;turn++){
            int min = turn;
            for(int i = turn+1;i<arr.length;i++){
                if(arr[min] > arr[i]){
                    min = i;
                }
            }

            //swap
            int temp = arr[min];
            arr[min] = arr[turn];
            arr[turn] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        selectionsort(arr);
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
