package navigationLinks;

import base.BaseTests;
import org.testng.annotations.Test;

public class navigationMenuLinksTest extends BaseTests {
    @Test
    public void clickNavigationLinks(){
        String[] navigationSelectors = new String[]{
                ".navbar__links a[href='/']",
                ".navbar__links a[href='/selenium-training?q=headers']",
                ".navbar__links a[href='https://demoqa.com']",
                ".navbar__links a[href='/about']",
        };
        for(String linkSelector : navigationSelectors){
            homePage.clickableNavigationLinks(linkSelector);
            goHome();
        }
    }
}
