
import java.util.*;

public class D05_Largest_of_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter number2: ");
        int num2 = sc.nextInt();
        System.out.print("Enter number3: ");
        int num3 = sc.nextInt();

        if(num1 >= num2 && num1 >= num3){
            System.out.println(num1+" is largest..");
        }
        else if(num2 >= num1 && num2 >= num3){
            System.out.println(num2+" is largest..");
        }
        else{
            System.out.println(num3+" is largest..");
        }

        sc.close();
    }
}    
