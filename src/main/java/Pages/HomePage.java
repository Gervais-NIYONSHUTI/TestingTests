package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage {
    private WebDriver driver;
    private By seleniumTrainingPage = By.cssSelector(".navbar__links [href='/selenium-training?q=headers']");
    private By tutorialButton = By.cssSelector(".navbar__tutorial-menu");
    private By tutorialModal = By.className("overlay");
    private By links = By.cssSelector(".navbar__links li a");
    private By demoSite = By.cssSelector(".navbar__links [href='https://demoqa.com']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public SeleniumTrainingPage clickSeleniumTrainingPage() {
        clickLink(seleniumTrainingPage);
        return new SeleniumTrainingPage(driver);
    }
    public void clickableNavigationLinks(String selector){
        driver.findElement(By.cssSelector(selector)).click();
    }
    public void tutorialModalVisibility(){
        driver.findElement(tutorialButton).click();
        ExpectedConditions.visibilityOf(driver.findElement(tutorialModal));
    }
    public WebElement hoverOverLinks(int index){
        WebElement selectedLink = driver.findElements(links).get(index - 1);
        Actions actions = new Actions(driver);
        actions.moveToElement(selectedLink).perform();
        return selectedLink;
    }
    public DemoSitePage clickDemoSitePage(){
        clickLink(demoSite);
        return new DemoSitePage(driver);
    }
    private void clickLink(By element){
        driver.findElement(seleniumTrainingPage).click();
    }
}
