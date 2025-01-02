/*
        HOLLOW Rectangle Pattern
    
            * * * * *
            *       *
            *       *
            * * * * *
 */

public class D05_Question1 {
    public static void main(String[] args){
        int n = 4;
        for(int line = 1;line <= n;line++){
            for(int star = 1;star <= n+1;star++){
                if(line == 1 || line == n){
                    System.out.print("* ");
                }
                else{
                    if(star == 1 || star == n+1){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}
