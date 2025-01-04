
public class D04_FindProduct {
    public static int multiply(int num1, int num2){
        int product = num1 * num2;
        return product;
    }
    public static void main(String[] args){
        int a = 5;
        int b = 6;
        int prod = multiply(a, b);
        System.out.println("product = " + prod);

        int prod2 = multiply(30, 20);
        System.out.println("product = " + prod2);
    }
}
