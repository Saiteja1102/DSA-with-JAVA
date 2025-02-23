public class D01_MergeSort {
    public static void printArr(int[] arr){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void MergeSort(int[] arr, int si, int ei){
        // Base Case
        if(si >= ei){
            return;
        }
        int mid = si + (ei - si)/2; // (si + ei)/2 
        MergeSort(arr, si, mid);
        MergeSort(arr, mid+1, ei);

        merge(arr, si, ei, mid);
    }

    public static void merge(int[] arr, int si,int ei,int mid){
        int temp[] = new int[ei-si+1];
        int i = si; // idx for 1st sorted array
        int j = mid+1; // idx for 2nd sorted array
        int k = 0; // idx for temp
        
        while(i <= mid && j <= ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
                k++; 
            }
            else{
                temp[k] = arr[j];
                j++;
                k++;
            }
        }

        // for leftover elements of 1st sorted array
        while(i <= mid){
            temp[k] = arr[i];
            i++;
            k++;
        }

        // for leftover elements of 2nd sorted array
        while(j <= ei){
            temp[k] = arr[j];
            j++;
            k++;
        }

        // copy temp to original array
        i = si;
        for(int s = 0;s<temp.length;s++){
            arr[i] = temp[s];
            i++;
        }

    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,2,5,8};
        MergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
