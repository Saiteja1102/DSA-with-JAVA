// Write a Java method to compute the sum of the digits in an integer.

public class D17_Question4 {
    public static int digits_Sum(int n){
        int sum = 0;
        while(n > 0){
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int num = 123;
        System.out.println("Sum of digits " + num + " is: "+digits_Sum(num));
    }
}
