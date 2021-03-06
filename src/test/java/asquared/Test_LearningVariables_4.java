package asquared;

import org.junit.Test;

public class Test_LearningVariables_4 {
    //Class level variables

    //this variable is declared public. this can be accessed by other classes
    public String weekDay = "Sunday";

    //this variable is declared private. this is not visible for other classes
    private boolean status = true;

    public void variableExamples() {
        //Variables allow the Java program to store values during the runtime of the program.
        //Types of variables;
        //Variable declaration
        char gender = 'm';
        int integerVariable = 7;

        System.out.println("Value of gender: " + gender);
        System.out.println("Value of integerVariable: " + integerVariable);
        System.out.println("Value of weekDay: " + weekDay);
        System.out.println("Value of status: " + status);

        weekDay = "Monday";
    }

    @Test
    public void method2(){
        variableExamples(); //calling method with in class
        System.out.println("From method2 - Value of weekDay: " + weekDay);
    }
}
