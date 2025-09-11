package codes.lecture_codes;
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        int digits = String.valueOf(num).length();

        System.out.println("Number of digits: " + digits);
        System.out.println("Calculating sum of each digit raised to the power " + digits + ":");

        while (num > 0) {
            int digit = num % 10;
            double powered = Math.pow(digit, digits);
            System.out.println("Digit: " + digit + " -> " + digit + "^" + digits + " = " + (int)powered);
            sum += powered;
            num /= 10;
        }

        System.out.println("Sum of powered digits: " + sum);
        System.out.println("Comparing sum with original number: " + sum + " == " + originalNum);

        return sum == originalNum;
    }
}
