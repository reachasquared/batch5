package asquared.buildingScripts;

import core.baseClass;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Test_newToursRegistrationXpath extends baseClass {
    public void newToursRegistration() {
        // Go to http://newtours.demoaut.com/
        logger.info("Opening webpage : " + baseUrl);
        driver.get(baseUrl);

        // Verify webpage loads
        logger.info("Verify webpage loads");
        //using selenium method
        assertEquals("Welcome: Mercury Tours", driver.getTitle());
        //using xpath
        assertEquals("Welcome: Mercury Tours", driver.findElement(By.xpath("//title")).getText());

        // Click on REGISTER link in Header
        logger.info("Click on REGISTER link in Header");
        //verify link exist
        assertTrue(driver.findElement(By.xpath("//a[@href='mercuryregister.php']")).isDisplayed());
        //click on Register link
        driver.findElement(By.xpath("//a[@href='mercuryregister.php']")).click();

        //Verify page title: Register: Mercury Tours
        assertEquals("Register: Mercury Tours", driver.findElement(By.xpath("//title")).getText());

        // Enter the data into fields
        logger.info("entering data");
        //First name : Reach
        logger.info("First name : Reach");
        //Clear input field
        driver.findElement(By.xpath("//input[@name='firstName']")).clear();
        //Enter data
        driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Reach");

        //Last name : Asquared
        isElementPresent(By.xpath("//input[@name='firstName']"));//Verify element present
        driver.findElement(By.xpath("//input[@name='firstName']")).clear();//Clear input field
        driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Asquared");//Enter data

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
