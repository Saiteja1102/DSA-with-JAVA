// Largest and Smallest number in an Array

public class D05_Largest_Smallest_number {

    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE; // -infinity
        for(int i=0;i<numbers.length;i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
        }

        return largest;
    }

    public static int getSmallest(int numbers[]){
        int smallest = Integer.MAX_VALUE; // +infinity
        for(int i =0;i<numbers.length;i++){
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args){
        int numbers[] = {1,2,6,3,5};
        System.out.println("Largest number in an array = "+getLargest(numbers));
        System.out.println("Smallest number in an array = "+getSmallest(numbers));

    }    
}
