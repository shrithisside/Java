package codes.lecture_codes;

//  is an abstract class, not an interface.
abstract class Main {

    // Abstract methods do not have a body.
    abstract void startEngine();
    abstract void stopEngine();
}

// A concrete class extends an abstract class.
class Car extends Main {
    @Override
    public void startEngine() {
        System.out.println("The car engine starts.");
    }

    @Override
    public void stopEngine() {
        System.out.println("The car engine stops.");
    }
}

public class Vehicle1{
    public static void vehicle1(String[] args) {
        Main myCar = new Car();
        myCar.startEngine();
        myCar.stopEngine();
    }
}