/*
        Income Tax Calculator
    
    income < 5lakhs ---- 0% tax
    income 5lakhs to 10lakhs ---- 20% tax
    income > 10lakhs ---- 30% tax

 */

import java.util.*;

public class D04_Income_TaxCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income: ");
        int income = sc.nextInt();
        int tax;

        if(income < 500000){
            tax = 0;
        }
        else if(income >= 500000 && income < 1000000){
            tax = (int)(0.2 * income);
        }
        else{
            tax = (int)(0.3 * income);
        }

        System.out.println("You tax is: "+tax);
        sc.close();
    }
}
