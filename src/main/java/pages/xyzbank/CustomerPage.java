package pages.xyzbank;
import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
    public class CustomerPage extends CommonAPI {
        public CustomerPage(WebDriver driver) {
            PageFactory.initElements(driver, this);
        }
        @FindBy(linkText = "Bank Manager Login")
        WebElement bankLgnButton;

        @FindBy(partialLinkText = "btnClass3")
        WebElement CustomerButton;
        @FindBy(partialLinkText = "Delete")
        WebElement DeleteBtn;

        public void BankManagerLogin() {
            bankLgnButton.click();
        }

        public void CustButton() {
            CustomerButton.click();
        }
        public void DeleteButton() {
            DeleteBtn.click();
        }
    }