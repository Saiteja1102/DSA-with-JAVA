/*
        FLOYD'S Triangle pattern

            1
            2  3
            4  5  6
            7  8  9  10
            11 12 13 14 15 
 */

public class D08_Question4 {
    public static void main(String[] args){
        int n = 5;
        int nu = 1;
        for(int line = 1;line <= n;line++){
            for(int num = 1;num <= line;num++){
                if(nu > 10){
                    System.out.print(nu+" ");
                }
                else{
                    System.out.print(nu+"  ");
                }
                nu++;
            }
            System.out.println();
        }
    }
    
}
