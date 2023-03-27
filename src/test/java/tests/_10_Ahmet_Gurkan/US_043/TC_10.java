package tests._10_Ahmet_Gurkan.US_043;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Admin_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_10 {
    Admin_Dashboard adminDashboard=new Admin_Dashboard();
    @Test
    public void test10(){

        //"Kullanici https://qa.mealscenter.com/backoffice/reports/merchant_registration Url'ye gider
        ReusableMethods.adminLogin("gurkan.gulsoy","123456");
        //Solda bulunan Reports basligina tiklar
        adminDashboard.adminReports.click();

        //Merchant Registration sekmesine tiklar
        adminDashboard.merchantRegistration.click();

        //acilan sayfada Merchant Registration yazisi dogrulanir
        Assert.assertTrue(adminDashboard.merchantRegistrationText.isDisplayed());

        //ozet bilgileri dogrulanir
        Assert.assertFalse(ReusableMethods.getElementsText(By.xpath("//div[@class='bg-light p-3 mb-3 rounded']")).isEmpty());
        System.out.println(ReusableMethods.getElementsText(By.xpath("//div[@class='bg-light p-3 mb-3 rounded']")));
        //sayfa kapatilir
        Driver.closeDriver();
    }
}
