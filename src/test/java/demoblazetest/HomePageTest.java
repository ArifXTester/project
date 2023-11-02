package demoblazetest;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.CommonAPI;
import pages.demoblaze.HomePage;
import pages.demoblaze.SignUpPage;


public class HomePageTest extends CommonAPI {

HomePage homePage;

    @BeforeMethod
    public void set()
    {
        homePage = new HomePage();
        logger.info("Verifying HomePage");
    }
    @Test
    public void verifyTitle() {
        {
            try
            {
                Assert.assertEquals(homePage.validateHomePageTitle(), "STORE");
                logger.info("Title is correct");
            }
            catch(Exception e)
            {
                logger.info("Title is incorrect");
            }
        }
    }
    @Test
    public void verifyLogo()
    {
        logger.warn("Validating Logo of DemoBlaze");
        Assert.assertTrue(homePage.isLogoDisplayed());
    }



}
