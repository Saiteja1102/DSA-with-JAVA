import java.util.*;

public class D02_Largest_of_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int number1 = sc.nextInt();
        System.out.print("Enter number2: "); 
        int number2 = sc.nextInt();

        if(number1 >= number2){
            System.out.println(number1+" is largest..");
        }
        else{
            System.out.println(number2+" is largest..");
        }
        sc.close();
    }
}
