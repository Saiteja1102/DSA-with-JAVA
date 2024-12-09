// Logical Operators
// 1. && -> Logical AND
// 2. || -> Logical OR
// 3. ! -> Logical NOT

public class D04_Logical_Operators {
    public static void main(String[] args){
        // Logical Operators

        // 1. Logical AND -> &&
        /*
            st1     st2     Ans
            T       T       T
            T       F       F
            F       T       F
            F       F       F       
         */
        System.out.println((5>2) && (3<2));

        // 2. Logical OR -> ||
        /*
            st1     st2     Ans
            T       T       T
            T       F       T
            F       T       T
            F       F       F
         */
        System.out.println((5>2) || (3<5));

        // 3. Logical NOT -> !
        /*
         st1    Ans
         T      F
         F      T
         */
        System.out.println(!(5>2));
    }
}
