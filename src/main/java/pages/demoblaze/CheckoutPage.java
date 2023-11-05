package pages.demoblaze;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.LoginPage;
import utility.Utility;

public class CheckoutPage extends CommonAPI {
    Logger LOG = LogManager.getLogger(LoginPage.class.getName());

    public CheckoutPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(partialLinkText = "Samsung galaxy s6")
    WebElement Samsung;

    @FindBy(partialLinkText = "Nokia lumia 1520")
    WebElement Nokia;

    @FindBy(partialLinkText = "Add to cart")
    WebElement addCart;

    @FindBy(partialLinkText = "Home")
    WebElement Home;

    @FindBy(partialLinkText = "Cart")
    WebElement Cart;

    @FindBy(partialLinkText = "Place Order")
    WebElement PlaceOrder;

    @FindBy(id = "name")
    WebElement Name;

    @FindBy(id = "country")
    WebElement Country;

    @FindBy(id = "city")
    WebElement City;

    @FindBy(id = "card")
    WebElement Card;

    @FindBy(id = "month")
    WebElement Month;

    @FindBy(id = "year")
    WebElement Year;

    @FindBy(partialLinkText = "Purchase")
    WebElement Btn;

    @FindBy(partialLinkText = "Thank you for your purchase!")
    WebElement PurchaseConfirmation;

    public void SamsungPhone(){
        Samsung.click();
        LOG.info("Clicked on Samsung Phone Product Success");
    }
    public void NokiaPhone(){
        Nokia.click();
        LOG.info("Click on Nokia Phone product success");
    }
    public void addToCart(){
        addCart.click();
    }
    public void confirmOK(){
        driver.switchTo().alert().accept();
    }
    public void goHome(){
    Home.click();
    }
    public void clickCart(){
        Cart.click();
        LOG.info("Clicked on shopping Cart success");
    }
    public void PlaceOrderClick(){
        PlaceOrder.click();
        LOG.info("Clicked on Place Order");
    }
    public void sendDetails()
    {
        Utility.sendKeys(driver, Name, prop.getProperty("demouser" +" " + "demopass"));
        Utility.sendKeys(driver, Country, "USA");
        Utility.sendKeys(driver, City, "San Francisco");
        Utility.sendKeys(driver, Card, "123456789012");
        Utility.sendKeys(driver, Month, "June");
        Utility.sendKeys(driver, Year, "2099");
    }
//    public void FormName(String name) {
//        driver.switchTo().alert().getClass();
//        type(Name, name);
//        LOG.info("Entered form username");
//    }
//    public void FormCountry(String country){
//        type(Country, country);
//        LOG.info("Entered form Country");
//    }
//    public void FormCity(String city){
//        type(City, city);
//        LOG.info("Typed name of City on Form");
//    }
//    public void FormCC(String card){
//        type(Card, card);
//        LOG.info("Typed credit card on form success");
//    }
//    public void FormMonth(String month){
//        type(Month, month);
//        LOG.info("Typed month on form success");
//    }
//    public void FormYear(String year){
//        type(Year, year);
//        LOG.info("Typed year on form success");
//    }
    public void SubmitBtn(){
        Btn.click();
        LOG.info("Submit button clicked");
    }
    public String getSuccessMsg()
    {
        String msg = driver.findElement(By.xpath("//h2[text()='Thank you for your purchase!']")).getText();

        return msg;

    }

}
