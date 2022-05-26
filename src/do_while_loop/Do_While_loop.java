package do_while_loop;

public class Do_While_loop {

    public static void main(String[]args){
              //increment+++
        //Syntax:do{code} while(condition);
        int i=0;
        do{
            System.out.println("increment::"+i);
            i++;
        }
        while (i<30);

       // decrement---
        i=30;
        do{
            System.out.println("decrement::"+i);
            i--;
        }
        while (i>0);
    }
}
