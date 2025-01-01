/*
        Switch Statement
    switch(variable){
    case1:

            break;
    case2:

            break;
    case3:

            break;
    default:

    }
 */

public class D08_Switch_statement {
    public static void main(String[] args){
        int variable = 3;
        switch(variable){
            case 1:
                System.out.println("Mango Shake");
                break;
            case 2:
                System.out.println("Burger");
                break;
            case 3:
                System.out.println("Samosa");
                break;
            default:
                System.out.println("I am testing");
        }
    }
}
