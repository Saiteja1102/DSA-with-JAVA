import java.util.*;

public class D13_Continue_Question {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter number: ");
            int num = sc.nextInt();
            if(num % 10 == 0){
                continue;
            }
            System.out.println("You Entered: "+num);

            if(num == 10000000){
                break;
            }
        }while(true);

        sc.close();
    }
}
