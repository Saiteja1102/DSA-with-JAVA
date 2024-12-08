// Input in java
/*
    next() -> String for only till space
    nextLine() -> String full input with spaces
    nextInt() -> For integers
    nextFloat() -> For Float
    nextDouble() -> For Double
    nextByte() -> For Byte
    nextLong() -> For Long
    nextBoolean() -> For Boolean
 */
import java.util.*;

public class D08_Inputs_in_java {
    public static void main(String[] args){
        // Input in java
        Scanner sc = new Scanner(System.in); // sc -> object

        System.out.print("Enter a String with space: ");
        String a1 = sc.nextLine();
        System.out.println(a1);

        System.out.print("Enter a String without space: ");
        String a2 = sc.next();
        System.out.println(a2);

        System.out.print("Enter a Integer value: ");
        int a3 = sc.nextInt();
        System.out.println(a3);

        System.out.print("Enter a Float value: ");
        float a4 = sc.nextFloat();
        System.out.println(a4);

        System.out.print("Enter a Double value: ");
        double a5 = sc.nextDouble();
        System.out.println(a5);

        System.out.print("Enter a Long value: ");
        long a6 = sc.nextLong();
        System.out.println(a6);

        System.out.print("Enter a Byte value: ");
        byte a7 = sc.nextByte();
        System.out.println(a7);

        System.out.print("Enter a Boolean value: ");
        boolean a8 = sc.nextBoolean();
        System.out.println(a8);

        sc.close(); // Closing the scanner object
    }
}
