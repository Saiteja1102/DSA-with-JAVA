// Print Numbers from 1 to n using while loop

import java.util.*;

public class D03_NumbersFrom_1ton {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int counter = 1;
        while(counter <= num){
            System.out.print(counter + " ");
            counter++;
        }
        System.out.println();
        sc.close();
    }
}
