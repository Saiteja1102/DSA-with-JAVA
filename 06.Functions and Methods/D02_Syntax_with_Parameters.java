/*
        Function Syntax with Parameters

    returnType name(type param1,type param2){
        // body
        return statement;
    }
 */

import java.util.*;

public class D02_Syntax_with_Parameters {
    public static int calculateSum(int num1,int num2){
        int sum = num1 + num2;
        return sum; 
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a = sc.nextInt();
        System.out.print("Enter number 2: ");
        int b = sc.nextInt();

        int sum = calculateSum(a,b);
        System.out.println("Sum of 2 numbers is "+sum);
        sc.close();
    }
    
}
