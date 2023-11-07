package demoblazetest;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import pages.demoblaze.SignUpPage;
public class InvalidPasswordTest extends CommonAPI {
    Logger LOG = LogManager.getLogger(InvalidPasswordTest.class.getName());
    String name = prop.getProperty("demouser");
    String password = " ";
    @Test
    public void loginWithInvalidCredentials() {
        SignUpPage signUpPage = new SignUpPage(getDriver());

        //Click on Signup Button from Home Page
        signUpPage.ClickSignInBtn();

        //Enter username and password
        signUpPage.typeUsername(name);
        signUpPage.typePassword(password);
        // Click the signup button
        signUpPage.clickOnSignupBtn();
    }
}
