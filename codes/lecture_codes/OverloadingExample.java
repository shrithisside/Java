package codes.lecture_codes;

public class OverloadingExample {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        OverloadingExample obj = new OverloadingExample();

        System.out.println("Sum (int): " + obj.add(5, 10));
        System.out.println("Sum (double): " + obj.add(5.5, 10.5));
    }
}

