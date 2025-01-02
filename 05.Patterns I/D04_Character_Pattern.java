/*
        CHARACTER Pattern
    A
    B C
    D E F
    G H I J

 */

public class D04_Character_Pattern{
    public static void main(String[] args){
        char ch = 'A';
        int n = 4;

        // outer loop
        for(int line = 1;line <= n;line++){
            // inner loop
            for(int chars = 1;chars <= line;chars++){
                System.out.print(ch+" ");
                ch++;
            }
            
            System.out.println();
        }
    }

}