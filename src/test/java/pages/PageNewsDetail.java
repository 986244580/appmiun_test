package pages;

import common.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PageNewsDetail {

    private Helper helper;

    public PageNewsDetail(Helper helper) {
        this.helper = helper;
    }

    public WebElement getAddToFavoritesBtn(){
        return helper.findById("net.oschina.app:id/ib_fav");
    }

    public WebElement getShareBtn(){
        return helper.findById("net.oschina.app:id/menu_share");
    }

    public WebElement getShareToQQ(){
        return helper.findByClsText("QQ");
    }

    public WebElement getShareRecycler(){
        return helper.findById("net.oschina.app:id/share_recycler");
    }

    public WebElement getShareByIndex(int index){
        return getShareRecycler().findElements(By.className("android.widget.LinearLayout")).get(index);
    }

    public WebElement getFirstLine(){
        return helper.findByXpath("/html/body/div/[1]");
    }

    public String getFirstLineText(){
        return helper.getText(getFirstLine());
    }

    public void clickAddToFavorites(){
        helper.click(getAddToFavoritesBtn());
    }

    public void clickShareBtn(){
        helper.click(getShareBtn());
    }

    public void clickShareByIndex(int index){
        helper.click(getShareByIndex(index));
    }

}
