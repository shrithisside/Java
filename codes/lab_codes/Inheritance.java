package codes.lab_codes;

class Animal {
    void eat() {
        System.out.println("Animal is munching food 🍕");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog says: Woof woof! 🐶");
    }
}

class Pup extends Dog {
    void features() {
        System.out.println("Puppy is tiny 🐾");
        System.out.println("Puppy is playful 🪁");
        System.out.println("Puppy loves attention ❤️");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        System.out.println("=== Single Level Inheritance ===");
        Dog d = new Dog();
        d.eat(); // from Animal
        d.bark(); // from Dog

        System.out.println("\n=== Multilevel Inheritance ===");
        Pup p = new Pup();
        p.eat(); // from Animal
        p.bark(); // from Dog
        p.features(); // from Pup
    }
}