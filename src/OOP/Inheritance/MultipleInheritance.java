package OOP.Inheritance;

//Diamond problem
//Multiple Inheritance ----> One child, Two parent
class Mother{
    String name = "Mother's name";

    void show(){
        System.out.println("Mother's class : "+ name);
    }
}

class Father{
    String name = "Father's name";

    void show(){
        System.out.println("Father's class : "+ name);
    }
}

//class Child2 extends Father, Mother{
//    String name = "child name";  //This child name HIDES Parent's name
//
//    void show(){
//        System.out.println("child name is "+ name);  // child's name
//        System.out.println("parent name is "+ super.name);  //parent's name
//        super.show();
//    }
//
//}

public class MultipleInheritance {
    static void main(String[] args) {
//        Child2 c = new Child2();
//        c.show();
    }

}
