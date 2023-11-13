package Pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GuruLoginPage  {
    private final WebDriver driver;

    public GuruLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By usernameLocator = By.name("UserName");
    By passwordLocator = By.name("Password");
    By loginButtonLocator = By.id("login-button");

    public void enterUsername(String username) {
        WebElement usernameElement = driver.findElement(usernameLocator);
        usernameElement.sendKeys(username);
    }

    public void enterPassword(String password) {
        WebElement passwordElement = driver.findElement(passwordLocator);
        passwordElement.sendKeys(password);
    }

    public void clickLoginButton() throws InterruptedException {
        WebElement loginButtonElement = driver.findElement(loginButtonLocator);
        Thread.sleep(4000);
        loginButtonElement.click();
        
        
        
    }

	
}



