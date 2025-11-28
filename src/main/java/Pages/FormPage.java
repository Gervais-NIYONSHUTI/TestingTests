package Pages;

import org.openqa.selenium.*;


public class FormPage {
    private WebDriver driver;
    private By practiceFormSelector = By.cssSelector("#item-0");
    private By firstNameFieldSelector = By.id("firstName");
    private By lastNameFieldSelector = By.id("lastName");
    private By emailFieldSelector = By.id("userEmail");
    private String gender = "gender-radio-";
    private By mobileNumberFieldSelector = By.id("userNumber");
    private By dateOfBirthFieldSelector = By.id("dateOfBirthInput");
    private By subjectFieldSelector = By.id("subjectsInput");
    private String hobbies = "hobbies-checkbox-";
    private By pictureFieldSelector = By.id("uploadPicture");
    private By currentAdressFieldSelector = By.id("currentAddress");
    private By stateFieldSelector = By.id("react-select-3-input");
    private By cityFieldSelector = By.id("react-select-4-input");
    private By submitButtonSelector = By.id("submit");


    public FormPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickPracticeFormPage(){
        scroll(practiceFormSelector);
        driver.findElements(practiceFormSelector).get(1).click();
    }
    public void setFirstName(String firstName){
        scroll(firstNameFieldSelector);
        driver.findElement(firstNameFieldSelector).sendKeys(firstName);
    }
    public void setLastName(String lastName){
        scroll(lastNameFieldSelector);
        driver.findElement(lastNameFieldSelector).sendKeys(lastName);
    }
    public void setEmail(String email){
        scroll(emailFieldSelector);
        driver.findElement(emailFieldSelector).sendKeys(email);
    }
    public void setGender(int index){
        By genderFieldSelector = By.cssSelector("label[for='" + gender + index + "']");
        scroll(genderFieldSelector);
        driver.findElement(genderFieldSelector).click();
    }
    public void setMobileNumber(String mobileNumber){
        scroll(mobileNumberFieldSelector);
        driver.findElement(mobileNumberFieldSelector).sendKeys(mobileNumber);
    }
    public void setDateOfBirth(String dateOfBirth){
        scroll(dateOfBirthFieldSelector);
        driver.findElement(dateOfBirthFieldSelector).clear();
        driver.findElement(dateOfBirthFieldSelector).sendKeys(dateOfBirth);
        driver.findElement(By.id("dateOfBirthInput")).sendKeys(Keys.ESCAPE);
    }
    public void setSubject(String subject){
        scroll(subjectFieldSelector);
        driver.findElement(subjectFieldSelector).sendKeys(subject);
        driver.findElement(By.id("dateOfBirthInput")).sendKeys(Keys.ENTER);
    }
    public  void setHobbies(int index){
        By hobbiesFieldSelector = By.cssSelector("label[for='" + hobbies + index + "']");
        scroll(hobbiesFieldSelector);
        driver.findElement(hobbiesFieldSelector).click();
    }
    public void setPicture(String pictureAbsolutePath){
        scroll(pictureFieldSelector);
        driver.findElement(pictureFieldSelector).sendKeys(pictureAbsolutePath);
    }
    public void setCurrentAdress(String currentAdress){
        scroll(currentAdressFieldSelector);
        driver.findElement(currentAdressFieldSelector).sendKeys(currentAdress);
    }
    public void setState(String state){
        scroll(stateFieldSelector);
        driver.findElement(stateFieldSelector).sendKeys(state);
        driver.findElement(stateFieldSelector).sendKeys(Keys.ENTER);
    }
    public void setCity(String city){
        scroll(cityFieldSelector);
        var selectCity = driver.findElement(cityFieldSelector);
        selectCity.sendKeys(city);
        if(!selectCity.getText().isEmpty()){
            driver.findElement(stateFieldSelector).sendKeys(Keys.ENTER);
        }
    }
    public void clickSubmitButton(){
        scroll(submitButtonSelector);
        driver.findElement(submitButtonSelector).click();
    }
    private void scroll(By selector){
        WebElement element = driver.findElement(selector);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }
}
