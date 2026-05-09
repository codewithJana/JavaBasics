package OOP.Abstraction;


class Car{
    void fuelType(){
        System.out.println("Petrol/Diesel");
    }

    void start(){
        System.out.println("car starts using Key");
    }
}

class Bike{
    void fuelType(){
        System.out.println("Petrol/Diesel");
    }

    void start(){
        System.out.println("Bike starts using self-start");
    }
}

public class WithoutAbstract {
    static void main(String[] args) {
        Car c = new Car();
        c.fuelType();
        c.start();

        Bike b = new Bike();
        b.fuelType();
        b.start();
    }
}
