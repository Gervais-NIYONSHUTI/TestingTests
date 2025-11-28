package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsWindowPage {
    private WebDriver driver;
    private By alert = By.cssSelector(".element-group .element-list #item-1");
    private By clickmeSelector = By.cssSelector("#alertButton");

    public AlertsWindowPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickAlert() {
        driver.findElements(alert).get(1).click();
        driver.findElement(clickmeSelector).click();
        driver.switchTo().alert().accept();
    }
}
