package pages;

import common.Helper;
import org.openqa.selenium.WebElement;

/**
 * 收藏列表页面
 */
public class PageFavoritesList {
    private Helper helper;

    public PageFavoritesList(Helper helper) {
        this.helper = helper;
    }

    public WebElement getFavoritesTitleTextView(int index){
        return helper.findById("net.oschina.app:id/tv_title");
    }

    public String getFavoritesTitle(int index) {
        return helper.getText(getFavoritesTitleTextView(index));
    }
}
