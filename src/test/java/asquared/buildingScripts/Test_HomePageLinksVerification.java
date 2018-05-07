package asquared.buildingScripts;

import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Test_HomePageLinksVerification {
    @Test
    public void homePageLinksVerification(){
        //Class     object  = new class name()
        WebDriver driver = new FirefoxDriver();
        String baseURL = "http://newtours.demoaut.com/";

        // Go to http://newtours.demoaut.com/
        driver.get(baseURL);

        // Verify webpage loads "Welcome: Mercury Tours"
        assertEquals("Welcome: Mercury Tours", driver.getTitle());

        // Verify Home link exist
        assertEquals("Home", driver.findElement(By.linkText("Home")).getText());

        // Verify Flights link exist
        assertTrue(driver.findElement(By.linkText("Flights")).isDisplayed());

        // Verify Hotels link exist
        assertTrue(driver.findElement(By.linkText("Hotels")).isDisplayed());

        //Verify Cars link exist

        // Verify Cruises link exist

    }
}
