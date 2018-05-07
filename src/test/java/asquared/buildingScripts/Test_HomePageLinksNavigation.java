package asquared.buildingScripts;

import core.baseClass;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Test_HomePageLinksNavigation extends baseClass {
    @Test
    public void homePageLinksNavigation(){


        //Go to http://newtours.demoaut.com
        logger.info("Opening web page "+ baseUrl);
        driver.get(baseUrl);

        // Verify page title : Welcome: Mercury Tours
        logger.info("Verify page title : Welcome: Mercury Tours");

        //Click on SIGN-ON link in Header
        logger.info("Verifying SIGN-ON link exists");
        assertTrue(driver.findElement(By.linkText("SIGN-ON")).isDisplayed());

        logger.info("Clickingon the link SIGN-ON");
        driver.findElement(By.linkText("SIGN-ON")).click();

        // Verify page title : Sign-on: Mercury Tours
        logger.info("Verify page title : Sign-on: Mercury Tours");
        assertEquals("Sign-on: Mercury Tours", driver.getTitle());

        //Click on SUPPORT link in Header

        // Verify page title : Under Construction: Mercury Tours

        //Click on CONTACT link in Header

        // Verify page title : Under Construction: Mercury Tours

        //Click on Home link in left side menu

        // Verify page title : Welcome: Mercury Tours

        //Click on Flights link in left side menu

        // Verify page title : Welcome: Mercury Tours

        //Click on Hotels link in left side menu

        // Verify page title : Under Construction: Mercury Tours

        //Click on Car Rentals link in left side menu

        // Verify page title : Under Construction: Mercury Tours

        //Click on Cruises link in left side menu

        // Verify page title : Cruises: Mercury Tours

        //Click on Destinations link in left side menu

        // Verify page title : Under Construction: Mercury Tours

        //Click on Vacations link in left side menu

        // Verify page title : Under Construction: Mercury Tours
    }
}
