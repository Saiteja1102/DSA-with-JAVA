/*
Question 3 : Write a program to find Length of a String using Recursion.
 */

public class D07_Question3 {
    public static int StringLength(String str){
        if(str.length() == 0){
            return 0;
        }

        return StringLength(str.substring(1))+1;
    }
    public static void main(String[] args) {
        String str = "sai teja";

        System.out.println(StringLength(str));
    }
}
