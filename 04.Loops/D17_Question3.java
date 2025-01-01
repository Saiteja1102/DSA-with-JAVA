// Write a program to print the multiplication table of a number N, entered by the user

import java.util.*;

public class D17_Question3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int counter = 1;
        while(counter <= 10){
            System.out.println(num + " * " + counter + " = " + num*counter);
            counter++;
        }

        sc.close();
    }
}
