package operator;

public class NOToperator{
    public static void main(String[] args) {
        //!(true)=false
        int age=17;

        if(!(age>18)){
            System.out.println("he is eligible living in noida");
        }
        else{
            System.out.println("he is not eligible living in noida");
        }

        //!(false)=true
        age=19;
        if(!(age>18)){
            System.out.println("he is eligible living in noida");
        }
        else{
            System.out.println("he is not eligible living in noida");
        }
    }
}

