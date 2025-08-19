import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        //How to take input from user?
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        System.out.println("your no. is " + num);
        System.out.println("Enter your age");
        float age = sc.nextFloat();
        System.out.println("your age is " + age);


        System.out.println("Enter your name");
        String name = sc.next();// here next only takes a single word even if we input a complete line
        System.out.println("your name is " + name);

        System.out.println("Enter your surname");
        String surname = sc.nextLine(); // this is used to take input for a line
        System.out.println("your surname is " + surname);
    }
}
