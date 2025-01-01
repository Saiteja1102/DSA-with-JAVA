// Prime -> if it is not divisible by numbers between 2 to (n-1)
// if it is divisible then Non prime 

import java.util.*;

public class prime_notprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        int div = 2;

        while(div < number){
            if (number%div == 0){
                System.out.println("Not Prime");
                break;
            }
            else{
                div = div + 1;
            }
        }
        if(div>=number){
            System.out.println("Prime");
        }

        sc.close();
    }
}
