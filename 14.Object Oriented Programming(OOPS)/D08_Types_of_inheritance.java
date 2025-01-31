/*
Types of Inheritance
1. Single Level inheritance
2. Multiple level inheritance
3. Hierarchial inheritance
4. Hybrid inheritance
 */

public class D08_Types_of_inheritance {
    public static void main(String[] args) {
        Tuna t1 = new Tuna();
        t1.breathe();
        t1.swim();
    }
}

class Animal{
    void breathe(){
        System.out.println("Breathes...");
    }

    void eat(){
        System.out.println("eats..");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("swims..");
    }
}

class Tuna extends Fish{
    void smallfish(){
        System.out.println("Small Fish");
    }
}

class Shark extends Fish{
    void bigfish(){
        System.out.println("Big Fish..");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("I can fly..");
    }
}

class Peacock extends Bird{
    void national(){
        System.out.println("National Bird");
    }
}

class Mammal extends Animal{
    void walk(){
        System.out.println("Walking");
    }
}

class Dog extends Mammal{
    void barks(){
        System.out.println("Barking..");
    }
}

class Cat extends Mammal{
    void meow(){
        System.out.println("Meow..");
    }
}

class Human extends Mammal{
    void brain(){
        System.out.println("Uses brain effectively.");
    }
}