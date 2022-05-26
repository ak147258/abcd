package calculator_method;

public class Area_ {

    //  hight,lenth,.....
    //sum
    public void sum(){
        int h=23;
        int l=12;
        int sum=h+l;

        System.out.println("This is area"+sum);
    }
    public void div(){
        int h=265;
        int l=12;
        int div=h/l;
        System.out.println("this div area"+div);
    }
    public static void main(String[]args){
        Area_ obj=new Area_();
        obj.sum();
        obj.div();
    }

}
