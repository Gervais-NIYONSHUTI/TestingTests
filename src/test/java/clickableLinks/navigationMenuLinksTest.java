package clickableLinks;

import base.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

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
            homePage.navigationLinks(linkSelector);
            goHome();
        }
    }
}
