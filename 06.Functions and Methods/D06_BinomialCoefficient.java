public class D06_BinomialCoefficient{
    // Factorial function
    public static int factorial(int n){
        int f = 1;
        for(int i = 1;i <= n;i++){
            f = f * i;
        }
        return f;
    }

    // Binomial Coefficient function
    public static int BinomCoeff(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);
        int binomial_coefficient = fact_n/(fact_r * fact_nmr);

        return binomial_coefficient;

    }

    public static void main(String[] args){
        int n = 5;
        int r = 2;
        System.out.println("Binomial Coefficient = " + BinomCoeff(n, r));
    }
}