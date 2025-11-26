

import java.util.Scanner;

public class Student {
    int id;
    String name;

    // Default constructor
    public Student() {
        name = "java";
    }

    // Parameterized constructor
    public Student(int i, String nm) {
        id = i;
        name = nm;
    }

    // Method to display student details
    public void details() {
        System.out.println("Student Details → id = " + id + ", name = " + name);
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter id = ");
        int id = sc.nextInt();

        System.out.print("Enter name = ");
        String name = sc.next();

        // Create object using parameterized constructor
        Student s = new Student(id, name);
        s.details();

        sc.close();
    }
}
