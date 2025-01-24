/*
        01 triangle Pattern
    1
    0 1
    1 0 1
    0 1 0 1
    1 0 1 0 1

    i+j -> even 1
    i+j -> odd  0
 */


public class D05_01_triangle {
    public static void zero_1_triangle(int n){
        // outer
        for(int i =1;i <= n;i++){
            // inner
            for(int j = 1;j <= i;j++){
                if((i+j) % 2 == 0){ // even
                    System.out.print("1 ");
                }
                else{ // odd
                    System.out.print("0 ");
                }
            }

            System.out.println();
        }
    }
    public static void main(String[] args){
        zero_1_triangle(5);
    }
}
