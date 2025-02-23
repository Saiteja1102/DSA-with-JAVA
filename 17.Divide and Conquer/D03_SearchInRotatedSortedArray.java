public class D03_SearchInRotatedSortedArray {
    public static int search(int arr[],int si,int ei, int target){
        // Base Case
        if(si > ei){
            return -1;
        }

        // work
        int mid = si + (ei - si)/2;
        // case Found
        if(arr[mid] == target){
            return mid;
        }

        // mid on L1
        if(arr[si] <= arr[mid]){
            // case a: Left
            if(arr[si] <= target && target <= arr[mid-1]){
                return search(arr, si, mid-1, target);
            }
            // case b: Right
            else{
                return search(arr, mid+1, ei, target);
            }
        }
        // mid on L2
        else{
            // case c: Right
            if(arr[mid+1] <= target && target <= arr[ei]){
                return search(arr, mid+1, ei, target);
            }
            // case d: Left
            else{
                return search(arr, si, mid-1, target);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 0;
        int num = search(arr, 0, 5, target);
        System.out.println(num);
    }
}
