package OOP.Inheritance;


//SIngle Inheritance ----> One child, one parent
class Parent2{
    String name = "parent name";

    void show(){
        System.out.println("Parent class : "+ name);
    }
}

class Child extends Parent2{
    String name = "child name";  //This child name HIDES Parent's name

    void show(){
        System.out.println("child name is "+ name);  // child's name
        System.out.println("parent name is "+ super.name);  //parent's name
        super.show();
    }

}

public class SuperAccess {
    static void main(String[] args) {
        Child c = new Child();
        c.show();
    }

}
