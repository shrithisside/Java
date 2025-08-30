package codes.lecture_codes;

import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input radius
        System.out.print("Enter the radius of the src.lecture_codes.circle : ");
        double radius = sc.nextDouble();

        // Calculate area
        double area = Math.PI * radius * radius;

        // Output result
        System.out.println("The area of the src.lecture_codes.circle is: " + area);

        sc.close();
        }
    }