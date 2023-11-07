package pages.magento;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage extends CommonAPI {
    Logger LOG = (Logger) LogManager.getLogger(AccountPage.class.getName());
    public AccountPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy (partialLinkText = "Create an Account")
    WebElement CreateActBtn;

    @FindBy (css="input[name='firstname']")
    WebElement firstname;

    @FindBy (css = "input[name='lastname']")
     WebElement lastname;

    @FindBy (css = "input[name='email']")
    WebElement email;

    @FindBy (css="input[id='password']")
    WebElement password;

    @FindBy (css="input[id='password-confirmation']")
    WebElement passwordConf;

    @FindBy (css="button[title='Create an Account']")
    WebElement Submitbtn;

    public void CreateAnAccount(){
        CreateActBtn.click();
        LOG.info("Create Account Button Found");
    }
    public void typeFirstName(String firstNameField){
        type(firstname,firstNameField);
        LOG.info("type first name success");

    }

    public void typeLastName(String lastNameField){
        type(lastname,lastNameField);
        LOG.info("type last name success");
    }

    public void typeEmail (String EmailField){
        type(email,EmailField);
        LOG.info("Email input successfully");
    }

    public void typePassword (String PasswordField){
        type(password,PasswordField);
        LOG.info("Password enterd successfully");
    }

    public void confirmPassword (String Confirmpass){
        type(passwordConf,Confirmpass);
        LOG.info("Password confirmed Successfully");
    }

    public void SubmitButton(){
        Submitbtn.click();
        LOG.info("Submit button Clicked");
    }


}
