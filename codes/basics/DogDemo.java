package codes.basics;

class Dog {
    // Properties (Data)
    String breed;
    String color;

    // Behaviors (Methods)
    void bark() {
        System.out.println("Woof!");
    }
}

public class DogDemo {   // file is DogDemo.java, so this class cannot be public Dog
    public static void main(String[] args) {
        // Creating an object named 'myDog'
        Dog myDog = new Dog();

        // Setting properties of the object
        myDog.breed = "Labrador";
        myDog.color = "Brown";

        // Calling a method on the object
        myDog.bark(); // Output: Woof!

        // Printing object properties
        System.out.println("Breed: " + myDog.breed);
        System.out.println("Color: " + myDog.color);
    }
}
