/*
    if else syntax
    if(condition){

    }
    else{
    
    }
 */
import java.util.*;

public class D01_ifelse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if(age >= 18){
            System.out.println("Adult: drive,vote");
        }
        else{
            System.out.println("Not Adult");
        }

        // if(age > 13 && age < 18){
        //     System.out.println("tenegar");
        // }
        sc.close();
    }
}
