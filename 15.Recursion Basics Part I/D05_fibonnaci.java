public class D05_fibonnaci {
    public static int fib(int n){
        // Base Case
        if(n == 0){
            return 0; 
        }
        if(n == 1){
            return 1;
        }
        int fibnm1 = fib(n-1);
        int fibnm2 = fib(n-2);
        int fibo = fibnm1 + fibnm2;
        return fibo;
    }
    public static void main(String[] args) {
        int n = 25;
        System.out.println(fib(n));
    }
}
