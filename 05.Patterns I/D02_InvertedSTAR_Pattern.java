/*
        Inverted STAR Pattern
    * * * *
    * * *
    * *
    *

 */


public class D02_InvertedSTAR_Pattern {
    public static void main(String[] args){
        // for(int line = 4;line >= 1;line--){
        //     for(int star = line;star >= 1;star--){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // 2nd method
        int n = 4;
        for(int line = 1;line <= n;line++){
            for(int star = 1;star <= n-line+1;star++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
    
}
