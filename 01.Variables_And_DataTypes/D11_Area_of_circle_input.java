// Area of Circle
// pie*radius*radius -> formula
import java.util.*;

public class D11_Area_of_circle_input {
    public static void main(String[] args){
        // Area of circle
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double area_of_circle = 3.14*radius*radius;
        System.out.println("Area of circle of radius "+radius+" is "+area_of_circle);
        sc.close();
    }
}
