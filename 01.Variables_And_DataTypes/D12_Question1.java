// Average of 3 numbers
import java.util.*;

public class D12_Question1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Average of 3 numbers
        System.out.print("Enter number1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter number2: ");
        int num2 = sc.nextInt();
        System.out.print("Enter number3: ");
        int num3 = sc.nextInt();

        float average = (num1 + num2 + num3)/3;
        System.out.println("Average of "+num1+", "+num2+" and "+num3+" is "+average);
        sc.close();
    }
}
