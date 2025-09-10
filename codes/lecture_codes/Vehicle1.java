package codes.lecture_codes;

// Abstract class
abstract class Vehicle {

    // Abstract methods
    abstract void startEngine();
    abstract void stopEngine();
}

// Concrete class
class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("The car engine starts.");
    }

    @Override
    public void stopEngine() {
        System.out.println("The car engine stops.");
    }
}

// Main class with entry point
public class Vehicle1 {
    public static void main(String[] args) {
        Vehicle myCar = new Car(); // Polymorphism
        myCar.startEngine();
        myCar.stopEngine();
    }
}
