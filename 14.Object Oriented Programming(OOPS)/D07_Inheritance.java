// Inheritance
/*
        Parent Class / Base class
                |
                |
        Child Class / Derived Class

    Note: Extends keyword is used
 */

public class D07_Inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
    }
}

class Animal{
    String color;

    void eat(){
        System.out.println("Eats..");
    }

    void breathe(){
        System.out.println("Breathes...");
    }
}

class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("Swims in water!!");
    }
}
