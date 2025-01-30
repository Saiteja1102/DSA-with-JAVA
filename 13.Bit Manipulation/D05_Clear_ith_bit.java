// Clear ith bit

public class D05_Clear_ith_bit {
    public static int clearithbit(int n,int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
    public static void main(String[] args) {
        System.out.println(clearithbit(7, 2));
    }
}
