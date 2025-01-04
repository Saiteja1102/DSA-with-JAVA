// Call by value

public class D03_CallByValue {
    public static void swap(int a, int b){ // copy of variable is sent not the original
         // swap
         int temp;
         temp = a;
         a = b;
         b = temp;

         System.out.println("a = "+a);
         System.out.println("b = "+b);
    }

    public static void swap2(int a, int b){ // copy of variable is sent not the original
        // swap
        int temp;
        temp = a;
        a = b;
        b = temp;
        return;
   }
    public static void main(String[] args){
        int a = 5;
        int b = 10;
        swap(a, b);

        System.out.println("-------------");
        swap2(a,b);
        System.out.println("a = "+a); // Here values are not changed, Values are changed in function itself
        System.out.println("b = "+b);
    }
}
