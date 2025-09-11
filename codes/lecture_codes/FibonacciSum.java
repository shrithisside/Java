package codes.lecture_codes;
import java.util.Scanner;
public class FibonacciSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms (n): ");
        int n = sc.nextInt();

        int first = 0, second = 1, next;
        int sum = 0;

        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            sum += first;
            next = first + second;
            first = second;
            second = next;
        }
        System.out.println("\nSum of Fibonacci series up to " + n + " terms: " + sum);
        sc.close();
    }
}

