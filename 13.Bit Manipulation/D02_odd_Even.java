// Check weather number is even or odd

public class D02_odd_Even {
    public static void oddeven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
    public static void main(String[] args) {
        oddeven(5);
        oddeven(6);
        oddeven(7);
    }
}
