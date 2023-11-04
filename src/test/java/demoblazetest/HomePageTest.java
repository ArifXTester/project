package demoblazetest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.CommonAPI;
import pages.demoblaze.HomePage;


public class HomePageTest extends CommonAPI {
    HomePage homePage;

    @BeforeMethod
    public void set() {
        homePage = new HomePage(getDriver());
        LOG.info("Initiating HomePage Constructor");
    }

    @Test
    public void verifyTitle() {
        try {
            Assert.assertEquals(homePage.validateHomePageTitle(), "STORE");
            LOG.info("Title is correct");
        } catch (Exception e) {
            LOG.info("Title is incorrect");
        }
    }
}