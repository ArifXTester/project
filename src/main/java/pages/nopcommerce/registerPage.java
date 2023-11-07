package pages.nopcommerce;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class registerPage extends CommonAPI {
    Logger LOG = LogManager.getLogger(registerPage.class.getName());
    public registerPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    @FindBy(partialLinkText = "Register")
    WebElement RegisterBtn;

    @FindBy(id = "gender-male")
    WebElement MaleBtn;

    @FindBy(id = "FirstName")
    WebElement FirstNameField;

    @FindBy (id = "LastName")
    WebElement LastNameField;

    @FindBy(id = "Email")
    WebElement EmailField;

    @FindBy(id = "password")
    WebElement PasswordField;

    @FindBy(id = "ConfirmPassword")
    WebElement ConfirmPasswordField;

    @FindBy (id = "register-button")
    WebElement RegisterButtonField;

    @FindBy(linkText = "Your registration completed")
    WebElement confirmMsg;
    public void ClickRegister(){
        RegisterBtn.click();
    }
    public void SelectGender(){
        MaleBtn.click();
    }
    public void SelectFirstName(String firstNameField){
        type(FirstNameField, firstNameField);
        LOG.info("type firstName success");
    }
    public void SelectLastName(String lastNameField){
        type(LastNameField, lastNameField);
        LOG.info("type lastName success");
    }
    public void SelectEmail(String emailField){
        type(EmailField, emailField);
        LOG.info("type email success");
    }
    public void SelectPassword(String passwordField){
        type(PasswordField, passwordField);
        LOG.info("type password success");
    }
    public void passwordField(String confirmPasswordField){
        type(ConfirmPasswordField, confirmPasswordField);
        LOG.info("confirm passwordField Success");
    }


    public void selectDay() {
        Select selectDay = new Select(driver.findElement(By.name("DateOfBirthDay")));

    }
    public void selectMonth() {
        Select selectMonth = new Select(driver.findElement(By.name("DateOfBirthMonth")));
    }
    public void selectYear() {
        Select selectYear = new Select(driver.findElement(By.name("DateOfBirthYear")));
    }


}
