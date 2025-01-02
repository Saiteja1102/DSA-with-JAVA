/*
        BUTTERFLY pattern
    
        *      *
        **    **
        ***  ***
        ********
        ********
        ***  ***
        **    **
        *      *
 */

public class D10_Question6 {
    public static void main(String[] args){
        int n = 8;
        for(int line = 1;line <= n;line++){
            for(int star = 1; star <= n;star++){
                
                if(star <= line){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}


// still work in progress!!!!!!!!!!!!!
