package demoSite;

import base.BaseTests;
import org.testng.annotations.Test;

public class AlertAndScrollTests extends BaseTests {
    @Test
    public void alert() {
        var demoSitePage = homePage.clickDemoSitePage();
        demoSitePage.clickAlertsWindowCard().clickAlert();
    }
}
