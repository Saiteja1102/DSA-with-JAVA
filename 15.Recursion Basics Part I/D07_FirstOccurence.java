public class D07_FirstOccurence {
    public static int firstoccu(int[] arr,int i,int key){
        // Base Case
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstoccu(arr, i+1, key);
    }
    public static void main(String[] args) {
        int arr[] = {8,3,6,9,5,10,2,5,3};
        int key = 5;
        System.out.println(firstoccu(arr, 0, key));
    }
}
