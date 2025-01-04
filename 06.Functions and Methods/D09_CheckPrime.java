
public class D09_CheckPrime {
    public static boolean isPrime(int n){
        boolean isPrime = true;

        for(int i = 2;i <= n-1;i++){
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }

        if(n == 2){
            isPrime = true;
        }

        return isPrime;
    }

    // Optimized way i.e n = sqrt(n) * sqrt(n)
    public static boolean isPrimeOptimized(int n){
        // Corner Case or Special Case
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
    public static void main(String[] args){
        System.out.println(isPrime(5));
        System.out.println(isPrime(12));
        System.out.println(isPrimeOptimized(123));
        System.out.println(isPrimeOptimized(71));
        System.out.println(isPrimeOptimized(2));
    }
}
