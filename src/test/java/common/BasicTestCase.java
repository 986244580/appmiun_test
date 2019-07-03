package common;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import static org.testng.Assert.*;

public class BasicTestCase {

    private static AppiumDriver driver;



    private Helper helper;
    public PageHelper pageHelper;

    @BeforeMethod
    public void setUp() throws MalformedURLException {


        File classpathRoot = new File(System.getProperty("user.dir"));
        //app的目录
        File appDir = new File(classpathRoot, "apps/");
        //app的名字，对应你apps目录下的文件
        File app = new File(appDir, "zhongguo.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName" , "TWGDU16A23007557");
        capabilities.setCapability("noReset" , "true");
        capabilities.setCapability("app" , app.getAbsolutePath());
        capabilities.setCapability("platformName" , "Android");
        capabilities.setCapability(CapabilityType.BROWSER_NAME , "");
        File chromeDrverPath = new File(System.getProperty("user.dir"));
        capabilities.setCapability("chromedriverExecutable" ,chromeDrverPath.getAbsolutePath() + "/chromedriver.exe" );
        //设置键盘使得支持中文输入
        capabilities.setCapability("unicodeKeyboard" , "true");
//        capabilities.setCapability("resetKeyboard" , "true");
//        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
//        capabilities.setCapability(MobileCapabilityType.APPIUM_VERSION, "1.13.0");
        capabilities.setCapability("platformVersion" , "8.0.0");
        capabilities.setCapability("appPackage" , "net.oschina.app");
        capabilities.setCapability("appActivity" , "net.oschina.app.improve.main.splash.SplashActivity");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub" ), capabilities);

        helper = new Helper(driver);
        pageHelper = new PageHelper(helper);
//        pageHelper.getPageCommon().goToMySettingsTab();
//        if ("ifabcasd156".equals(pageHelper.getPageMySettings().getNickName())){
//            pageHelper.getPageMySettings().clickSettingBtn();
//            pageHelper.getPageSetting().clickLoginOut();
//            pageHelper.getPageSetting().goBack();
//        }
//        pageHelper.getPageCommon().goToHomeTab();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {

        System.out.println("结束");
//        driver.quit();
    }

    public static AppiumDriver getDriver(){
        return driver;
    }
}