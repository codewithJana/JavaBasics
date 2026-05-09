package OOP.Abstraction;

//parent class
abstract class Vehicle{

    //abstract
    abstract void start();

    //Normal/common method
    void fuelType(){
        System.out.println("Petrol/Diesel");
    }
}

class Car1 extends Vehicle{

    @Override
    void start() {
        System.out.println("car starts using Key");
    }
}

class Bike1 extends Vehicle{

    @Override
    void start() {
        System.out.println("Bike starts using self-start");
    }
}

public class WithAbstract {
    static void main(String[] args) {
        //Parent(abstract) reference holding child Object
        // eg. Runtime polymorphism
        Vehicle v = new Car1();
        v.fuelType();
        v.start(); // car class start() executes

        Vehicle v2 = new Bike1();
        v2.start();
        v2.fuelType();
    }
}

