package codes.lecture_codes;

class Parent {
    void show() {
        System.out.println("This is parent class");
    }
}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("This is child class");
    }
}

public class OverridingExample {
    public static void main(String[] args) {
        Parent obj1 = new Parent();
        Parent obj2 = new Child();

        obj1.show();
        obj2.show();
    }
}