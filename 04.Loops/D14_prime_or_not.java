import java.util.*;

public class D14_prime_or_not{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        sc.close();
        int i = 2;

        if(num == 2){
            System.out.println("Prime");
        }
        else{
            for(i = 2;i < Math.sqrt(num);i++){
                if(num % i == 0){
                    System.out.println("Not Prime..");
                    break;
                }
            }
            if(i == num){
                System.out.println("Prime");
            }
        }
    }
}