package pages;

import common.Helper;
import org.openqa.selenium.WebElement;

public class PageLogin {

    private Helper helper;

    public PageLogin(Helper helper) {
        this.helper = helper;
    }

    public WebElement getNameEditText(){
        return helper.findById("net.oschina.app:id/et_login_username");
    }

    public WebElement getPwdEditText(){
        return helper.findById("net.oschina.app:id/et_login_pwd");
    }

    public WebElement getLoginBtn(){
        return helper.findById("net.oschina.app:id/bt_login_submit");
    }

    public void clearNameText(){
        getNameEditText().clear();
    }

    public void clearPwdText(){
        getPwdEditText().clear();
    }

    public void enterName(String name){
        helper.enter(getNameEditText() , name);
    }

    public void enterPwd(String pwd){
        helper.enter(getPwdEditText() , pwd);
    }

    public void clickLoginBtn(){
        helper.click(getLoginBtn());
    }

    public void login(String name , String pwd){
        clearNameText();
        enterName(name);
        clearPwdText();
        enterPwd(pwd);
        clickLoginBtn();
    }

    /**
     * 是否是登录界面
     * @return
     */
    public boolean isLoginScreenOpened(){
        boolean result = false;
        if (getLoginBtn() != null) {
            return getLoginBtn().isDisplayed();
        }
        return result;
    }

}
