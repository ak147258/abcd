package class_object;

public class Employee {

    String name="Rahul";
    String department="It";
    String add="nagla ram kishan line paar tundla ";
    int age=21;
    double salary=53231.21;


    public static void main(String[]args){

        //Classname obj=new Classname();

        Employee obj=new Employee();

        System.out.println("My name is :"+obj.name);
        System.out.println("My department is:"+obj.department);
        System.out.println("my add is:"+obj.add);
        System.out.println("my age is:"+obj.age);
        System.out.println("my salary is:"+obj.salary);
    }
}
