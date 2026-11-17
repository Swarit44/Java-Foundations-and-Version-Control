
abstract class Vehicle {

    // Abstract method
    abstract void start();

    // Normal method
    void stop() {
        System.out.println("Vehicle stopped.");
    }
}

class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car starts with a key.");
    }
}

class Bike extends Vehicle {

    @Override
    void start() {
        System.out.println("Bike starts with a self-start button.");
    }
}

public class Exercise5_Abstraction {

    public static void main(String[] args) {

        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        v1.start();
        v1.stop();

        v2.start();
        v2.stop();
    }
}
