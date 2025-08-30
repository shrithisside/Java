package codes.lecture_codes;

public class geeks1 {

    String name;
    int id;

    geeks1(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public static void main(String[] args) {
        geeks1 obj = new geeks1("Tambi", 68);
        System.out.println("Name : " + obj.name + " and ID : " + obj.id);
    }
}
