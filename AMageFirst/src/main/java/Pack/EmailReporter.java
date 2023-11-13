package Pack;
import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentEmailReporter;

public class EmailReporter {

    private static ExtentReporter extentReporter;

    public static ExtentReporter getExtentReporter(String reportFileName) {
        if (extentReporter == null) {
            extentReporter = new ExtentEmailReporter(reportFileName);
        }
        return extentReporter;
    }
}

