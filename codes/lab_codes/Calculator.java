package codes.lab_codes;

public class Calculator {

    // Method Overloading
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Static variable and method
    public static String OperationType = "Arithmetic Operations";

    public static void displayStaticInfo() {
        System.out.println("This is a Static method");
        System.out.println("Operation Type: " + OperationType);
    }

    // Main method
    public static void main(String args[]) {
        Calculator calc = new Calculator();

        // Static method call
        Calculator.displayStaticInfo();

        // Method calls with proper arguments
        System.out.println("Sum of two integers: " + calc.add(10, 20));
        System.out.println("Sum of decimal numbers: " + calc.add(10.5, 20.7));
        System.out.println("Sum of three integers: " + calc.add(5, 10, 15));
    }
}