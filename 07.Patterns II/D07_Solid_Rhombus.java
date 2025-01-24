/*
        Solid Rhombus
    1. outer loop
    2. inner loop
        spaces + stars
        n-(i+1)   n
 */

public class D07_Solid_Rhombus {
    public static void solid_rhombus(int n){
        // outer
        for(int i=1;i<=n;i++){
            // inner

            //spaces
            for(int j = 1;j<=(n-i);j++){
                System.out.print("  ");
            }

            //stars
            for(int j =1;j<=n;j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
    public static void main(String[] args){
        solid_rhombus(5);
    }
}
