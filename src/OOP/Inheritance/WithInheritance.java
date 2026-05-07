package OOP.Inheritance;

//Hierarchial Inheritance ---> One parent -->Multiple child
class Person{
    String name;
    int age;

    void eat(){
        System.out.println(name + "is eating");
    }
    void sleep(){
        System.out.println(name + "is sleeping");
    }
}

// "IS-A"  --> Inheritance
// "Has-A" --> Composition
//Studen1 -->child class
//Person -->Parent class

class Student1 extends Person{
    void study(){
        System.out.println(name + "is studying");
    }
}

class Teacher1 extends Person {

    void teach(){
        System.out.println(name + "is teaching");
    }
}




public class WithInheritance {

    static void main(String[] args) {

        Student std = new Student();
        std.name = "John";
        std.age = 25;
        std.eat();
        std.sleep();
        std.study();

        Teacher tr = new Teacher();
        tr.name = "Peter";
        tr.age = 40;
        tr.eat();;
        tr.sleep();
        tr.teach();

    }

}
