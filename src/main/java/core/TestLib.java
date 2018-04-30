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
    public WebDriver driver;
    public String baseUrl;
    public boolean acceptNextAlert = true;
    public StringBuffer verificationErrors = new StringBuffer();
    public Logger logger = LogManager.getLogger("test");

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "http://newtours.demoaut.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    public boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }

    /**
     * Locating Input field by label
     */
    public static String getInputElementByLabel(String expectedLabel) {
        String inputLocator = "//b[contains(text(),'%s')]/ancestor::td[1]/following-sibling::td/input";
        return String.format(inputLocator, expectedLabel);
    }

    /**
     * Locating Input field by label
     */
    public static String getInputElementByName(String elementName) {
        String inputLocator = "//input[@name='%s']))";
        return String.format(inputLocator, elementName);
    }

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
