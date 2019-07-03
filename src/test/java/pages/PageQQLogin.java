package pages;

import common.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PageQQLogin {

    private Helper helper;

    public PageQQLogin(Helper helper) {
        this.helper = helper;
    }

    public WebElement getNameEditText(){
        return getEditText(0);
    }

    public WebElement getPassWordEditText(){
        return getEditText(1);
    }

    public WebElement getEditText(int index){
        return helper.findByClsName("android.widget.RelativeLayout").findElements(By.className("android.widget.EditText")).get(index);
    }

    public void enterName(String name){
        getNameEditText().clear();
        getNameEditText().sendKeys(name);
    }

    public void enterPassword(String pwd){
        getPassWordEditText().sendKeys(pwd);

    }
}
