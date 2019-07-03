package testcases.demo;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Test {

    private AndroidDriver driver;


    @BeforeMethod
    public void setUp() throws MalformedURLException {

        File classpathRoot = new File(System.getProperty("user.dir"));
        //app的目录
        File appDir = new File(classpathRoot, "apps/");
        //app的名字，对应你apps目录下的文件
        File app = new File(appDir, "zuiyou.apk");
        if (app.exists()){
            System.out.println("apk存在");
        }

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName" , "TWGDU16A23007557");
//        capabilities.setCapability("deviceName" , "emulator-5554");
//        capabilities.setCapability("udid" , "emulator-5554");
        capabilities.setCapability("noReset" , "true");
        capabilities.setCapability("app" , app.getAbsolutePath());
        capabilities.setCapability("platformName" , "Android");
//        capabilities.setCapability("platformVersion" , "7.1.1");
        capabilities.setCapability("platformVersion" , "8.0.0");
        capabilities.setCapability("appPackage" , "cn.xiaochuankeji.tieba");
        capabilities.setCapability("appActivity" , "cn.xiaochuankeji.tieba.ui.base.SplashActivity");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub" ), capabilities);
        System.out.println("开始");
    }

    @org.testng.annotations.Test
    public void testName() throws InterruptedException {
        Thread.sleep(10000);
        WebElement imageView =  driver.findElementById("cn.xiaochuankeji.tieba:id/iconTabItem");
        imageView.click();

//        WebElement textView = (WebElement) driver.findElementsById("cn.xiaochuankeji.tieba:id/tvPostContent").get(0);
//        System.out.println("文本:" + textView.getText());
        Thread.sleep(3000);
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("结束");
        driver.quit();
    }


}