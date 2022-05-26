package calculator_method;

public class CalcuSum_Demo {
    //Sum,Divide,addition,multification

    //Sum
    public void sum(){
        int a=23;
        int b=21;
        int sum=a+b;
        System.out.println("This is sum"+sum);
        }

        //Divide
    public void div(){
        int a=365;
        int b=12;
        int div=a/b;
        System.out.println("this is div"+div);
    }

    //mul
    public void mul(){
        int a=12;
        int b=12;
        int mul=a*b;
        System.out.println("this is mul"+mul);
    }
        public static void main(String[]args){
        CalcuSum_Demo obj=new CalcuSum_Demo();
        obj.sum();
        obj.div();
        obj.mul();
        }
    }

