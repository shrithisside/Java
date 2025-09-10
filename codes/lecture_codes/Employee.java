package codes.lecture_codes;

class main{
    private int id;
    private String name;

    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}

public class Employee {
    public static void main(String[] args) {
        main emp = new main();

        emp.setId(101);
        emp.setName("Geek");

        System.out.println("Employee ID : " + emp.getId());
        System.out.println("Employee Name : " + emp.getName());
    }
}
