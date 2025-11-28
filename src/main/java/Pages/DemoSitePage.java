package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.swing.*;
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
        switchTabs();
        WebElement card = driver.findElements(cards).get(2);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", card);
        card.click();
        return new AlertsWindowPage(driver);
    }
    public FormPage clickFormPage() {
        switchTabs();
        WebElement card = driver.findElements(cards).get(1);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", card);
        card.click();
        return new FormPage(driver);
    }
    private void switchTabs(){
        Set<String> handlesSet = driver.getWindowHandles();
        List<String> handlesList = new ArrayList<>(handlesSet);
        String currentHandle = driver.getWindowHandle();
        int currentIndex = handlesList.indexOf(currentHandle);
        int nextIndex = currentIndex + 1;
        String nextHandle = handlesList.get(nextIndex);
        driver.switchTo().window(nextHandle);
    }

}
