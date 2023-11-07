package pages.magento;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CommonAPI {
    Logger LOG = (Logger) LogManager.getLogger(LoginPage.class.getName());
    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy (partialLinkText = "Sign In")
    WebElement signinclick;

    @FindBy (css="input[id='email']")
    WebElement emailfield;

    @FindBy (css="input[title='Password']")
    WebElement password;

    @FindBy (css="button[class='action search']")
    WebElement Signinbtn;



    public void clickSignIn(){
        signinclick.click();
    }

    public void email(String EmailField){
        type(emailfield,EmailField);
        LOG.info("Email Enterd");

    }

    public void password(String PassWordField){
        type(password,PassWordField);
        LOG.info("Password Entered");
    }

    public void SignIn(){
        Signinbtn.click();
    }

}
