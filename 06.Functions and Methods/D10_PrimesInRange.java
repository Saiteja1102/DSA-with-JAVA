// Print primes in between 2 to n

public class D10_PrimesInRange {
    public static boolean isPrime(int n){
        if(n == 2){
            return true;
        }
        for(int i = 2;i <= Math.sqrt(n);i++){
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }

    public static void PrimesinRange(int n){
        for(int i = 2;i <= n;i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args){
        PrimesinRange(20); // 2 to 20
    }
}
