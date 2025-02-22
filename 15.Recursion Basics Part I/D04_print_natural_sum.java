public class D04_print_natural_sum {
    public static int CalcSum(int n){
        if(n == 1){
            return 1;
        }
        int sum = n + CalcSum(n-1);
        return sum;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(CalcSum(n));
    }
}
