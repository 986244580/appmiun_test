package pages;

import common.Helper;
import org.openqa.selenium.WebElement;

public class PageAbout {

    private Helper helper;

    public PageAbout(Helper helper) {
        this.helper = helper;
    }

    public WebElement getVersionNameTextView(){
        return helper.findById("net.oschina.app:id/tv_version_name");
    }

    public String getVersionName(){
        return getVersionNameTextView().getText();
    }
}
