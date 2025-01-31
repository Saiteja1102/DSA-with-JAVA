// same function but different defination

public class D10_Method_Overriding {
    public static void main(String[] args) {
        Deer d1 = new Deer();
        d1.eat();
    }
}

class Animal{
    void eat(){
        System.out.println("Eats anything..");
    }
}

class Deer extends Animal{
    void eat(){
        System.out.println("Eats grass.");
    }
}