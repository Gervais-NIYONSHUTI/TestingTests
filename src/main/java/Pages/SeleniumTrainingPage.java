package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class SeleniumTrainingPage {
    private WebDriver driver;
    private By goToRegistrationButton = By.cssSelector("a[href='#enroll-form']");
    private By countryDropdown = By.id("country");

    public SeleniumTrainingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToRegistration(){
        driver.findElement(goToRegistrationButton).click();
    }
    public void selectCountry(String country){
        Select selectCountry = new Select(driver.findElement(countryDropdown));
        selectCountry.selectByVisibleText(country);
    }
    public List<String> getSelectedCountries(){
        Select selectCountries = new Select(driver.findElement(countryDropdown));
        List<WebElement> selectedCountry =  selectCountries.getAllSelectedOptions();
        return selectedCountry.stream().map(val -> val.getText()).collect(Collectors.toList());
    }
}
