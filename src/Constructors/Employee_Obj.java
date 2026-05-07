package Constructors;

public class Employee_Obj {

    static void main(String[] args) {

        Employee emp1 = new Employee("Kishor",32);
        System.out.println(emp1.name);
        System.out.println(emp1.age);

        Employee emp2 = new Employee("prem",29);
        System.out.println(emp2.name);
        System.out.println(emp2.age);

        Employee emp3 = new Employee();
        System.out.println(emp3.name);
        System.out.println(emp3.age);

        Employee emp4 = new Employee("Jack",25000.00);
        System.out.println(emp4.name);
        System.out.println(emp4.salary);

        Employee emp5 = new Employee("Jana",20000.00,26);
        System.out.println(emp5.name);
        System.out.println(emp5.salary);
        System.out.println(emp5.age);


    }

}
