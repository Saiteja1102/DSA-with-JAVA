/*
Count how many times lowercase vowels occurred in a String entered by the
user.
 */
import java.util.*;

public class D14_Question1 {
    public static void vowelsCount(String str){
        int count = 0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            String vowels = "aeiou";
            if(vowels.indexOf(ch)>=0){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        vowelsCount(str);
        sc.close();
    }
}
