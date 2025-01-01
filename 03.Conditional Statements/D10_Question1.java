// Write a Java program to get a number from the user and print whether it is
// positive or negative.

import java.util.*;

public class D10_Question1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        if(num>=0){
            System.out.println("Positive");
        }
        else{
            System.out.println("Negative");
        }

        sc.close();
    }
}
