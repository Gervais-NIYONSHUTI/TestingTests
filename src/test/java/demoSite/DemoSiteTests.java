package demoSite;

import Pages.DemoSitePage;
import base.BaseTests;
import org.testng.annotations.Test;

public class DemoSiteTests extends BaseTests {
    @Test
    public void alert() {
        var demoSitePage = homePage.clickDemoSitePage();
        demoSitePage.clickAlertsWindowCard().clickAlert();
    }
}
