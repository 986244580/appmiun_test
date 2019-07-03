package testcases.addtofavonies;

import common.BasicTestCase;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class AddToFavorites extends BasicTestCase {


    @Test
    public void testAddToFavorites() throws Exception{
        pageHelper.getPageCommon().goToMySettingsTab();
        pageHelper.getPageMySettings().clickLoginIcon();
        pageHelper.getPageLogin().login("735723619@qq.com" , "12345678");
//        pageHelper.getPageCommon().goBack();
        pageHelper.getPageCommon().goToHomeTab();
        String title = pageHelper.getPageNews().getNewsTitle(6);
        pageHelper.getPageNews().clickNewsItem(6);
        pageHelper.getPageNewsDetail().clickAddToFavorites();
        Thread.sleep(1000);
        pageHelper.getPageCommon().goBack();
        pageHelper.getPageCommon().goToMySettingsTab();
        pageHelper.getPageMySettings().clickFavoritesLayout();
        System.out.println("Title:" + title);
        System.out.println("getFavoritesTitle:" + pageHelper.getPageFavoritesList().getFavoritesTitle(0));
        assertTrue(title.contains(pageHelper.getPageFavoritesList().getFavoritesTitle(0)));
//        assertEqualst(title , );
    }
}
