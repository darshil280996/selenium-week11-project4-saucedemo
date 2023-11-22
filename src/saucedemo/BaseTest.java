package saucedemo;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    protected WebDriver driver;

    @Before
    public void setUp() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // You can add more setup configurations if needed.
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
