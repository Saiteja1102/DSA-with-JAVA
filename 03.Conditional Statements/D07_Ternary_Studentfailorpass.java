import java.util.*;

public class D07_Ternary_Studentfailorpass {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        String result = (marks >= 33) ? "PASS" : "FAIL";
        System.out.println(result);
        sc.close();
    }
}
