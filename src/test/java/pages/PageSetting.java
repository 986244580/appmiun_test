package pages;

import common.Helper;
import org.openqa.selenium.WebElement;

public class PageSetting {

    private Helper helper;

    public PageSetting(Helper helper) {
        this.helper = helper;
    }

    public WebElement getCancelItem(){
        return helper.findById("net.oschina.app:id/rl_cancel");
    }

    public WebElement getAboutItem(){
        return helper.findById("net.oschina.app:id/rl_about");
    }

    /**
     * 退出
     */
    public void clickLoginOut(){
        helper.click(getCancelItem());
    }

    public void clickAbout(){
        helper.click(getAboutItem());
    }

    public void goBack(){
        helper.goBack();
    }

}
