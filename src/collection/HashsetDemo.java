package collection;

import model.Student;

import java.util.HashSet;

public class HashsetDemo {
   public void demo(){

        HashSet<Student> hashSet=new HashSet<>();
        Student student=new Student("java",23,"CS");
        Student student1=new Student("core ",34,"IT");
        Student student2=new Student("java",23,"CS");
        Student student3=new Student("core ",34,"IT");
        hashSet.add(student);
        hashSet.add(student1);
        hashSet.add(student2);
        hashSet.add(student3);
        //for(data type var:object){}

        for(Student var:hashSet){
            System.out.println("Student name :"+var.getName());
            System.out.println("Student age :"+var.getAge());
            System.out.println("Student dept :"+var.getDept());

        }

    }

    public static void main(String[] args) {
       HashsetDemo OBJ=new HashsetDemo();
       OBJ.demo();

    }




}
