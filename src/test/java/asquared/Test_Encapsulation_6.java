package asquared;

import org.junit.Test;

public class Test_Encapsulation_6 {
    @Test
    public void callingADifferentClass(){
        //Instantiating a class
        Test_MultipleMethods_3 test_multipleMethods_3 = new Test_MultipleMethods_3();
        //test_learningVariables_4 is called Object of the class
        test_multipleMethods_3.iLearned();

        Test_LearningVariables_4 test_learningVariables_4 = new Test_LearningVariables_4();
        System.out.println(test_learningVariables_4.weekDay);
        test_learningVariables_4.weekDay = "Tuesday";
        System.out.println(test_learningVariables_4.weekDay);
        test_learningVariables_4.variableExamples();
    }
}
