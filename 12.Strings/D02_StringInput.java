// Input
// next() -> only one word
// nextLine() -> anything with spaces till we press enter

import java.util.Scanner;

public class D02_StringInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String name;
        String name2;
        //name = sc.next();
        name2 = sc.nextLine();
        //System.out.println("Name = "+name);
        System.out.println("Name = "+name2);
        sc.close();
    }
}
