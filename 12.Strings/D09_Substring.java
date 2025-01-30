// Substring

public class D09_Substring {
    public static void printSubstring(String str,int si,int ei){
        String substr = "";
        for(int i = si;i<ei;i++){
            substr += str.charAt(i);
        }
        System.out.println(substr);
    }
    public static void main(String[] args) {
        String str = "HelloWorld";
        printSubstring(str, 0, 3);

        // Inbuilt function
        System.out.println(str.substring(0,5));
    }
}
