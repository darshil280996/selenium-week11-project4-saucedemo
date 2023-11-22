package saucedemo;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginTest extends BaseTest {

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        driver.get("https://www.saucedemo.com/");
        WebElement usernameField = driver.findElement(By.id("user-name"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));

        usernameField.sendKeys("standard_user");
        passwordField.sendKeys("secret_sauce");
        loginButton.click();

        WebElement productsText = driver.findElement(By.xpath("//div[@class='product_label' and text()='Products']"));
        Assert.assertTrue(productsText.isDisplayed());
    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {
        // Implement your test steps for this scenario
        WebElement usernameField = driver.findElement(By.id("user-name"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));

        usernameField.sendKeys("standard_user");
        passwordField.sendKeys("secret_sauce");
        loginButton.click();

        // Verify that six products are displayed on the page
        List<WebElement> products = driver.findElements(By.className("inventory_item"));
        Assert.assertEquals(String.valueOf(products.size()), 6, "Number of products displayed is not equal to 6");
    }
}
