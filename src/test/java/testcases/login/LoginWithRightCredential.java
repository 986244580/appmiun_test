package testcases.login;

import common.BasicTestCase;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginWithRightCredential extends BasicTestCase {

    @Test
    public void testLoginWithRightCredential() throws Exception{
        pageHelper.getPageCommon().goToMySettingsTab();
        //点击登录按钮
        pageHelper.getPageMySettings().clickLoginIcon();
        pageHelper.getPageLogin().login("735723619@qq.com" , "12345678");

        //断言ifabcasd159是否是nickName
        assertEquals("ifabcasd156" , pageHelper.getPageMySettings().getNickName());
    }
}
