package demoblazetest;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.demoblaze.CheckoutPage;

import java.time.Duration;

public class CheckoutPageTest extends CommonAPI {
    CheckoutPage checkoutPage = new CheckoutPage(getDriver());
    Logger LOG = LogManager.getLogger(CheckoutPageTest.class.getName());
    String username = prop.getProperty("demouser");
    String country = prop.getProperty("demoCountry");
    String city = prop.getProperty("demoCity");
    String card = prop.getProperty("demoCard");
    String month = prop.getProperty("demoMonth");
    String year = prop.getProperty("demoYear");

    @Test
    public void addToCart() {
        checkoutPage.SamsungPhone();
        checkoutPage.addToCart();
        checkoutPage.confirmOK();
        checkoutPage.goHome();
        checkoutPage.NokiaPhone();
        checkoutPage.addToCart();
        checkoutPage.confirmOK();
        checkoutPage.clickCart();
        checkoutPage.PlaceOrderClick();
    }
    @Test
            public void fillForm(){
        checkoutPage.FormName(username);
        checkoutPage.FormCountry(country);
        checkoutPage.FormCity(city);
        checkoutPage.FormCC(card);
        checkoutPage.FormMonth(month);
        checkoutPage.FormYear(year);
        checkoutPage.SubmitBtn();
    }
    @Test
    public void verifyPurchaseWithInfo(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        CheckoutPage checkoutPage = new CheckoutPage(getDriver());
        Assert.assertEquals(checkoutPage.getSuccessMsg(), "Thank you for your purchase!");
        logger.info("Verifying Purchase Page without entering any order details");
    }
}
