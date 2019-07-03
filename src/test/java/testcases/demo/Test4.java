package testcases.demo;


import common.Helper;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Test4 {

    private AppiumDriver driver;


    @BeforeMethod
    public void setUp() throws MalformedURLException {

        File classpathRoot = new File(System.getProperty("user.dir"));
        //app的目录
        File appDir = new File(classpathRoot, "apps/");
        //app的名字，对应你apps目录下的文件
        File app = new File(appDir, "zhongguo.apk");
        if (app.exists()){
            System.out.println("apk存在");
        }

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName" , "TWGDU16A23007557");
        capabilities.setCapability("noReset" , "true");
        capabilities.setCapability("app" , app.getAbsolutePath());
        capabilities.setCapability("platformName" , "Android");
//        capabilities.setCapability("platformVersion" , "7.1.1");
        capabilities.setCapability(CapabilityType.BROWSER_NAME , "");
        //设置键盘使得支持中文输入
        capabilities.setCapability("unicodeKeyboard" , "true");
        capabilities.setCapability("resetKeyboard" , "true");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
        capabilities.setCapability(MobileCapabilityType.APPIUM_VERSION, "1.13.0");
        capabilities.setCapability("platformVersion" , "8.0.0");
        capabilities.setCapability("appPackage" , "net.oschina.app");
        capabilities.setCapability("appActivity" , "net.oschina.app.improve.main.splash.SplashActivity");
        System.out.println("1111111");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub" ), capabilities);
        System.out.println("2222222");
    }

    @Test
    public void testName() throws InterruptedException {
        System.out.println("testName");
        Thread.sleep(8000);
        Helper helper = new Helper(driver);
        Thread.sleep(3000);
        helper.findByClsText("问答").click();
//        String a = "问答";
//        driver.findElement(By.xpath("//*[@text='"+a+"']")).click();
//        driver.findElement(By.id("net.oschina.app:id/nav_item_me")).click();
//        driver.findElement(By.id("net.oschina.app:id/iv_portrait")).click();
//
//        WebElement nameEditText = driver.findElement(By.id("net.oschina.app:id/et_login_username"));
//        nameEditText.sendKeys("世界你好");



        Thread.sleep(5000);
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("结束");
        driver.quit();
    }


}