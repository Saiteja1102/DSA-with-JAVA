// Reverse a Given Number

public class D07_Reverse_Number {
    public static void main(String[] args){
        int number = 11022004;
        while(number > 0){
            int last_number = number % 10;
            System.out.print(last_number);
            number = number / 10;
        }
        System.out.println();
    }
}
