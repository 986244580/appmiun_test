package common;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

public class Helper {

    private AppiumDriver driver;

    private final int DEAULT_TIMEOUT = 5;


    public Helper(AppiumDriver appiumDriver) {
        driver = appiumDriver;
    }

    public void waitForElement(By by){
        WebDriverWait wait = new WebDriverWait(driver , DEAULT_TIMEOUT);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));

    }


    /**
     * 定义常见的定位方式
     */
    public WebElement findById(String id){
        waitForElement(By.id(id));
        return (WebElement) driver.findElements(By.id(id)).get(0);
    }

    /**
     * 定义常见的定位方式
     */
    public WebElement findById(String id , int index){
        waitForElement(By.id(id));
        return (WebElement) driver.findElements(By.id(id)).get(index);
    }

    public WebElement findByClsName(String clsName){
        waitForElement(By.className(clsName));
        return (WebElement) driver.findElements(By.className(clsName)).get(0);
    }

    public WebElement findByClsText(String text){
        waitForElement(By.xpath("//*[@text='"+ text+"']"));
        return (WebElement) driver.findElements(By.xpath("//*[@text='"+ text+"']\"")).get(0);
    }

    public WebElement findByClsText(String text , int index){
        waitForElement(By.xpath("//*[@text='"+ text+"']"));
        return (WebElement) driver.findElements(By.xpath("//*[@text='"+ text+"']\"")).get(index);
    }

    public void click(WebElement webElement){
        System.out.println("执行控件点击操作-------------->" );
        webElement.click();
    }

    public void enter(WebElement webElement , String text){
        System.out.println("执行输入操作，输入的文本为:" + text );
        webElement.sendKeys(text);
    }

    public void clear(WebElement element){
        System.out.println("执行输入框清空操作------------>");
        element.clear();
    }

    /**
     * 输入前清空文本
     * @param element
     * @param text
     */
    public void enterWithPreClear(WebElement element ,String text ){
        clear(element);
        enter(element , text);
    }

    /**
     * 获取控件文本
     * @param element
     * @return
     */
    public String getText(WebElement element){
        System.out.println("执行获取控件文本操作------------>");
        return element.getText();
    }

    /**
     * 返回
     */
    public void goBack(){
        driver.navigate().back();
    }

    public WebElement findByXpath(String xpath){
        return driver.findElementByXPath(xpath);
    }

    public Set<String> getContentHandlers(){
        return driver.getContextHandles();
    }

    /**
     * 切换句柄
     * @param name
     */
    public void content(String name){
        driver.context(name);
    }



}
