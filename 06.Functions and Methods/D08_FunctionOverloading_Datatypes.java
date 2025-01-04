// Function Overloading with DataTypes

public class D08_FunctionOverloading_Datatypes {
    public static int sum(int a,int b){
        return a + b;
    }

    public static float sum(float a,float b){
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println("Sum = " + sum(5,8));
        System.out.println("Sum = " + sum(5.4f,7.6f));
    }
}
