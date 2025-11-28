package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By seleniumTrainingPage = By.cssSelector(".navbar__links [href='/selenium-training?q=headers']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public SeleniumTrainingPage clickSeleniumTrainingPage() {
        clickLink(seleniumTrainingPage);
        return new SeleniumTrainingPage(driver);
    }
    public void navigationLinks(String selector){
        driver.findElement(By.cssSelector(selector)).click();
    }
    private void clickLink(By element){
        driver.findElement(seleniumTrainingPage).click();
    }
}
