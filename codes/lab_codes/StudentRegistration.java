package codes.lab_codes;

// StudentRegistration.java

// Abstract class
abstract class Student {
    String name;
    int rollNo;

    // Abstract method
    abstract void register();

    // Concrete method
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}

// Subclass
class CollegeStudent extends Student {
    String course;

    void setDetails(String n, int r, String c) {
        name = n;
        rollNo = r;
        course = c;
    }

    // Implement abstract method
    void register() {
        System.out.println(name + " has been registered for the course: " + course);
    }
}

// Main class
public class StudentRegistration {
    public static void main(String[] args) {
        CollegeStudent s1 = new CollegeStudent();
        s1.setDetails("Shriwayanta Maiti", 169, "Java");
        s1.displayDetails();
        s1.register();
    }
}