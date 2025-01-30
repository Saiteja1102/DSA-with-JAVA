// String CharAt Method

public class D05_String_CharAt_Method {
    public static void printletters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String name = "Sai Teja";
        System.out.println(name.charAt(2));
        printletters(name);
    }
}
