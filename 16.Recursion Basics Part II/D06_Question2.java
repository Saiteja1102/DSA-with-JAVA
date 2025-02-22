/*
Question 2 :
You are given a number (eg - 2019), convert it into a String of english like
“two zero one nine”.Use a recursive function to solve this problem.
NOTE- The digits of the number will only be in the range 0-9 and the last digit of a number
can’t be 0.
Sample Input : 1947
Sample Output : "one nine four seven”
 */

public class D06_Question2 {
    public static void convertToEnglish(String str,String[] arr,int idx){
        // Base case
        if(idx ==  str.length()){
            return;
        }

        // kaam
        char ch = str.charAt(idx);
        int ch1 = ch - '0';
        System.out.print(arr[ch1]+" ");
        convertToEnglish(str, arr, idx+1);
    }
    public static void main(String[] args) {
        int num = 2004;
        String str = num + "";
        String[] arr = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        convertToEnglish(str, arr, 0);
    }
}
