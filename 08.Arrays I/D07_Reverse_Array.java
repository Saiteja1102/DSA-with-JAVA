// Reverse an Array
// Time Complexity -> O(n)
// Space Complexity -> O(1)

public class D07_Reverse_Array {
    public static void reverseArray(int numbers[]){
        int first = 0; 
        int last = numbers.length-1;

        while(first < last){
            // swap
            int temp = numbers[first];
            numbers[first] = numbers[last];
            numbers[last] = temp;

            // increase and decrease
            first++;
            last--;
        }
    }

    public static void main(String[] args){
        int numbers[] = {2,4,6,8,10};
        reverseArray(numbers);
        // Output Print
        for(int i =0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }
}
