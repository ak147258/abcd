package operator;

public class Andoperator {
    public static void main(String[] args) {


        //if true & true=true
        int age = 19;
        String city = "agra";

        if (age > 18 & city == "agra") {

            System.out.println("he is eligible for voting in agra");
        } else {
            System.out.println("he is not eligible for voting in agra ");
        }
        // false & true=false
        age = 11;
        if (age > 18 & city == "agra") {

            System.out.println("he is eligible for voting in agra");
        } else {
            System.out.println("he is not eligible for voting in agra");
        }
        //true & false=false
        city = "dehli";
        if (age > 18 & city == "agra") {
            System.out.println("he is eligible for voting in agra ");
        }
        else{
            System.out.println("he is not eligible for voting in agra ");
        }
        //false & false=false
        age=16;
        city="dehli";
        if(age>18 & city=="agra"){
            System.out.println("he is eligible for voting in agra");
        }
        else{
            System.out.println("he is not eligible for voting in agra");
        }
    }
}



