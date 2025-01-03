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
        for(int line = 1;line <= n/2;line++){
            for(int star = 1; star <= n;star++){

                if(star <= line || star >= n-line+1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for(int line2 = (n/2);line2 >= 1;line2--){
            for(int star2 = n;star2 >= 1;star2--){
                if(star2 <= line2 || star2 >= n-line2+1){
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


// Only working for even numbers still working on it 
// it will be updated soon
