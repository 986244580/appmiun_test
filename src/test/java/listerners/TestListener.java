package listerners;

import common.BasicTestCase;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestListener implements ITestListener {

    public void onTestStart(ITestResult iTestResult) {
        System.out.println("TestListener===============onTestStart");
    }

    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("TestListener===============onTestSuccess");
    }

    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("TestListener===============onTestFailure");
        File srcFile = BasicTestCase.getDriver().getScreenshotAs(OutputType.FILE);
        String scriptName = iTestResult.getMethod().getRealClass().getSimpleName() + "." + iTestResult.getMethod().getMethodName();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        String destDir = "screenShots";
        String fileName = scriptName + dateFormat.format(new Date()) + ".png";


        try {
            FileUtils.copyFile(srcFile ,  new File(destDir + "/" + fileName ));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("TestListener===============onTestSkipped");

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        System.out.println("TestListener===============onTestFailedButWithinSuccessPercentage");
    }

    public void onStart(ITestContext iTestContext) {
        System.out.println("TestListener===============onStart");
    }

    public void onFinish(ITestContext iTestContext) {
        System.out.println("TestListener===============onFinish");
    }
}
