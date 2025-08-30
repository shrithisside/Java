package codes.basics;

public class maths {
    public static void main(String[] args) {
        //Maths class

        // max or min function
        // suppose we want to find maximum out of 5,6
        System.out.println(Math.max(5,6));

        //random function(this function gives any random number from 0.0 to 1.0 )
        System.out.println(Math.random());
        System.out.println((int)(Math.random()*100));// typecasting to get integer and multiplying by 100 because int typecast always gives 0 in output
    }
}
