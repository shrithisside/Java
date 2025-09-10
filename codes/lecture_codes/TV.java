package codes.lecture_codes;

abstract class television {
    abstract void switchonn();
    abstract void switchoff();
}

class function extends television{
    @Override
    public void switchonn() {
        System.out.println("TV switched on");
    }
    @Override
    public void switchoff() {
        System.out.println("TV switched off");
    }
}
public class TV{
    public static void main(String[] args) {
        television mytelevision = new function();
        mytelevision.switchonn();
        mytelevision.switchoff();
    }
}