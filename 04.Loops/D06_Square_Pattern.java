// Square pattern

import java.util.*;

public class D06_Square_Pattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        int sides = sc.nextInt();

        for(int line = 1;line <= sides;line++){
            for(int col = 1;col <= sides;col++){
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}
