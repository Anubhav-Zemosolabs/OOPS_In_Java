package oops_concepts.java;

abstract class Animal {
    abstract void makeSound();
    public void eat() {
        System.out.println("I can eat.");
    }
}
class Dog extends Animal{
    //implementation of Abstract Method
    public void makeSound(){
        System.out.println("Dog Barks");
    }
}
public class AbstractMethodExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.makeSound();
    }
}
