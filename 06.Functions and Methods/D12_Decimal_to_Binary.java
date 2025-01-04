// Decimal to Binary

public class D12_Decimal_to_Binary {
    public static void dectoBin(int decNum){
        int myNum = decNum;
        int bin = 0;
        int pow = 0;

        while(decNum > 0){
            int rem = decNum % 2;
            bin = bin + rem * (int)Math.pow(10,pow);
            pow++;
            decNum = decNum / 2;
        }

        System.out.println("Binary of " + myNum +" is: " + bin);
    }
    public static void main(String[] args){
        dectoBin(11);
        dectoBin(5);
        dectoBin(18);
        dectoBin(21);
        dectoBin(84);
        dectoBin(15);
    }
}
