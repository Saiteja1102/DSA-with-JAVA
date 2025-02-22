public class D02_print_numbers_increasing {
    public static void printIncre(int n){
        if(n == 1){
            System.out.print(1+" ");
            return;
        }
        printIncre(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        int n = 10;
        printIncre(n);
    }
}
