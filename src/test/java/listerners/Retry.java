package listerners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {

    int reTryCount = 1;
    int index = 1;

    public boolean retry(ITestResult iTestResult) {

        if (index <= reTryCount) {
            index ++ ;
            return true;
        }

        return false;
    }
}
