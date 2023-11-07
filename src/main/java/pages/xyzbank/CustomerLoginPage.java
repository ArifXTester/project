package pages.xyzbank;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerLoginPage extends CommonAPI{
    public CustomerLoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(partialLinkText = "Customer Login")
    WebElement CustomerLoginBtn;

    @FindBy(partialLinkText = "Login")
    WebElement LoginBtn;

    public void CustomerLoginButton(){
        CustomerLoginBtn.click();
    }
    public void LoginBtnClick(){
        LoginBtn.click();
    }


}