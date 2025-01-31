/*
Access Modifiers

        Within class    Within package  subclass    outside Package

Private     Y               N               N           N          
Default     Y               Y               N           N
Protected   Y               Y               Y           N
Public      Y               Y               Y           Y
 */

public class D02_Access_Modifiers {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.username = "saiteja123";
        System.out.println(b1.username);
        // b1.password = "1234567"; can't be used
        b1.setpassword("1234567a");
        // System.out.println(b1.password);we cant print this one also...
    }
}

class BankAccount{
    public String username;
    private String password;
    public void setpassword(String pass){
        password = pass;
    }

    
    public void printpassword(){
        System.out.println(password);
    }
}
