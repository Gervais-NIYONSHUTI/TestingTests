package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertsWindowPage {
    private WebDriver driver;
    private By alert = By.cssSelector("#item-1");
    private By clickmeSelector = By.cssSelector("#alertButton");

    public AlertsWindowPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickAlert() {
        driver.findElements(alert).get(1).click();
        WebElement button = driver.findElement(By.id("alertButton"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", button);
        button.click();
        driver.switchTo().alert().accept();
    }
}
