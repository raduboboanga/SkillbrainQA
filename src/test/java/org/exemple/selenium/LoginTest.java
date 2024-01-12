package org.exemple.selenium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginTest extends BaseTest {

    @Test
    public void loginPositive() throws InterruptedException {
        WebElement loginButton = driver.findElement(By.cssSelector("a#login2"));
        loginButton.click();

        Thread.sleep(500);
        //WebElement username = driver.findElement(By.cssSelector("input#loginusername"));
        WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(10));
        WebElement username = wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.cssSelector("input#loginusername")));
        username.sendKeys("skillbrainuser");
        WebElement password = driver.findElement(By.cssSelector("input#loginpassword"));
        password.sendKeys("123456");
        WebElement loginSubmit = driver.findElement(By.cssSelector("button[onclick='logIn()']"));
        loginSubmit.click();

        //Thread.sleep(1500);
        //WebElement webElement = driver.findElement(By.cssSelector("a#nameofuser"));
        boolean isWelcome = wait.until(ExpectedConditions.
                textToBe(By.cssSelector("a#nameofuser"), "Welcome skillbrainuser"));
        //String welcomeText = welcomeElement.getText();

        Assertions.assertTrue(isWelcome, "Welcome skillbrainuser is present");
    }
}
