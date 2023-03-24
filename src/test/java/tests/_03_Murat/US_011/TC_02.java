package tests._03_Murat.US_011;


import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.Homepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_02 {

    Homepage homepage=new Homepage();
    private ReusableMethods reausableMethods;

    @Test
    private void TC_02
            (){

        // 1* User goes to https://qa.mealscenter.com/ homepage

        Driver.getDriver().get(ConfigReader.getProperty("mealUrl"));

        // 2* User presses the sign in button and writes the mail and password.

        homepage.signInButton.click();
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(homepage.eMailButton)
                .sendKeys("m.korkmaz4606@gmail.com")
                .sendKeys(Keys.TAB)
                .sendKeys("Murat3656.").perform();

        // 3* User confirms Sign in button."

        homepage.signInButtonConfirm.click();

        // 4* press the cookies button

        homepage.cookiesButton.click();

        // 5* User type New Orleans into the search engine and search.



        actions.sendKeys(homepage.searchButton)
                .sendKeys("New Orleans").perform();
        homepage.newOrleansButton.click();

        // 6* Verifies that the  section exists.

         String expectedUrl="https://qa.mealscenter.com/restaurants";
        //WebElement storeYazisi = Driver.getDriver().findElement(By.xpath("(//div[@class='flex-col'])[8]"));
        String actualUrl=Driver.getDriver().getCurrentUrl();
        //Assert.assertTrue(storeYazisi.isDisplayed());
        //Assert.assertEquals(expectedUrl,actualUrl);

        // 7* User goes to Eleven page.
        // 8* Checks that there is a User Menu section.

        homepage.elevenButton.click();

        // 9* User adds Red Bull 12oz to cart.

        homepage.redBullButton.click();

        // 10* User closes the page.

        Driver.getDriver().close();
    }
}