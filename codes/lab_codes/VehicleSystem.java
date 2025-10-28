package codes.lab_codes;
// Interface
interface Vehicle {
    void start();
    void stop();
}

// Class implementing the interface
class Car implements Vehicle {
    public void start() {
        System.out.println("Car is starting...");
    }

    public void stop() {
        System.out.println("Car has stopped.");
    }
}

// Another class implementing the interface
class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike is starting...");
    }

    public void stop() {
        System.out.println("Bike has stopped.");
    }
}

// Main class
public class VehicleSystem {
    public static void main(String[] args) {
        Vehicle car = new Car(); // Corrected syntax
        car.start();
        car.stop();

        Vehicle bike = new Bike(); // Corrected syntax
        bike.start();
        bike.stop();
    }
}