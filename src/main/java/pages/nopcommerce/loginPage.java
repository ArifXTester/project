package pages.nopcommerce;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage extends CommonAPI {
    Logger LOG = LogManager.getLogger(loginPage.class.getName());
    public loginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy (linkText = "Login")
    WebElement LogInBtn;
    @FindBy (id = "Email")
    WebElement EmailField;
    @FindBy(id = "Password")
    WebElement PasswordField;

    public void ClickLogIn(){
        LogInBtn.click();
    }
    public void SelectEmail(String emailField){
        type(EmailField, emailField);
    }
    public void SelectPassword(String passwordField){
        type(PasswordField, passwordField);
    }


}
