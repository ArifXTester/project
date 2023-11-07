package pages.demoblaze;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.LoginPage;
import utility.Utility;

public class SignUpPage extends CommonAPI {
    Logger LOG = LogManager.getLogger(SignUpPage.class.getName());
    public SignUpPage(WebDriver driver){PageFactory.initElements(driver, this);
    }
    @FindBy(id = "signin2")
    WebElement SignBtn;
    @FindBy(id = "sign-username")
    WebElement sUsername;

    @FindBy(id = "sign-password")
    WebElement sPassword;

    @FindBy(xpath = "//button[text()='Sign up']")
    WebElement signUpBtn;

    public void ClickSignInBtn(){
        SignBtn.click();
    }
    public void typeUsername(String username){
        type(sUsername, username);
        LOG.info("type username success");
    }
    public void typePassword(String password){
        type(sPassword, password);
        LOG.info("type password success");
    }

    public void clickOnSignupBtn() {
        signUpBtn.click();
        LOG.info("click on login button success");
    }
}