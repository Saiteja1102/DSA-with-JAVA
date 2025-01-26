// Inbuilt sort

import java.util.Arrays;
import java.util.Collections;

public class D04_inbuiltsort {
    public static void printArr(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int arr[] = {5,4,3,1,2};
        Arrays.sort(arr);
        printArr(arr);

        int arr2[] = {5,4,3,1,2};
        Arrays.sort(arr2,1,4); // Arrays.sort(arrayname,startindex,endindex(without including));
        printArr(arr2);

        // Desending order
        Integer arr3[] = {5,4,3,1,2};
        Arrays.sort(arr3,Collections.reverseOrder()); // reverseOrder will always work on Objects
        for(int i =0;i<arr3.length;i++){
            System.out.print(arr3[i]+" ");
        }
        System.out.println();

        Integer arr4[] = {5,4,3,1,2};
        Arrays.sort(arr4,1,4,Collections.reverseOrder());
        for(int i =0;i<arr4.length;i++){
            System.out.print(arr4[i]+" ");
        }
        System.out.println();
    }
}
