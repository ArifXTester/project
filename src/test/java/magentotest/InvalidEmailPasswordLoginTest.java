package magentotest;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.testng.annotations.Test;
import pages.magento.LoginPage;

public class InvalidEmailPasswordLoginTest extends CommonAPI {
    Logger LOG = (Logger) LogManager.getLogger(InvalidEmailPasswordLoginTest.class.getName());

    String email = prop.getProperty("test593@gmail.com");
    String password = prop.getProperty("NoPassword");

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
