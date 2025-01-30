// Strings Comparision

public class D08_StringsCompare {
    public static void main(String[] args) {
        String s1 = "Sai";
        String s2 = "Sai";
        String s3 = new String("Sai");

        if(s1 == s2){
            System.out.println("Strings are equals");
        }
        else{
            System.out.println("Strings are not equal");
        }

        if(s1 == s3){
            System.out.println("Strings are equals");
        }
        else{
            System.out.println("Strings are not equal");
        }

        if(s1.equals(s3)){
            System.out.println("Strings are equals");
        }
        else{
            System.out.println("Strings are not equal");
        }
    }
}
