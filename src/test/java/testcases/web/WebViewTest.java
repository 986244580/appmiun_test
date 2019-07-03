package testcases.web;

import common.BasicTestCase;
import org.testng.annotations.Test;

public class WebViewTest extends BasicTestCase {


    @Test
    public void testWebView() throws InterruptedException {
        pageHelper.getPageNews().clickNewsItem(6);
        Thread.sleep(5000);
        pageHelper.getPageCommon().switchToWebView();
        Thread.sleep(10000);
        System.out.println(pageHelper.getPageNewsDetail().getFirstLineText());

    }

}
