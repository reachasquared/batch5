package core;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;

public class baseClass {
    public WebDriver driver;
    public String baseUrl;
    public boolean acceptNextAlert = true;
    public StringBuffer verificationErrors = new StringBuffer();
    public Logger logger = LogManager.getLogger("myLog");

    @Before
    public void setUp() {
        // inform where is geckodriver exec
        System.setProperty("webdriver.gecko.driver", "src" + File.separator + "main" + File.separator + "resources" + File.separator + "geckodriver.exe");

        driver = new FirefoxDriver();
        baseUrl = "http://newtours.demoaut.com/";
        driver.manage().timeouts()
                .implicitlyWait(30, TimeUnit.SECONDS);
    }
    @After
    public void tearDown() {
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
     * Method that should replace each static wait in tests. It waits 1000 milis.
     */
    public static void waitASecond() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Waits waitTime seconds. Some testcases specify a fixed wait time, this method is intended for those
     * Tests that do not specifically require a set wait time should use other wait methods
     *
     * @param waitTime
     */
    public static void waitSpecifiedSeconds(long waitTime) {
        for (int x = 1; x <= waitTime; x++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print("WaitSpecifiedSeconds: " + waitTime + "(sec)");
    }

}
