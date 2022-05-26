package demoscanner;

import java.util.Scanner;

public class DemoSCANNER {
    public void Sc(){
        Scanner sc=new Scanner(System.in);
            double total_marks=500;
        System.out.println("enter marks for subject");


        System.out.println("plz enter your marks in English");
        double a= sc.nextDouble();

        System.out.println("pls enter your marks in Math");
        double b= sc.nextDouble();

        System.out.println("plz enter your marks in Hindi");
        double c= sc.nextDouble();

        System.out.println("plz enter your marks in physics");
        double d= sc.nextDouble();

        System.out.println("plz enter your marks in chemistry");
        double e= sc.nextDouble();

        System.out.println("500="+(a+b+c+d+e));
        double f= sc.nextDouble();
        }
        public static void main(String[]args){
       DemoSCANNER obj=new DemoSCANNER();
       obj.Sc();
        }
    }
