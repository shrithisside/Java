package codes.lecture_codes;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int reverse = 0;

        // Logic to reverse the number
        while (num != 0) {
            int digit = num % 10;        // get last digit
            reverse = reverse * 10 + digit; // add digit to reverse
            num = num / 10;              // remove last digit
        }

        // Printing the result
        System.out.println("Reversed number: " + reverse);

        sc.close();
    }
}
