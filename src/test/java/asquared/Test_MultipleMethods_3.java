package asquared;

import org.junit.Test;

public class Test_MultipleMethods_3 {
    //Class can have multiple methods
    //Methods order does not matter while executing the code

    public void iLearned(){
        //space();
        System.out.println("In Asquared");
        System.out.println("--------------");
        System.out.print("I learned ");
    }

    /*public void space(){
        System.out.println("");
    }*/

    @Test
    public void mainMethod(){
        iLearned();
        System.out.println("2nd multiplication table");
        //space();
        
        iLearned();
        System.out.println("3rd multiplication table");

        iLearned();
        System.out.println("4th multiplication table");
        
        iLearned();
        System.out.println("5th multiplication table");
        
        iLearned();
        System.out.println("6th multiplication table");
        
        iLearned();
        System.out.println("7th multiplication table");
        
        iLearned();
        System.out.println("8th multiplication table");
        
        iLearned();
        System.out.println("9th multiplication table");
        //space();
    }

}
