package tests._08_Hasan.US_034;

import org.testng.annotations.Test;
import pages.Merchant_Dashboard;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_01 {
    /*



     */
    /*
    - The user goes to the admin panel "Merchant Url" with the browser he opened
    - User enters "username" and "password" and clicks "Sign in" link
    -User closes the page
     */



    @Test
    public void TC_01(){
        //- Kullanıcı açtığı browserla admin paneli olan "Merchant Url" ye gider
        //- Kullanıcı "username" ve "password" girişi yapıp, "Sign in" linkine tıklar
        //-Kullanıcı sayfayı kapatır
        ReusableMethods.merchantLoginHasan();
        Driver.closeDriver();



    }

}
