package pages.xyzbank;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankManagerLoginPage extends CommonAPI {

    Logger LOG = LogManager.getLogger(BankManagerLoginPage.class.getName());
    public BankManagerLoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Bank Manager Login")
    WebElement bankLgnButton;
    @FindBy(partialLinkText = "Add Customer")
    WebElement addCustomer;

    @FindBy(css = ("#fName"))
    WebElement firstName;

    @FindBy(css = "#lName")
    WebElement lastName;

    @FindBy(css = "#postCd")
    WebElement postCode;

    @FindBy(partialLinkText = "Add Customer")
    WebElement submitBtn;

    public void BankManagerLogin() {
        bankLgnButton.click();
    }
    public void addCustomerBtn(){
        addCustomer.click();
    }


    public void enterUserName(String username) {
        type(firstName, username);
        LOG.info("type first name success");
    }

    public void enterPassword(String enterLastName){
        type(lastName, enterLastName);
    }



public void enterPostCode(string zipcode) {
    type(postCode, zipcode);
}


    public void clickSubmitBtn() {
        submitBtn.click();
    }


    public void getConfirmation(String confirm) {
        confirm = driver.switchTo().alert().getText();
    }


}


