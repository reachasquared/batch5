package asquared;

import org.junit.Test;

/**
 * Variables allow the Java program to store values during the runtime of the program.
 * In this class we can learn the Types and use of them
 */
public class Variables {
    @Test
    public void variableExamples() {
        //Variable declaration
        char gender; // character variable that can hold one character data
        int age; // Integer variable that can hold an integer value
        String weekDay; // String variable that can hold one string data

        //Variable initiation
        gender = 'm';
        age = 30;
        weekDay = "Sunday";

        //Variables can be declared and initiated at the same time like below
        String weekDays[] = new String[]{"Sunday", "Monday", "Tuesday"}; //String array
        boolean status = true;// Boolean variable can hold ONLY either true or false (no other data it accepts)

        //Display values
        System.out.println(gender);
        System.out.println(age);
        System.out.println(weekDay);
        System.out.println(status);
        System.out.println(weekDays[1]);

        //To be more information here we are displaying a label for each value.
        //We need to use + while concatenating two values
        System.out.println("\n");//new lines
        System.out.println("Values with labels:");

        System.out.println("Gender: " + gender);//we are displaying label 'Gender' and value
        System.out.println("age: " + age);
        System.out.println("Week: " + weekDay);
        System.out.println("Status:" + status);
        System.out.println("2nd value from Weekdays array:" + weekDays[1]);

        //Business logic that modifies values of Variables
        gender = 'f';
        age = 16;
        weekDay = "Monday";
        status = false;
        weekDays[1] = "Saturday";

        //Display values
        System.out.println("\n");//new lines
        System.out.println("Values after business logic:");
        System.out.println("Gender: " + gender);
        System.out.println("age: " + age);
        System.out.println("Week: " + weekDay);
        System.out.println("Status:" + status);
        System.out.println("2nd value from Weekdays array:" + weekDays[1]);
    }
}
