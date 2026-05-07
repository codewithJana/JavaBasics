package Classes_Objects;

public class Student_obj {

    static void main(String[] args) {

        //Classname ObjName = new Classname()
        //Reference/ObjName --> stored in Stack
        //Object -->stored in heap



        Student std1 = new Student();
        std1.name = "John";
        std1.age  =20;

        std1.setDetails("James",70);
        std1.setDetails("Prem",35);
        std1.setDetails(35,"jack");

        std1.setDetails();
        std1.study();

        Student std2 = new Student();
        std2.setDetails("Kishor",20);
        std2.study();

        Student std3 = new Student();
        System.out.println(std3.name);
        System.out.println(std3.age);
        System.out.println(std3.printSchoolName());
        System.out.println(std3.add(10,23));
        System.out.println(std3.Sub(std3.add(10,23),10));

    }

}
