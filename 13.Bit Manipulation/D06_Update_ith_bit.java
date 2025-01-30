public class D06_Update_ith_bit {
    public static int clearithbit(int n,int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
    public static int setithbit(int n,int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }
    public static int updateithbit(int n,int i,int newbit){
        if(newbit == 0){
            return clearithbit(n, i);
        }
        else{
            return setithbit(n, i);
        }

    }
    public static void main(String[] args) {
        System.out.println(updateithbit(7, 2, 0));
    }
}
