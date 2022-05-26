package method_or_function;

public class Student {

    //Santax:access specifier return_type methode_name
   //employee:work,salary,dept

    public void work (){
        System.out.println("this is work");

    }
    public void salary(){
        System.out.println("this is salary");

    }
    public void dept (){
        System.out.println("this is dept ");

    }
    public static void main(String[]args){
        Student obj=new Student();
        obj.work();
        obj.salary();
        obj.dept();
    }



}
