package pages.demoblaze;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CommonAPI {

    Logger LOG = LogManager.getLogger(pages.LoginPage.class.getName());

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "loginusername")
    WebElement loginField;

    @FindBy(id = "loginpassword")
    WebElement passwordField;

    @FindBy(partialLinkText = "Log in")
    WebElement loginBtn;

    public void typeUsername(String username) {
        type(loginField, username);
        LOG.info("type username success");
    }

    public void typePassword(String password) {
        type(passwordField, password);
        LOG.info("type password success");

        public void clickOnLoginBtn() {
            clickOn(loginBtn);
            LOG.info("click on login button success");
        }
    }
}