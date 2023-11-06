package pages.xyzbank;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OpenAccountPage extends CommonAPI {
    Logger LOG = LogManager.getLogger(OpenAccountPage.class.getName());
    public OpenAccountPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Bank Manager Login")
    static WebElement bankLgnButton;
    @FindBy(id = "notch")
    WebElement openAccount;

    Select CustomerName = new Select(driver.findElement(By.linkText(prop.getProperty("xyzFirst"))));
    Select Currency = new Select(driver.findElement(By.linkText("Dollar")));

    @FindBy(linkText = "Process")
    WebElement submitBtn;


    public void BankManagerLogin() {
        bankLgnButton.click();
    }
    public void OpenAcct(){
        openAccount.click();
    }
    public void clickSubmit(){
        submitBtn.click();
    }

}
