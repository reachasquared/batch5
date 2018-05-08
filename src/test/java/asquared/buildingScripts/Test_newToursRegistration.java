package asquared.buildingScripts;

import core.baseClass;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Test_newToursRegistration extends baseClass {
    public void newToursRegistration() throws InterruptedException {
        // Go to http://newtours.demoaut.com/
        logger.info("Opening webpage : " + baseUrl);
        driver.get(baseUrl);

        // Verify webpage loads
        logger.info("Verify webpage loads");
        assertEquals("Welcome: Mercury Tours", driver.getTitle());

        // Click on REGISTER link in Header
        logger.info("Click on REGISTER link in Header");
        assertTrue(driver.findElement(By.linkText("REGISTER")).isDisplayed());
        driver.findElement(By.linkText("REGISTER")).click();

        //Verify page title: Register: Mercury Tours
        assertEquals("Register: Mercury Tours", driver.getTitle());

        // Enter the data into fields
        logger.info("entering data");
        //First name : Reach
        logger.info("First name : Reach");
        driver.findElement(By.name("firstName")).sendKeys("Reach");

        //Last name : Asquared
        isElementPresent(By.name("lastName"));
        driver.findElement(By.name("lastName")).sendKeys("Asquared");

        //Email : testing.automation@gmail.com
        //Address: 123 Baymeadows way
        //City : Jacksonville
        //Postal Code : 32256
        //Country : United States
        //User name : username<random number>
        //Password: password
        //Confirm password: password

        //>> Click Submit


    }
}
