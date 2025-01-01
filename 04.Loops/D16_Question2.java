// Write a program to find the factorial of any number entered by the user.

import java.util.*;

public class D16_Question2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int factorial = num;
        for(int i = num-1;i >= 1; i--){
            factorial  = factorial * i;
        }

        System.out.println(factorial);
        sc.close();
    }
}
