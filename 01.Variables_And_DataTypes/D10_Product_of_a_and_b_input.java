// Product of a and b
import java.util.*;

public class D10_Product_of_a_and_b_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();

        int product = a * b;
        System.out.println("Product of "+a+" and "+b+" is "+product);
        sc.close();
    }
}
