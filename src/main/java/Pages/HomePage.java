package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage {
    private WebDriver driver;
    private By seleniumTrainingPage = By.cssSelector(".navbar__links [href='/selenium-training?q=headers']");
    private By tutorialButton = By.cssSelector(".navbar__tutorial-menu");
    private By tutorialModal = By.className("overlay");

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
    public void tutorialModalVisibility(){
        driver.findElement(tutorialButton).click();
        ExpectedConditions.visibilityOf(driver.findElement(tutorialModal));
    }
    private void clickLink(By element){
        driver.findElement(seleniumTrainingPage).click();
    }
}
