package codes.lecture_codes;

public class car {
    //create a fullThrottle()method

    public void fullthrottle(){
        System.out.println("The car is going as fast a it can! ");
    }

    public void speed(int maxSpeed){
        System.out.print("Max speed is " + maxSpeed);
    }

    public static void main(String[] args){
        car myCar = new car();
        myCar.fullthrottle();
        myCar.speed(200);
    }
}
