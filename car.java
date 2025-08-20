import java.util.Scanner;

public class car {
    //create a fullThrottle()method

    public void fullthrottle(){
        System.out.println("The car is going as fast a it can! ");
    }

    //create a speed() method and a parameter
    public void speed(int maxSpeed){
        System.out.println("Max speed is " + maxSpeed);
    }

    //Inside main, call the method on my car object
    public static void main(String[] args){
        car myCar = new car();          // create myCar object
        myCar.fullthrottle();           // call the fullthrottle() method
        myCar.speed(200);       // call the speed method
    }
}
