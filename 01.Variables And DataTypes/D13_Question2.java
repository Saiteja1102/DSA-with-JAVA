// Area of Square
import java.util.*;

public class D13_Question2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a side: ");
        int side = sc.nextInt();

        int area_of_square = side * side;
        System.out.println("Area of Square of side "+side+" is "+area_of_square);
        sc.close();
    }
}
