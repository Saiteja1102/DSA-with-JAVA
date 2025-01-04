// Binary to Decimal

public class D11_Binary_to_Decimal {
    public static void bintoDec(int binNum){
        int myNum = binNum;
        int dec = 0;
        int pow = 0;

        while(binNum > 0){
            int LastDigit = binNum % 10; // Get Last Number
            dec = dec + (LastDigit * (int)Math.pow(2,pow));
            pow++;
            binNum = binNum / 10; // Remove last Number
        }

        System.out.println("Decimal of " + myNum + " is: " + dec);
    }
    public static void main(String[] args){
        bintoDec(1111);
        bintoDec(101);
        bintoDec(1010);
        bintoDec(101011101);
    }
}
