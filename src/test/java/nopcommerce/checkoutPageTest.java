package nopcommerce;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.demoblaze.CheckoutPage;
import pages.nopcommerce.checkoutPage;

public class checkoutPageTest extends CommonAPI {
    Logger LOG = LogManager.getLogger(checkoutPageTest.class.getName());
    checkoutPage CheckoutPage = new checkoutPage(getDriver());

    String email = prop.getProperty("nopEmail");
    String password = prop.getProperty("nopPW");
    String city = prop.getProperty("nopCity");
    String address = prop.getProperty("nopAddress");
    String zip = prop.getProperty("nopZip");
    String phone = prop.getProperty("nopPhone");


    @Test

    public void loginFirst(){
        CheckoutPage.ClickLogIn();
        CheckoutPage.SelectEmail(email);
        CheckoutPage.SelectPassword(password);
        CheckoutPage.EnterLogin();
    }
    @Test
    public void SelectProduct(){
        CheckoutPage.SelectPhone();
        CheckoutPage.addPhoneCart();
        CheckoutPage.CartClick();
        CheckoutPage.BoxCheck();
        CheckoutPage.CheckOutClick();
    }
    @Test
    public void CheckoutPage(){
        CheckoutPage.SelectCountry();
        CheckoutPage.SelectState();
        CheckoutPage.CityEnter(city);
        CheckoutPage.AddressEnter(address);
        CheckoutPage.ZipEnter(zip);
        CheckoutPage.PhoneEnter(phone);
        CheckoutPage.ContinueClick();
        CheckoutPage.ContinueClick2();
        CheckoutPage.ContinueClick3();
        CheckoutPage.ContinueClick4();
        CheckoutPage.ConfirmClick();
    }


}
