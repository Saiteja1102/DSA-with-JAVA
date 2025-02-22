public class D09_power_x_n {
    public static int pow(int x,int n){
        // Base Case
        if(n == 0){
            return 1;
        }
        int pownm1 = pow(x, n-1);
        int pow = x * pownm1;
        return pow;
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        System.out.println(pow(x, n));
    }
}
