package core;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;

/**
 * Created by snamburi on 4/30/2017.
 */
public abstract class TestLib {
    
    public void whoAmI(){
        System.out.println("baseClass : I am in Super or Base Class");
    }

    public void iLearned(){
        System.out.println();
        System.out.println("In Asquared");
        System.out.println("--------------");
        System.out.print("I learned ");
    }

    //Overriding a method : Same name but the differnce is passing a parameter
    public void iLearned(String institute){
        System.out.println();
        System.out.println("In " + institute);
        System.out.println("--------------");
        System.out.print("I learned ");
    }
}
