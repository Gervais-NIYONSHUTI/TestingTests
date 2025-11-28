package demoSite;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FormTests extends BaseTests {
    @Test
    public void submitForm(){
        var formPage = homePage.clickDemoSitePage();
        var practiceForm = formPage.clickFormPage();
        practiceForm.clickPracticeFormPage();
        practiceForm.setFirstName("Gervais");
        practiceForm.setLastName("NIYONSHUTI");
        practiceForm.setEmail("qwrty@gmail.com");
        practiceForm.setGender(1);
        practiceForm.setMobileNumber("1234567890");
        practiceForm.setDateOfBirth("04 Nov 2005");
        practiceForm.setSubject("Maths");
        practiceForm.setHobbies(3);
        practiceForm.setHobbies(1);
        practiceForm.setPicture("D:\\cogito ergo sum\\software testing\\webdriver\\TestingTests\\resources\\images\\123.png");
        practiceForm.setCurrentAdress("Kigali, Rwanda");
        practiceForm.setState("NCR");
        practiceForm.setCity("Delhi");
        practiceForm.clickSubmitButton();
    }

}
