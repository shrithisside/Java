package codes.lecture_codes;

abstract class Base1 {
    void func() {
        System.out.println("Function of base class is called");
    }
}

class Derived extends Base1 {
    // No need to override func(), it inherits directly
}

public class Base {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.func();  // Calls BaseClass's method
    }
}
