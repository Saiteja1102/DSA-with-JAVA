/*
        0-1 Triangle pattern
    
            1
            0 1
            1 0 1
            0 1 0 1
            1 0 1 0 1
 */

public class D09_Question5 {
    public static void main(String[] args){
        int n = 5;
        int count = 1;
        for(int line = 1;line <= n;line++){
            for(int io = 1;io <= n;io++){
                if(count % 2 == 0 && io <= line){
                    System.out.print("0 ");
                }
                else if(count % 2 != 0 && io <= line){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("  ");
                }
                count++;
            }
            System.out.println();
        }
    }
}
