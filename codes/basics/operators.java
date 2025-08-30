package codes.basics;

public class operators {
    public static void main(String[] args) {
        //operators: arithmetic, assignment, logical, comparison operators

        //ARITHMETIC OPERATORS
        int a = 5;
        int b = 3;
        int sum = a + b;
        int product = a * b;
        int difference = a - b;
        int divisor = a / b;
        double remainder = a % b;
        System.out.println("The sum is " + sum);
        System.out.println("The product is " + product);
        System.out.println("The difference is " + difference);
        System.out.println("The division is " + divisor);
        System.out.println("The division is " + remainder);

        //ASSIGNMENT OPERATORS
        int num = 2;
        num = num + 1; // this can also be written as num++
        //num++;
        System.out.println("The value of num is " + num);
        int x = 5;
        System.out.println(x++);// 5 (in this case the no. remains same because the addition occurs afterwards)
        System.out.println(++x);// 7 (in this case +1 is already added because of previous line then another +1 is add in this line, hence 7 )
        System.out.println(--x);
        System.out.println(x--);
        System.out.println(x);
    }
}
