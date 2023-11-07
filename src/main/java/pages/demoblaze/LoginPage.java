package pages.demoblaze;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CommonAPI {
    Logger LOG = (Logger) LogManager.getLogger(LoginPage.class.getName());
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(id="loginusername")
    WebElement logUser;
    @FindBy(id="loginpassword")
    WebElement logPassword;

    @FindBy(xpath = "//button[text()='Log in']")
    WebElement loginButton;

    @FindBy(xpath = "//button[text()='Log in']//preceding-sibling::button")
    WebElement closeButton;

    public void typeUser(String username) {
        type(logUser, username);
        LOG.info("type username success");
    }
        public void typePassword(String password){
        type(logPassword, password);
            LOG.info("type password success");
    }
    public void clickOnLoginBtn(){
        clickOn(loginButton);
        LOG.info("click on login button success");
    }
    public void clickOnClose() {
        closeButton.click();
    }
}