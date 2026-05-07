package OOP.Inheritance;


//MultiLevel Inheritance --> Grandparent --> Parent -->Child -->Grandchild

//grandparent
class Animal1{

    Animal1(){
        System.out.println("Animal constructor");
    }
    void eat(){
        System.out.println("Eating food");
    }
}

//parent
class Mammal extends Animal1{

    Mammal(){
        super();
        System.out.println("Mammal constructor");
    }

    void walk(){
        System.out.println("walking on legs");
    }
}

//child
class Dog2 extends Mammal{

    Dog2(){
        super();
        System.out.println("Dog2 constructor");
    }
    void bark(){
        System.out.println("Barking loud");
    }
}

public class MultiLevelInheritance {

    static void main(String[] args) {
        Dog2 dg = new Dog2();
        dg.eat();
        dg.walk();
        dg.bark();
    }

}
