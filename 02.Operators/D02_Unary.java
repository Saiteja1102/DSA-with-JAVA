/*
 Unary
 1. Increment -> 
            1. Pre Increment -> ++a
            2. Post Increment -> a++
 2. Decrement
            1. Pre Decrement -> --a
            2. Post Decrement -> a--
 */

public class D02_Unary {
    public static void main(String[] args) {
        // Unary

        //Increment
        int a1 = 10;
        int b1 = ++a1; // Pre-increment
        System.out.println("a1 = "+a1);
        System.out.println("b1 = "+b1);

        int a2 = 10;
        int b2 = a2++; // Post-increment
        System.out.println("a2 = "+a2);
        System.out.println("b2 = "+b2);


        // Decrement
        int a3 = 10;
        int b3 = --a3; // Pre-decrement
        System.out.println("a3 = "+a3);
        System.out.println("b3 = "+b3);

        int a4 = 10;
        int b4 = a4--;
        System.out.println("a4 = "+a4);
        System.out.println("b4 = "+b4);

    }
}
