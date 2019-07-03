package pages;

import common.Helper;
import org.openqa.selenium.WebElement;

/**
 * 设置界面
 */
public class PageMySettings {

    private Helper helper;

    public PageMySettings(Helper helper) {
        this.helper = helper;
    }

    /**
     * 设置按钮
     * @return
     */
    public WebElement getSettingBtn(){
        return helper.findById("net.oschina.app:id/iv_logo_setting");
    }

    /**
     * 登录图标
     * @return
     */
    public WebElement getLoginIcon(){
        return helper.findById("net.oschina.app:id/iv_portrait");
    }

    /**
     * 获取收藏布局
     * @return
     */
    public WebElement getFavoritesLayout(){
        return helper.findById("net.oschina.app:id/ly_favorite");
    }

    /**
     * nickname
     * @return
     */
    public WebElement getNickNameTextView() {
        return helper.findById("net.oschina.app:id/tv_nick");
    }

    /**
     * 我的消息
     * @return
     */
    public WebElement getMyMsgItem(){
        return helper.findById("net.oschina.app:id/rl_message");
    }

    /**
     * 我的勋章
     */
    public WebElement getMyMedalItem(){
        return helper.findById("net.oschina.app:id/rl_medal");
    }

    /**
     * 阅读记录
     */
    public WebElement getReadingRecordsItem(){
        return helper.findById("net.oschina.app:id/rl_read");
    }

    /**
     * 我的博客
     */
    public WebElement getMyBlogItem(){
        return helper.findById("net.oschina.app:id/rl_blog");
    }

    /**
     * 我的灰名单
     */
    public WebElement getMyBlackListItem(){
        return helper.findById("net.oschina.app:id/rl_blacklist");
    }

    /**
     * 我的问答
     */
    public WebElement getMyQuestionItem(){
        return helper.findById("net.oschina.app:id/rl_info_question");
    }

    /**
     * 点击我的消息
     */
    public void clickMyMsgItem(){
        helper.click(getMyMsgItem());
    }

    /**
     * 点击阅读记录
     */
    public void clickReadingRecordsItem(){
        helper.click(getReadingRecordsItem());
    }

    /**
     * 点击我的博客
     */
    public void clickMyBlogItem(){
        helper.click(getMyBlogItem());
    }

    /**
     * 点击我的灰名单
     */
    public void clickMyBlackListItem(){
        helper.click(getMyBlackListItem());
    }

    /**
     * 点击我的问答
     */
    public void clickMyQuestionItem(){
        helper.click(getMyQuestionItem());
    }

    /**
     * 点击登录icon
     */
    public void clickLoginIcon(){
        helper.click(getLoginIcon());
    }

    public void clickSettingBtn(){
        helper.click(getSettingBtn());
    }

    public String getNickName(){
        return getNickNameTextView().getText();
    }

    public void clickFavoritesLayout(){
        helper.click(getFavoritesLayout());
    }
}
