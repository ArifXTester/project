package demoblazetest;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import pages.demoblaze.CheckoutPage;

public class AddProductTest extends CommonAPI {
    Logger LOG = LogManager.getLogger(AddProductTest.class.getName());
    CheckoutPage checkoutPage = new CheckoutPage(getDriver());
    @Test
    public void addProduct(){
        checkoutPage.SamsungPhone();
        checkoutPage.addToCart();
        checkoutPage.confirmOK();

    }
}
