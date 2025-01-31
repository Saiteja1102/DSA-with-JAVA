public class D11_Abstract_Class {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walk();
        h1.eat();
    }    
}

abstract class Animal{
    void eat(){
        System.out.println("Eats..");
    }

    abstract void walk();
}

class Horse extends Animal{
    void walk(){
        System.out.println("Walks with 4 legs");
    }
}

class Hen extends Animal{
    void walk(){
        System.out.println("Walks with 2 legs");
    }
}
