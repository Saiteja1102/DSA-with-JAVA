public class D04_BinaryString {
    public static void binaryString(int n,int lastplace,String str){
        // base case
        if(n == 0){
            System.out.println(str);
            return;
        }
        // kaam
        // if(lastplace == 0){
        //     binaryString(n-1, 0, str+"0");
        //     binaryString(n-1, 1, str+"1");
        // }
        // else{
        //     binaryString(n-1, 0, str+"0");
        // }

        // way -> 2
        binaryString(n-1, 0, str+"0");
        if(lastplace == 0){
            binaryString(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        binaryString(3, 0, "");
    }
}
