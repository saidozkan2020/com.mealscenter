package tests._01_Miyase.US_002;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Homepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_07 {
    /**
     * Open your browser to access the website
     * -Enter the URL "https://qa.mealscenter.com" into your browser's address bar
     * -Navigate to the website
     * -Verify that the search bar is working
     * -Close the page
     */
    Homepage homepage = new Homepage();

    @Test
    public void testMealCenterVerfiySearchIsWorking() {
        Driver.getDriver().get(ConfigReader.getProperty("homePageUrl"));
        homepage.homePageCookiesDecline.click();
        homepage.homePageHeaderSearchBox.click();
        homepage.homePageHeaderSearchBox.sendKeys("stuttgart");
        Assert.assertTrue(homepage.homePageSearchResults.isDisplayed());
        homepage.homePageSearchResultsFirstResult.click();
        ReusableMethods.wait(3);
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), "https://qa.mealscenter.com/restaurants");
        Driver.getDriver().quit();
    }

}

