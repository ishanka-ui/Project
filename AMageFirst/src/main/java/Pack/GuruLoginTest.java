


package Pack;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;



import java.io.FileReader;

public class GuruLoginTest {
    private static WebDriver driver;
    private GuruLoginPage loginPage;
    private ExtentReports extent;
    private ExtentTest test;
    private JsonObject testData;
    private HomePage homePage;
   
    // Declare testData as an instance variable
 
    @Before
    public void setUp() {
        // Use WebDriver Manager to set up the ChromeDriver
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.get("https://www.guru.com/login.aspx");
        loginPage = new GuruLoginPage(driver);
        
        homePage = new HomePage(driver);

        // Read test data from the JSON file
        testData = readTestData("C:\\Users\\IshankaPu\\Downloads\\Ishanka\\Data\\UserCreation\\test-data.json");

        // Initialize Extent Reports
        extent = ExtentReportSetup.setUpExtentReport();

        // Create a test
        test = ExtentReportSetup.createTest("Guru Login Test");
        
       
    }
   

    private JsonObject readTestData(String filePath) {
        JsonObject jsonObject = null;
        try {
            FileReader reader = new FileReader(filePath);
            jsonObject = JsonParser.parseReader(reader).getAsJsonObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonObject;
    }


    @Test()
    public void testLogin() throws InterruptedException {
        // Retrieve test data from JSON
        String username = testData.get("username").getAsString();
        String password = testData.get("password").getAsString();
        
        
        
        // Login Test
        
        test.log(Status.INFO, "Clicking the Accept All Cookies");
        homePage.clickAcceptAllCookies();
        
        test.log(Status.INFO, "Entering username");
        loginPage.enterUsername(username);
        test.log(Status.INFO, "Entering password");
        loginPage.enterPassword(password);
        test.log(Status.INFO, "Clicking the login button");
        loginPage.clickLoginButton();
        Thread.sleep(8000);
        test.log(Status.INFO, "Clicking the SkipButton");
        homePage.clickSkipButton();
        
        test.log(Status.INFO, "Clicking the DashBoard");
        homePage.clickDashBoardButton();
 
      
        Assert.assertTrue(true, "Login was successful.");
    }

    @AfterTest
    public void tearDown() {
        // Close the WebDriver
        driver.quit();

        // End the test and write the report
        extent.flush();
       
    }
    

    }

 

