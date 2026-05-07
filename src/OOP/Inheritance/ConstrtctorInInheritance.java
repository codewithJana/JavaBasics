package OOP.Inheritance;

//parent
class Animal{
    String name;

    Animal(String name){
        this.name = name;
        System.out.println("Animal constructor : " + name);
    }
}

//child class
class Dog extends Animal{

    String breed;
    Dog(String name, String breed){
        super(name);  // MUST be the first line
        this.breed = breed;
        System.out.println("Dog Constructor : "+ breed);

    }

}


public class ConstrtctorInInheritance {

    static void main(String[] args) {
        Dog d = new Dog("Jimmy","Labrador");
        System.out.println("Animal name is " + d.name);
        System.out.println("Animal Breed is " + d.breed);

    }

}
