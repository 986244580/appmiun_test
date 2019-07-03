package testcases.crossapp;

import common.BasicTestCase;
import org.testng.annotations.Test;

public class CrossApp extends BasicTestCase {

    @Test
    public void testCross() throws InterruptedException {
        pageHelper.getPageNews().clickNewsItem(6);
        pageHelper.getPageNewsDetail().clickShareBtn();

        //点击第四个按钮，就是分享QQ按钮
        pageHelper.getPageNewsDetail().clickShareByIndex(3);
        Thread.sleep(5000);
        pageHelper.getPageQQLogin().enterName("986244580");
        pageHelper.getPageQQLogin().enterPassword("986244580");
    }
}
