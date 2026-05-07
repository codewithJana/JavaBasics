package OOP.Inheritance;


class Student{

    String name;
    int age;

    void eat(){
        System.out.println(name + "is eating");
    }
    void sleep(){
        System.out.println(name + "is sleeping");
    }
    void study(){
        System.out.println(name + "is studying");
    }
}

class Teacher{

    String name;
    int age;

    void eat(){
        System.out.println(name + "is eating");
    }
    void sleep(){
        System.out.println(name + "is sleeping");
    }
    void teach(){
        System.out.println(name + "is teaching");
    }
}

public class WithoutInheritance {

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


/*

1. Code Duplication - name, age , eat(), sleep() writtern in both classes
2. Hard to maintain new features -  adding address in all classes
3. Risk of bugs
4. Violate DRY - Dont Repeat Yourself


 */
