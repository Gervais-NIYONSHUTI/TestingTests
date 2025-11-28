package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class DemoSitePage {
    private WebDriver driver;
    private By cards = By.cssSelector(".card");

    public DemoSitePage(WebDriver driver) {
        this.driver = driver;
    }
    public AlertsWindowPage  clickAlertsWindowCard() {
        Set<String> handlesSet = driver.getWindowHandles();
        List<String> handlesList = new ArrayList<>(handlesSet);
        String currentHandle = driver.getWindowHandle();
        int currentIndex = handlesList.indexOf(currentHandle);
        int nextIndex = currentIndex + 1;
        String nextHandle = handlesList.get(nextIndex);
        driver.switchTo().window(nextHandle);

        driver.findElements(cards).get(2).click();
        return new AlertsWindowPage(driver);
    }

}
