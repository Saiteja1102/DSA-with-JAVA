// Declaring
// dataType arrayname[] = new dataType[size]

import java.util.*;

public class D01_Arrays{
    public static void main(String[] args){
        // Declaring
        int numbers[] = new int[50];
        int numb[] = {1,2,3};
        String fruits[] = {"apple","mango","banana"};
        System.out.println(numbers);
        System.out.println(numb);
        System.out.println(fruits);

        // input
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        // Output
        System.out.println("phy = "+marks[0]);
        System.out.println("chem = "+marks[1]);
        System.out.println("maths = "+marks[2]);

        // Update
        marks[2] = marks[2] + 10;
        System.out.println("maths = "+marks[2]);

        sc.close();
    }
}
