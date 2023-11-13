package Pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	private final WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    By  AcceptAllCookiesLocator = By.id("onetrust-accept-btn-handler");
    By  SkipButtonnLocator = By.id("skip-for-now");
    By  DashBoardLocator = By.id("ctl00_ctl11_navDashboard");
    
    public void clickSkipButton() throws InterruptedException {
        WebElement SkipButtonElement = driver.findElement(SkipButtonnLocator);
        Thread.sleep(4000);
        SkipButtonElement.click(); 
           
    }
    public void clickDashBoardButton() throws InterruptedException {
        WebElement DashBoardButtonnElement = driver.findElement( DashBoardLocator);
        Thread.sleep(4000);
        DashBoardButtonnElement.click();
           
}
    public void clickAcceptAllCookies() throws InterruptedException {
        WebElement AcceptAllCookiesElement = driver.findElement(AcceptAllCookiesLocator);
        Thread.sleep(4000);
        AcceptAllCookiesElement.click();
           
}
}
