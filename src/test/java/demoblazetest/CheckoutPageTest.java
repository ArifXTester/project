package demoblazetest;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.demoblaze.CheckoutPage;
import saucedemotest.ValidLoginTest;

import java.time.Duration;


public class CheckoutPageTest extends CommonAPI {

    Logger LOG = LogManager.getLogger(CheckoutPageTest.class.getName());
    String username = prop.getProperty("demouser");
    String password = prop.getProperty("demopass");


    @Test
    public void addToCart(){
        CheckoutPage checkoutPage = new CheckoutPage(getDriver());

        checkoutPage.SamsungPhone();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
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
    public void EnterPaymentInfo(){
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        CheckoutPage checkoutPage = new CheckoutPage(getDriver());
        checkoutPage.sendDetails();
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
