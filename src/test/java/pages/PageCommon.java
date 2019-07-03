package pages;

import common.Helper;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class PageCommon {

    private Helper helper;

    public PageCommon(Helper helper) {
        this.helper = helper;
    }

    public WebElement getHomeTab(){
        return helper.findById("net.oschina.app:id/nav_item_news");
    }

    public WebElement getMomentTab(){
        return helper.findById("net.oschina.app:id/nav_item_tweet");
    }

    public WebElement getPublishBtn(){
        return helper.findById("net.oschina.app:id/nav_item_tweet_pub");
    }

    public WebElement getExloreTab(){
        return helper.findById("net.oschina.app:id/nav_item_explore");
    }

    public WebElement getMySettingsTab(){
        return helper.findById("net.oschina.app:id/nav_item_me");
    }

    public void goToHomeTab(){
        helper.click(getHomeTab());
    }

    public void goToMomentTab(){
        helper.click(getMomentTab());
    }

    public void goToPublishBtn(){
        helper.click(getPublishBtn());
    }

    public void goToExloreTab(){
        helper.click(getExloreTab());
    }

    public void goToMySettingsTab(){
        helper.click(getMySettingsTab());
    }

    public void goBack(){
        helper.goBack();
    }

    public void switchToWebView(){
        Set<String> handlers = helper.getContentHandlers();
        for (String handler : handlers){
            System.out.println("================" + handler  + "====" + handlers.size());
        }
        helper.content("WEBVIEW_net.oschina.app");
    }


    public void switchToNative(){
        helper.content("NATIVE_APP");
    }
}
