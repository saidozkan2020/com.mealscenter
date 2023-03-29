package tests._07_Said.US_032;

import com.github.javafaker.Faker;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

import java.awt.dnd.DragGestureEvent;

public class TC_05 extends TestBaseReport {

    //  It must be verified that information can be entered in the Size Name Box.

    @Test
    public void TC05() {
        extentTest = extentReports.createTest("US_032_TC_05", "ilgili alana gidildigi dogrulanmali");

        ReusableMethods.merchantLoginHasan();
        extentTest.info("Merchant login islemi gerceklesti ve ana sayfaya gidildi.");
        Merchant_Dashboard merchant_dashboard = new Merchant_Dashboard();

        merchant_dashboard.attributesLink.click();
        extentTest.info("Attributes sekmesinin oldugu dogrulandi.");
        merchant_dashboard.attributesSizeLink.click();
        extentTest.info("Attributes sekmesinin altinda size linki oldugu dogrulandi.");
        merchant_dashboard.addNewButton.click();
        extentTest.info("add new Button'un tiklanabilir oldugu dogrulandi.");

        merchant_dashboard.nameBox1.sendKeys(ConfigReader.getProperty("merchantSize"));
        Assert.assertTrue(merchant_dashboard.nameBox1.isEnabled());
        extentTest.info("All Size\" altindaki \"Size Name\" kutusuna bilgi girilebilir oldugunu dogrular");

        ReusableMethods.wait(2);

        Driver.closeDriver();
        extentTest.info("Sayfa kapandi");
        extentTest.pass("Basarili sekilde dogrulandi");


    }
}
