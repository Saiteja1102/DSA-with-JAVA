/*
 Write a program that reads a set of integers, and then prints the sum of the
 even and odd integers.
 */

import java.util.*;

public class D15_Question1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int even_sum = 0;
        int odd_sum = 0;

        do{
            System.out.print("Enter number: ");
            int num = sc.nextInt();
            if(num % 2 == 0){
                even_sum += num;
            }
            else{
                odd_sum += num;
            }
            if(num == -1){
                break;
            }
        }while(even_sum >= 0);

        System.out.println("Sum of Even Numbers = " + even_sum);
        System.out.println("Sum of Odd Numbers = " + odd_sum);
        sc.close();
    }
}
