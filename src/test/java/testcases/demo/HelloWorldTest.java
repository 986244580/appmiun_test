package testcases.demo;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class HelloWorldTest {

    private AppiumDriver driver;


    @BeforeMethod
    public void setUp() throws MalformedURLException {

        File classpathRoot = new File(System.getProperty("user.dir"));
        //app的目录
        File appDir = new File(classpathRoot, "apps/");
        //app的名字，对应你apps目录下的文件
        File app = new File(appDir, "test.apk");
        if (app.exists()){
            System.out.println("apk存在");
        }

        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability("deviceName" , "TWGDU16A23007557");
        capabilities.setCapability("deviceName" , "emulator-5554");
//        capabilities.setCapability("udid" , "emulator-5554");
        capabilities.setCapability("noReset" , "true");
        capabilities.setCapability("app" , app.getAbsolutePath());
        capabilities.setCapability("platformName" , "Android");
        capabilities.setCapability("platformVersion" , "7.1.1");
//        capabilities.setCapability("platformVersion" , "8.0.0");
        capabilities.setCapability("appPackage" , "com.example.test");
        capabilities.setCapability("appActivity" , "com.example.administrator.myapplication.MainActivity");
        System.out.println("1111111");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub" ), capabilities);
        System.out.println("2222222");
    }

    @Test
    public void testName() throws InterruptedException {
        System.out.println("testName");
        Thread.sleep(10000);
        WebElement imageView =  driver.findElementById("com.example.test:id/tv_main");

//        WebElement textView = (WebElement) driver.findElementsById("cn.xiaochuankeji.tieba:id/tvPostContent").get(0);
//        System.out.println("文本:" + textView.getText());
        Thread.sleep(5000);
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("结束");
        driver.quit();
    }


}