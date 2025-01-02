/*
        INVERTED & ROTATED HALF-PYRAMID pattern

                    *
                  * *
                * * *
              * * * *

 */

public class D06_Question2 {
    public static void main(String[] args){
        int n = 5;
        for(int line = 1; line <= n;line++){
            for(int star = 1; star <= n;star++){
                if((n-line+1)>star){
                    System.out.print("  ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
    
}
