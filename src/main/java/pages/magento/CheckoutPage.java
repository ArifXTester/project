package pages.magento;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage extends CommonAPI {
    Logger LOG = (Logger) LogManager.getLogger(CheckoutPage.class.getName());

    public CheckoutPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(partialLinkText = "Sign In")
    WebElement signinclick;

    @FindBy(css = "input[id='email']")
    WebElement emailfield;

    @FindBy(css = "input[title='Password']")
    WebElement password;

    @FindBy(css = "button[class='action search']")
    WebElement Signinbtn;

    @FindBy(partialLinkText = "Men")
    WebElement SelectMen;

    @FindBy(partialLinkText = "Hero Hoodie")
    WebElement SelectOneProduct;

    @FindBy(id = "option-label-size-143-item-168")
    WebElement SelectSize;

    @FindBy(id = "option-label-color-93-item-49")
    WebElement SelectColor;

    @FindBy(id = "product-addtocart-button")
    WebElement AddToCart;

    @FindBy(partialLinkText = "My Cart")
    WebElement Cart1;

    @FindBy(id = "top-cart-btn-checkout")
    WebElement ClickCheckout;

    @FindBy(name = "street[0]")
    WebElement StreetField;

    @FindBy(name = "city")
    WebElement CityField;

    @FindBy(name = "telephone")
    WebElement TelephoneField;

    @FindBy(name = "ko_unique_4")
    WebElement ShipRate;

    @FindBy(partialLinkText = "Next")
    WebElement NextButton;

    @FindBy(partialLinkText = "Place Order")
    WebElement PlaceOrderButton;

    @FindBy(partialLinkText = "Thank you for your")
    WebElement ConfirmMsg;

    public void clickSignIn() {
        signinclick.click();
    }
    public void email(String EmailField) {
        type(emailfield, EmailField);
        LOG.info("Email Entered");
    }
    public void password(String PassWordField) {
        type(password, PassWordField);
        LOG.info("Password Entered");
    }

    public void SignIn() {
        Signinbtn.click();
    }

    public void MenSelect() {
        SelectMen.click();
    }

    public void SelectProduct() {
        SelectOneProduct.click();
    }

    public void SelectSizeHoodie() {
        SelectSize.click();
    }

    public void SelectBlackColor() {
        SelectColor.click();
    }

    public void CartAdd() {
        AddToCart.click();
    }

    public void oneCart() {
        Cart1.click();
    }

    public void CheckoutClick() {
        ClickCheckout.click();
    }

    public void StreetAddress(String street) {
        type(StreetField,street);
        LOG.info("type City success");
    }
    public void CityFields(String city) {
        type(CityField, city);
    }
    public void TelField(String tel){
        type(TelephoneField,tel);
    }
    public void SelectState(){
        selectDropdownOptionNPOM("select.select[name='region_id']","Nevada");
    }
    public void SelectCountry(){
        selectDropdownOptionNPOM("select.select[name='country_id']","United States");
    }

    public void rateShip(){
        ShipRate.click();
    }

    public void ButtonNext(){
        NextButton.click();
    }
    public void LastStep(){
        PlaceOrderButton.click();
    }
    public void confirm(){
        ConfirmMsg.getText();
    }
}