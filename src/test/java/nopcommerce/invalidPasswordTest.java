package nopcommerce;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import pages.nopcommerce.loginPage;

public class invalidPasswordTest extends CommonAPI {
    Logger LOG = LogManager.getLogger(invalidPasswordTest.class.getName());
    String Email = "";
    String Password = "";
    loginPage loginPage = new loginPage(getDriver());
     @Test
    public void ClickLogin(){
         loginPage.ClickLogIn();
     }
     public void fillForm(){
         loginPage.SelectEmail(Email);
         loginPage.SelectPassword(Password);
         loginPage.ClickLogIn();
     }
}
