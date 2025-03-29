package basic;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;  // Import for assertions

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Locators {
    WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "D:\\Java_Selenium_Automation\\geckodriver.exe");
        driver = new FirefoxDriver();
    }

    @Test
    public void testGoogleHomePageTitle() {
        driver.get("https://www.google.co.in/");
        String title = driver.getTitle();
        System.out.println("Page Title: " + title);
        assertEquals("Google", title);  // Assertion to check page title
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
