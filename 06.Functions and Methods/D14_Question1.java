// Write a Java method to compute the average of three numbers..

public class D14_Question1 {
    public static void averageofThree(int num1,int num2,int num3){
        double average = (num1 + num2 + num3)/3;
        System.out.println("Average of "+num1+", "+num2+", "+num3+" is: "+average);
    }
    public static void main(String[] args){
        averageofThree(12, 23, 36);
    }
}
