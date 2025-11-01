
package mypkg1;
import java.util.Scanner;
public class student
{
    int id;
    String name;
    public student() {
        name="java";
    }

    public student(int i,String nm)
    {
        id=i;
        name=nm;
    }
    public void details()
    {
        System.out.println("StudentDetails id="+id+" name="+name);
    }
    public static void main(String args[])
    {
        int id=0;
        String name="";
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter id=");
        id=sc.nextInt();

        System.out.println("Enter Name=");
        name=sc.next();

        student s=new student(id,name);
        s.details();





    }
}