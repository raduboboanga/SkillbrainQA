package org.exemple.selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    @Test
    public void loginPositive(){
        WebElement loginButton = driver.findElement(By.cssSelector("a#login2"));
        loginButton.click();
        WebElement  username = driver.findElement(By.cssSelector("a#loginusername2"));
        
    }
}
