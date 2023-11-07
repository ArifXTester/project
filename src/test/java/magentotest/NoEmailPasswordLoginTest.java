package magentotest;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.testng.annotations.Test;
import pages.magento.LoginPage;

public class NoEmailPasswordLoginTest extends CommonAPI {
    Logger LOG = (Logger) LogManager.getLogger(NoEmailPasswordLoginTest.class.getName());

    String email = "";
    String password = "";

    LoginPage loginPage = new LoginPage(getDriver());

    @Test
    public void clickSignIn(){
        loginPage.clickSignIn();
    }
    @Test
    public void LogIn(){
        loginPage.email(email);
        loginPage.password(password);
        loginPage.SignIn();
    }
}
