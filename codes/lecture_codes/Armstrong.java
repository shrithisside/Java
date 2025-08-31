package codes.lecture_codes;

// Armstrong number example using constructor
// Armstrong number: sum of cubes of digits = number itself (for 3-digit)

import java.util.Scanner;

class ArmstrongDemo {

    // Constructor to check Armstrong number
    ArmstrongDemo(int num) {
        int originalNum = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;   // extract last digit
            sum += digit * digit * digit;  // cube and add
            num = num / 10;        // remove last digit
        }

        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is NOT an Armstrong number.");
        }
    }
}

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Calling constructor (object creation triggers Armstrong check)
        ArmstrongDemo obj = new ArmstrongDemo(n);

        sc.close();
    }
}

