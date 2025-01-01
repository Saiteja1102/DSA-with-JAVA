// Reversing a Number

import java.util.*;

public class D08_Reverse_GivenNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int reverse = 0;
        while(num > 0){
            int last_num = num % 10;
            reverse = (reverse * 10) + last_num;
            num = num / 10;
        }
        System.out.println(reverse);
        sc.close();
    }
}
