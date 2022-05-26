package calculator_method;

public class Inputparametor {

    //Syntax : access_specifier return_type  method_name (parameter) {}
     //addition,divide,multi
    public void addition(int a,int b){
        int sum=a+b;
        System.out.println("this is addition parameter::"+sum);
    }

    public void divide(int a,int b){
        int div=a/b;
        System.out.println("this is divide parameter::"+div);
    }
    public void multi(int a,int b){
        int multi=a*b;
        System.out.println("this is multi parameter"+multi);
    }




    public static void main(String[]args){
        Inputparametor obj=new Inputparametor();
        obj.addition(12,23);
        obj.divide(356,12);
        obj.multi(54,54);

    }
}
