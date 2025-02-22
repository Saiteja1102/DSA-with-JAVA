public class D01_print_numbers_decreasing {
    public static void printDec(int n){
        if(n==1){
            System.out.print(1);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    public static void main(String[] args) {
        int n = 10;
        printDec(n);
    }
}