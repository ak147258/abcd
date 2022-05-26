package operator;

public class ORoparator {

    public static void main(String[] args) {
        //  true||true=true
        String city = "noida";
        int age = 17;

        if (age > 18 || city == "noida") {
            System.out.println("he is eligible for living in noida");
        }
           else{
            System.out.println("he is not eligible for living in noida");
        }

           //false||true=true
           city="dehli";
           if(age>18 || city=="noida"){
               System.out.println("he is eligible for living in noida");
           }
           else{
               System.out.println("he is not eligible for living in noida");
           }

           //true||false=true(1+0=1)
        age=12;
           if(age>18 || city=="noida"){
               System.out.println("he is eligible for living in noida");
           }
           else{
               System.out.println("he is not eligible for living in noida");
           }
           //false||false=false(0+0=0)
        city="dehli";
           age=12;
           if(age>18 || city=="noida"){
               System.out.println("he is eligible for living in noida");
           }
           else{
               System.out.println("he is not eligible for living in noida");
           }
    }
    }


