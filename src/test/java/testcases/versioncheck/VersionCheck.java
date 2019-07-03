package testcases.versioncheck;

import common.BasicTestCase;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class VersionCheck extends BasicTestCase {

    @Test
    public void testVersionCheck() throws Exception{

        pageHelper.getPageCommon().goToMySettingsTab();
        pageHelper.getPageMySettings().clickSettingBtn();
        pageHelper.getPageSetting().clickAbout();

        assertEquals("v4.7.2" ,  pageHelper.getPageAbout().getVersionName());


    }
}
