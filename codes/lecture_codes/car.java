package codes.lecture_codes;

public class car {
    //create a fullThrottle()method

    public void fullthrottle(){
        System.out.println("The src.lecture_codes.car is going as fast a it can! ");
    }

    //create a speed() method and a parameter
    public void speed(int maxSpeed){
        System.out.print("Max speed is " + maxSpeed);
    }

    //Inside main, call the method on my src.lecture_codes.car object
    public static void main(String[] args){
        car myCar = new car();          // create myCar object
        myCar.fullthrottle();           // call the fullthrottle() method
        myCar.speed(200);               // call the speed method
    }
}
