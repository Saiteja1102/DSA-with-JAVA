/*
 Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
 an eraser. You have to output the total cost of the items back to the user as their bill.
 (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)
 */

import java.util.*;

public class D14_Question3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter cost of a pencil: ");
        float cost_pencil = sc.nextFloat();
        System.out.print("Enter cost of a pen: ");
        float cost_pen = sc.nextFloat();
        System.out.print("Enter cost of a eraser: ");
        float cost_eraser = sc.nextFloat();

        // Without Gst
        System.out.println("--------------Bill Without GST--------------");
        float total_cost = cost_eraser + cost_pen + cost_pencil;
        System.out.println("Total Cost = "+total_cost);

        // With GST
        System.out.println("--------------Bill With GST--------------");
        float total_cost_with_gst = (0.18f * total_cost) + total_cost;
        System.out.println("Total Cost with GST = "+total_cost_with_gst);
        sc.close();
    }
}
