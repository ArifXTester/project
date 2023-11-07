package magentotest;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.testng.annotations.Test;
import pages.magento.CheckoutPage;

public class CheckoutPageTest extends CommonAPI {
    Logger LOG = (Logger) LogManager.getLogger(CheckoutPageTest.class.getName());

    CheckoutPage checkoutPage = new CheckoutPage(getDriver());

    String email = prop.getProperty("magEmail");
    String pass = prop.getProperty("magPassword");
    String street = prop.getProperty("magStreet");
    String city = prop.getProperty("magCity");
    String telephone = prop.getProperty("magPhone");

    @Test
    public void SignPage(){
        checkoutPage.clickSignIn();
        checkoutPage.email(email);
        checkoutPage.password(pass);
        checkoutPage.SignIn();
    }
    @Test
    public void Checkout(){
        checkoutPage.MenSelect();
        checkoutPage.SelectProduct();
        checkoutPage.SelectSizeHoodie();
        checkoutPage.SelectBlackColor();
        checkoutPage.CartAdd();
        checkoutPage.oneCart();
        checkoutPage.CheckoutClick();
        checkoutPage.StreetAddress(street);
        checkoutPage.CityFields(city);
        checkoutPage.TelField(telephone);
        checkoutPage.SelectState();
        checkoutPage.SelectCountry();
        checkoutPage.rateShip();
        checkoutPage.ButtonNext();
        checkoutPage.LastStep();
        checkoutPage.confirm();

    }


}
