package testcases.login;

import common.BasicTestCase;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

/**
 * 登录权限验证
 */
public class LoginPermissionCheck extends BasicTestCase {

    @Test
    public void testLoginPermission() throws Exception{
        pageHelper.getPageCommon().goToMySettingsTab();

        pageHelper.getPageMySettings().clickMyMsgItem();
        check();

        pageHelper.getPageMySettings().clickMyBlogItem();
        check();

        pageHelper.getPageMySettings().clickMyBlackListItem();
        check();


    }

    public void check(){
        assertTrue( pageHelper.getPageLogin().isLoginScreenOpened());
        pageHelper.getPageCommon().goBack();
    }

}
