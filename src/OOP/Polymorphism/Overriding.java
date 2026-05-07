package OOP.Polymorphism;

//Runtime Polymorphism
//Child class rewrites a method that already exists in the parent class with same signature
//Rules:
/*
1. Method name must be same
2. Parameter should be same
3. Return type must be same
4. child class cannot reduce visibility
5. Must use @override annonation -->Apply on child classes
6. Parent-child relationship.
 */

class Animal{
    void makeSound(){
        System.out.println("Animals make sound");
    }
}

class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("Dog Barks");
    }
}

class Cat extends Animal{
    @Override
    void makeSound(){
        System.out.println("Cat meow");
    }
}


public class Overriding {

    static void main(String[] args) {
        //Rule: Parent reference, child object
        Animal pet;

        pet = new Dog();
        pet.makeSound();

        pet = new Cat();
        pet.makeSound();
    }

}
