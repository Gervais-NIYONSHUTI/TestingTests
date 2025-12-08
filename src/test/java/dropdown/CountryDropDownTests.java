package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class CountryDropDownTests extends BaseTests {
    @Test
    public void testCountryDropDown() {
        var seleniumTrainingPage = homePage.clickSeleniumTrainingPage();
        String country = "Rwanda";
        seleniumTrainingPage.selectCountry(country);
        var selectedCountries = seleniumTrainingPage.getSelectedCountries();
        assertTrue(selectedCountries.contains(country), "The option selected not included");
    }
}
