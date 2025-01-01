// Question: if user enters multiple of 10 exit..

import java.util.*;

public class D11_Break_Question {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Enter number: ");
            int num = sc.nextInt();
            if(num % 10 == 0){
                break;
            }
        }while(true);

        sc.close();
    }
}
