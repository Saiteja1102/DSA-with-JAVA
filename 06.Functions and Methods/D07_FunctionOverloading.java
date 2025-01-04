// Function Overloading -> Multiple functions with the same name but different parameters

public class D07_FunctionOverloading {
    public static int sum(int a,int b){
        return a+b;
    }

    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args){
        System.out.println("Sum = " + sum(5,7));
        System.out.println("Sum = " + sum(5,3,2));
    }
}
