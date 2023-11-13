package Pack;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.testng.Assert;
import org.testng.annotations.*;

public class First
{
	
	
@Test
	  public void Test()
	    {
			WebDriver driver;
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
	        driver.get("https://qa-sl.fusionx.biz/web/home/AnRkr/dashboard");
	        
	        
	        Assert.assertEquals(driver.findElement(By.xpath("//h1[@class='c3760de76 ccfb7424b']")).getText(), "Welcome");
	        System.out.println(driver.findElement(By.xpath("//h1[@class='c3760de76 ccfb7424b']")).getText());
	        
	        driver.findElement(By.id("username")).sendKeys("nilmieg@lolctech.com");
	        
	      
	        
	        
	      //  driver.close();
           // driver.quit();
	        
	    }
	    
}
