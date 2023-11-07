package magentotest;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.magento.HomePage;

public class HomePageTest extends CommonAPI {
    HomePage homePage;

    @Test
    public void getHeaderText(){
        try {
            Assert.assertEquals(homePage.validateHomePageTitle(), "Home Page");
            LOG.info("Title is correct");
        } catch (Exception e) {
            LOG.info("Title is incorrect");
        }
    }
}


