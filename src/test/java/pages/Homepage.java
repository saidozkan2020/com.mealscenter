package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Homepage {

    public Homepage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    //HomePage/Sign in buttonElement
    @FindBy(linkText = "Sign in")
    public WebElement signInButtonElement;

    //HomePage>Sign In/Username
    @FindBy(xpath = "//input[@id='username']")
    public WebElement usernameCheckbox;

    //HomePage>Sign In/Password
    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordCheckbox;

    //HomePage>Sign In/Sign in
    @FindBy(xpath = "(//*[text()='Sign in'])[2]")
    public WebElement signInButton2;

   // Homepage/cookies
    @FindBy(className = "Decline")
    public WebElement cookiesElement;

    //HomePage>Sign in>Sign in/join us
    @FindBy(xpath = "//*[text()='Join']")
    public WebElement joinUsLink;

    //Homepage>sign in>sign in>join us/Become Restaurant partner
    @FindBy(xpath = "//*[text()='Become Restaurant partner']")
    public WebElement becomeRestauranPartnerText;


//--------------Ayten Hanım---------------------------------------------------------------------//
//HomePage>sign in>My account/dropdownMenu
@FindBy(id = "dropdownMenuLink")
public WebElement dropdownMenuLink;

    //HomePage>sign in>My account>dropdownMenu/my Orders link
    @FindBy(xpath = "//*[@class='dropdown-item with-icon-orders']")
    public WebElement myOrdersLink;

    //HomePage>sign in>My account>dropdownMenu>my Orders link/order now text
    @FindBy(xpath = "//*[@class='btn btn-green']")
    public WebElement orderNowButton;


    //HomePage>sign in>My account>dropdownMenu/adresses link
    @FindBy(xpath = "//*[@class='dropdown-item with-icon-addresses']")
    public WebElement adressesLink;


    //HomePage>sign in>My account>dropdownMenu/payments Options link
    @FindBy(xpath = "//*[@class='dropdown-item with-icon-payments']")
    public WebElement paymentsOptionsLink;

    //HomePage>sign in>My account>dropdownMenu/saved stores link
    @FindBy(xpath = "//*[@class='dropdown-item with-icon-savedstore']")
    public WebElement savedStoresLink;

    //HomePage>sign in>My account>dropdownMenu/Logout link
    @FindBy(xpath = "//*[@class='dropdown-item with-icon-logout']")
    public WebElement logOutLink;

    //HomePage>sign in>My account>dropdownMenu>adresses/add new adress
    @FindBy(xpath = "(//*[@class='btn btn-green'])[1]")
    public WebElement addNewAdressButton;

    //HomePage>sign in>My account>dropdownMenu>adresses>add new adress/change adress
    @FindBy(xpath = "//*[text()='Change address']")
    public WebElement changeAdressText;

    //HomePage>sign in>My account>dropdownMenu>adresses>add new adress>change adress/Enter delivery address
    @FindBy(xpath = "//input[@placeholder='Enter delivery address']")
    public WebElement enterDeliveryAddressbutton;


    //HomePage>sign in>My account>dropdownMenu>adresses>add new adress>change adress>Enter delivery address/United States Holocaust Memorial Museum
    @FindBy(xpath = "//*[*='United States Holocaust Memorial Museum']")
    public WebElement unitedStatesHolocaustMemorialMuseumtext;

    //HomePage>sign in>My account>dropdownMenu>adresses>add new adress>change adress>Enter delivery address>United States Holocaust/Delivery options
    @FindBy(xpath = "//*[@class='form-control custom-select']")
    public WebElement deliveryOptionsDropdown;

    //HomePage>sign in>My account>dropdownMenu>adresses>add new adress>change adress>Enter delivery address/save button
    @FindBy(xpath = "//span[text()='Save']")
    public WebElement saveButton;


    //HomePage>sign in>My account>dropdownMenu>adresses>add new adress>change adress>Enter delivery address>save/home adress information
    @FindBy(xpath = "//*[@class='module truncate-overflow']")
    public WebElement adressInformation;

    //HomePage>sign in>My account>dropdownMenu>adresses>add new adress>change adress>Enter delivery address>save/edit
    @FindBy(xpath = "(//*[@class='btn normal small'])[1]")
    public WebElement editbutton;

    //HomePage>sign in>My account>dropdownMenu>adresses>add new adress>change adress>Enter delivery address>save/delete
    @FindBy(xpath = "(//*[text()='Delete'])[1]")
    public WebElement deleteButton;

    //HomePage>sign in>My account>dropdownMenu>adresses>add new adress>change adress>Enter delivery address>save>delete/yes
    @FindBy(xpath = "//button[text()='Yes']")
    public WebElement yesButton;


    //HomePage>sign in>My account>dropdownMenu>adresses>add new adress>change adress>Enter delivery address>save>delete/Are you sure you want to continue?
    @FindBy(xpath = "//*[text()='Are you sure you want to continue?']")
    public WebElement areYouSureYouWantToContinueText;


    //HomePage>My account>dropdownMenu>Payments Options/add new payments
    @FindBy(xpath = "(//*[text()='Add new payment'])[1]")
    public WebElement addNewPaymentText;


    //HomePage>My account>dropdownMenu>Payments Options>add new payments/cash on delivery
    @FindBy(xpath = "(//*[@class='card p-3 fixed-height card-listing'])[2]")
    public WebElement cashOnDeliveryText;

    //HomePage>My account>dropdownMenu>Payments Options>add new payments/cash on delivery button
    @FindBy(xpath = "//span[text()='Cash On delivery']")
    public WebElement cashOnDeliveryButton;

    //HomePage>My account>dropdownMenu>Payments Options>add new payments>cash on delivery button/add cash button
    @FindBy(xpath = "//span[text()='Add Cash']")
    public WebElement addCashButton;


    //HomePage>My account>dropdownMenu>Payments Options>add new payments>cash on delivery button/cross element
    @FindBy(xpath = "(//*[@class='zmdi zmdi-close font20'])[1]")
    public WebElement crossElement;

    //HomePage>My account>dropdownMenu>Payments Options>add new payments>cash on delivery button>cross element/close payment
    @FindBy(xpath = "(//*[@class='btn btn-green'])[1]")
    public WebElement closePaymentButton;

    //HomePage>My account>dropdownMenu>saved stores/order now
    @FindBy(xpath = "(//*[@class='btn btn-green'])[1]")
    public WebElement orderNowlink;





//MURAT
    // Homepage panel> sign  in button
    @FindBy(xpath = "//li[@class='d-none d-lg-inline line-left']")
    public WebElement signInButton;


    // Homepage panel> sign in > eMail button
    @FindBy(xpath = "(//input[@class='form-control form-control-text'])[1]")
    public WebElement eMailButton;

    // Homepage panel> sign in confirm
    @FindBy(xpath = "//button[@class='btn btn-green w-100']")
    public WebElement signInButtonConfirm;

    // Homepage panel > search button
    @FindBy(xpath = "(//div[@class='position-relative search-geocomplete'])[1]")
    public WebElement searchButton;

    // Homepage panel > search button >
    @FindBy(xpath = "(//h6[@class='m-0'])[1]")
    public WebElement newOrleansButton;

    // Homepage panel > search button > cookies button
    @FindBy(xpath = "//button[@class='el-button el-button--default is-round w-100']")
    public WebElement cookiesButton;

    // Homepage panel > search button > eleven button
    @FindBy(xpath = "(//div[@class='el-image'])[1]")
    public WebElement elevenButton;

    // Homepage panel > search button > eleven button > redbul
    @FindBy(xpath = "(//div[@class='position-relative quantity-wrapper'])[2]")
    public WebElement redBullButton;

    // Homepage panel > search button > kosher restaurant
    @FindBy(xpath = "(//div[@class='el-image'])[4]")
    public WebElement kosherRestaurantButton;

    // Homepage panel > search button > Starbucks Caffe
    @FindBy(xpath = "(//div[@class='el-image'])[7]")
    public WebElement starbucksButton;

    // Homepage panel > search button > Starbucks Caffe > Caffe Mistro
    @FindBy(xpath = "(//div[@class='position-relative quantity-wrapper'])[1]")
    public WebElement caffeMistroButton;

    // Homepage panel > search button > Burger King
    @FindBy(xpath = "(//div[@class='el-image'])[10]")
    public WebElement burgerKingButton;


    // Homepage panel > search button > Burger King > Whopper Menu
    @FindBy(xpath = "(//div[@class='position-relative quantity-wrapper'])[3]")
    public WebElement whopperMenuButton;

    // Homepage panel > search button > Burger King > checkout button
    @FindBy(xpath = "(//div[@class='flex-col'])[8]")
    public  WebElement checkoutButton;

    // Homepage panel > American button
    @FindBy(xpath = "(//div[@class='col cuisineMainPage'])[1]")
    public  WebElement americanButton;


    // Homepage panel > American button > McDonalds Button
    @FindBy(xpath = "(//div[@class='el-image'])[3]")
    public  WebElement mcDonaldsButton;


    // Homepage panel > Mexican
    @FindBy(xpath = "(//div[@class='col cuisineMainPage'])[5]")
    public  WebElement mexicanButton;

    // Homepage panel > Japanise
    @FindBy(xpath = "(//div[@class='col cuisineMainPage'])[7]")
    public  WebElement japaniseButton;

    // Homepage panel > Japanise > Brolar Kebap
    @FindBy(xpath = "//div[@class='layer-grey']")
    public  WebElement brolarKebapButton;

    // Homepage panel > Thai
    @FindBy(xpath = "(//div[@class='col cuisineMainPage'])[8]")
    public  WebElement thaiButton;

    // Homepage panel > Thai > Street Cafe
    @FindBy(xpath = "//div[@class='el-image']")
    public  WebElement streetCafeButton;

    // Homepage panel > More
    @FindBy(xpath = "//a[@id='dropdownCuisine']")
    public  WebElement moreButton;

    // Homepage panel > Chinese
    @FindBy(xpath = "(//a[@class='p-2 pl-2 d-block'])[1]")
    public  WebElement chineseButton;

    // Homepage panel > Chinese > Sichunese
    @FindBy(xpath = "//img[@class='el-image__inner']")
    public WebElement sichuaneseButton;

    // Homepage panel > Chinese > Sichunese > Vegan Season
    @FindBy(xpath = "(//h5[@class='m-0 text-truncate'])[10]")
    public WebElement veganSeasonButton;

    // Homepage panel > Chinese > Sichunese > Vegan Season > Veg Semosa
    @FindBy(xpath = "(//div[@class='position-relative quantity-wrapper'])[2]")
    public WebElement vegSamosaAddButton;

    // Homepage panel > Chinese > Sichunese > Vegan Season > Veg Semosa > New Order
    @FindBy(xpath = "(//div[@class='modal-footer justify-content-start'])[9]")
    public WebElement newOrderButton;

    // Homepage panel > Chinese > Sichunese > Vegan Season > Veg Semosa > New Order > Checkout
    @FindBy(xpath = "//a[@class='btn btn-green w-100 pointer d-flex justify-content-between']")
    public WebElement checkOutButton;

    // Homepage panel > Chinese > Sichunese > Vegan Season > Veg Semosa > New Order > Checkout > Stripe
    @FindBy(xpath = "(//span[@class='mr-1'])[3]")
    public WebElement stripeButton;

    // Homepage panel > Chinese > Sichunese > Vegan Season > Veg Semosa > New Order > Checkout > Stripe > Cart
    @FindBy(xpath = "//div[@class='CardField-input-wrapper']")
    public WebElement cartNoButton;

    // Homepage panel > Chinese > Sichunese > Vegan Season > Veg Semosa > New Order > Checkout > Stripe > Cart > Stripe add
    @FindBy(xpath = "(//span[@class='label'])[11]")
    public WebElement addStripeButton;

    // Homepage panel > Chinese > Sichunese > Vegan Season > Veg Semosa
    // > New Order > Checkout > Stripe > Cart > Stripe add > Place Order
    @FindBy(xpath = "//button[@class='btn btn-green w-100 pointer']")
    public WebElement placeOrderButton;

    // Homepage panel > Name
    @FindBy(xpath = "//li[@class='d-none d-lg-inline']")
    public WebElement nameButton;

    // Homepage panel > Name > Manege My Account
    @FindBy(xpath = "//a[@class='dropdown-item with-icon-account']")
    public WebElement manageMyAccountButton;

    // Homepage panel > Name > My Order
    @FindBy(xpath = "//a[@class='dropdown-item with-icon-orders']")
    public WebElement myOrdersButton;

    // Homepage panel > Name > My Order > Change Password
    @FindBy(xpath = "//li[@class='user-change-password']")
    public WebElement changePasswordButton;

    // Homepage panel > Name > My Order > Change Password
    @FindBy(xpath = "(//label[@class='required'])[1]")
    public WebElement oldPasswordButton;

    // Homepage panel > Name > My Order > Change Password > Submit
    @FindBy(xpath = "//button[@class='mt-3 btn btn-green w-100']")
    public WebElement changePasswordSubmitButton;

    // Homepage panel > Name > Adress
    @FindBy(xpath = "//a[@class='dropdown-item with-icon-addresses']")
    public WebElement adressButton;


    @FindBy(xpath = "(//a[@class='btn normal small'])[2]")
    public WebElement adressDeleteButton;

    // Homepage panel > Name > Adress > Adress Delete > Confirm
    @FindBy(xpath = "//button[@class='btn btn-green small pl-4 pr-4 bootbox-accept']")
    public WebElement adressDeleteConfirmButton;

    // Homepage panel > Name > Payments Options
    @FindBy(xpath = "//a[@class='dropdown-item with-icon-payments']")
    public WebElement paymentsOptionsButton;

    // Homepage panel > Name > Payments Options > Delete
    @FindBy(xpath = "(//a[@class='btn normal small'])[2]")
    public WebElement paymentDeleteButton;

    // Homepage panel > Name > Logout
    @FindBy(xpath = "//a[@class='dropdown-item with-icon-logout']")
    public WebElement logoutButton;



    //============================= Harun's Locaters ===================
@FindBy(xpath = "//*[text()='Sign in']")
public WebElement anaEkranSignInButonu;

    //Cookies i kabul et
    @FindBy(xpath = "//*[text()='Accept']")
    public WebElement AcceptKabulButonu;

    //MealsCenter>Sign in ekranindaki Email kutusu
    @FindBy(xpath = "//input[@id='username']")
    public WebElement EmailorTelefonButonu;

    //Mealscenter>Sign in ekranindaki Sign Up butonu
    @FindBy (xpath = "//*[text()='Sign Up']")
    public WebElement SignUpButonu;

    //MealsCenter>Sign Up Kutularindaki ilkKutu(isim)
    @FindBy (xpath = "//input[@id=\"firstname\"]")
    public WebElement FristnameKutusu;

    //MealsCenter/Anasayfanin/contact Us Butonu
    @FindBy(xpath = "//*[text()='Contact us']")
    public WebElement ContactUs;

    @FindBy (xpath = "//h2[@class='text-center mb-3']")
    public WebElement hungryyazisi;

    //MealsCenter>Contact Us yazisi
    @FindBy (xpath = "//*[text()='Contact Us']")
    public WebElement ContactUSGorundu;

    //MealsCenter/TermsundConditionsButonu
    @FindBy (xpath = "//*[text()='Terms and conditions']")
    public WebElement TermsundConditions;

    //TermsundconditionsYazisi
    @FindBy (xpath = "(//*[text()='Terms and conditions'])[1]")
    public WebElement TermsundConditionsgoruldu;

    //MealsCenter/PrivacyPolicyButonu
    @FindBy(xpath = "//*[text()='Privacy policy']")
    public WebElement Privacy_Policiy;

    //MealsCenter>PrivacyPolicyYazisi
    @FindBy(xpath = "(//*[text()='Privacy policy'])[1]")
    public WebElement PrivacyPolicyGorundu;


}
