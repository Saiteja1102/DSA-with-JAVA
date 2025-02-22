public class D10_power_x_n_optimized {
    public static int optimedpow(int x,int n){
        if(n == 0){
            return 1;
        }
        int halfpower = optimedpow(x, n/2);
        int halfpowersq = halfpower * halfpower;
        if(n % 2 != 0){
            halfpowersq = x * halfpowersq;
        }
        return halfpowersq;
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        System.out.println(optimedpow(x, n));
    }
}
