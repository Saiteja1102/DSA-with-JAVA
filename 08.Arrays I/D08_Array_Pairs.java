// Pairs in an Array

public class D08_Array_Pairs {
    public static void printPairs(int numbers[]){
        int totalpairs = 0;
        for(int i =0;i<numbers.length;i++){
            int current = numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("("+current+","+numbers[j]+") ");
                totalpairs++;
            }
            System.out.println();
        }
        System.out.println("Toatl pairs = "+totalpairs);
    }
    public static void main(String[] args){
        int numbers[] = {2,4,6,8,10};
        printPairs(numbers);
    }
}
