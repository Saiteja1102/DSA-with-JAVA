/*
        Ternary Operator
    
    variable = condition ? statement 1 : statement 2
 */
import java.util.*;

public class D06_Ternary_Operator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        String type = ((number%2) == 0) ? "Even" : "Odd";
        System.out.println(type);
        sc.close();
    }
}
