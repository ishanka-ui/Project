package Pack;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportSetup {
	
    private static ExtentReports extent;
    private static ExtentTest test;

    public static ExtentReports setUpExtentReport() {
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("test-output/extent-report.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        return extent;
    }

    public static ExtentTest createTest(String testName) {
        test = extent.createTest(testName);
        return test;
    }
}