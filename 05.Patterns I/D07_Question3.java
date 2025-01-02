/*
        INVERTED HALF-PYRAMID with Numbers pattern
    
                    1 2 3 4 5
                    1 2 3 4
                    1 2 3
                    1 2
                    1
 */

public class D07_Question3 {
    public static void main(String[] args){
        int n = 5;
        for(int line = 1;line <= n;line++){
            for(int num = 1;num <= n;num++){
                // System.out.print(num);
                if(num <= n-line+1){
                    System.out.print(num+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
