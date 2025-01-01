// Sum of First N Natural Numbers

import java.util.*;

public class D04_NaturalNumbers_Sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int counter = 1;
        int sum = 0;
        while(counter <= num){
            sum += counter;
            counter++;
        }
        System.out.println("Sum of natural numbers till "+num+" is "+sum);
        sc.close();
    }
}
