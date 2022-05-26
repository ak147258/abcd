package demoifelse;

import java.util.Scanner;

public class RajIF {
    public static void main(String[] args) {
      //class name obj name=new class name(System.in);
        Scanner obj=new Scanner(System.in);
        System.out.println("welcome to age department");
        int age= obj.nextInt();
        if (age < 18) {

            System.out.println("he is kid");
        } else {
            System.out.println("he is not kid");
        }
        Scanner obj1=new Scanner(System.in);
        System.out.println("welcome to name enqueary");
        String name= obj1.nextLine();
        if (name =="Raj kumar") {
            System.out.println("my name is rajkumar");
        } else {
            System.out.println("my name is not rajkumar");
        }

        Scanner obj2=new Scanner(System.in);
        System.out.println("welcome to salary department");
        double salary=obj1.nextDouble();

        if (salary > 61000){
            System.out.println("good salary");
         }
         else{
            System.out.println("not good salary");
        }
}
}



