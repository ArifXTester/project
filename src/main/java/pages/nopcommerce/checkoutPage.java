package pages.nopcommerce;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkoutPage extends CommonAPI {
    Logger LOG = LogManager.getLogger(checkoutPage.class.getName());
    public checkoutPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(linkText = "Login")
    WebElement LogInBtn;
    @FindBy (id = "Email")
    WebElement EmailField;
    @FindBy(id = "Password")
    WebElement PasswordField;
    @FindBy(css = "button.button-1.login-button")
    WebElement LoginBtn;

    @FindBy(partialLinkText = "HTC One M8")
    WebElement SelectPhone;

    @FindBy(id = "add-to-cart-button-18")
    WebElement AddToCart;

    @FindBy(partialLinkText = "Shopping cart")
    WebElement ClickCart;

    @FindBy(id = "termsofservice")
    WebElement CheckBox;

    @FindBy(id = "checkout")
    WebElement ClickCheckout;

    @FindBy(id = "BillingNewAddress_City")
    WebElement EnterCity;

    @FindBy(id = "BillingNewAddress_Address1")
    WebElement EnterAddress;

    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    WebElement EnterZip;

    @FindBy(id = "BillingNewAddress_PhoneNumber")
    WebElement EnterPhone;

    @FindBy(partialLinkText = "Continue")
    WebElement ClickContinue;

    @FindBy(partialLinkText = "Continue")
    WebElement ClickContinue2;

    @FindBy(partialLinkText = "Continue")
    WebElement ClickContinue3;
    @FindBy(partialLinkText = "Continue")
    WebElement ClickContinue4;

    @FindBy(partialLinkText = "Confirm")
    WebElement ClickConfirm;

    public void ClickLogIn(){
        LogInBtn.click();
    }
    public void SelectEmail(String emailField){
        type(EmailField, emailField);
    }
    public void SelectPassword(String passwordField){
        type(PasswordField, passwordField);
    }
    public void EnterLogin(){
        LoginBtn.click();
    }

    public void SelectPhone(){
        SelectPhone.click();
    }
public void addPhoneCart(){
    AddToCart.click();
}
public void CartClick(){
    ClickCart.click();
}

public void BoxCheck(){
        CheckBox.click();
}
public void CheckOutClick(){
    ClickCheckout.click();
}
public void SelectCountry(){
        selectDropdownOptionNPOM("//select[@id='BillingNewAddress_CountryId']","United States");
}
public void SelectState(){
        selectDropdownOptionNPOM("//select[@id='BillingNewAddress_StateProvinceId']","Alabama");
}
public void CityEnter(String city){
        type(EnterCity, city);
}
public void AddressEnter(String address){
        type(EnterAddress, address);
}
public void ZipEnter(String Zip){
        type(EnterZip,Zip);
        }
        public void PhoneEnter(String phone){
        type(EnterPhone,phone);
        }
        public void ContinueClick(){
        ClickContinue.click();
        }
        public void ContinueClick2(){
        ClickContinue2.click();
        }
    public void ContinueClick3(){
        ClickContinue3.click();
    }
    public void ContinueClick4(){
        ClickContinue3.click();
    }
public void ConfirmClick(){
    ClickConfirm.click();
}

}
