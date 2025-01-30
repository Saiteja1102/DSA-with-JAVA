// Palindrome or Not

public class D06_Palindrome {
    public static boolean isPalindrome(String str){
        for(int i =0;i<str.length()/2;i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String pal = "racecar";
        System.out.println(isPalindrome(pal));
    }
}
