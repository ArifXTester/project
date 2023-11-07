package nopcommerce;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.nopcommerce.registerPage;

public class registerPageTest extends CommonAPI {
    Logger LOG = LogManager.getLogger(registerPageTest.class.getName());
    String firstName = prop.getProperty("nopFirst");
    String lastName = prop.getProperty("nopLast");
    String email = prop.getProperty("nopEmail");
    String password = prop.getProperty("nopPw");
    String ConPass = prop.getProperty("nopConPw");
    registerPage Registerpage = new registerPage(getDriver());

    @Test
    public void ClickRegister(){
        Registerpage.ClickRegister();
    }
    public void fillForm(){
        Registerpage.SelectGender();
        Registerpage.SelectFirstName("nopFirst");
        Registerpage.SelectLastName("nopLast");

        Select select = new Select(driver.findElement(By.name("DateOfBirth")));
        Select day = new Select(driver.findElement(By.name("DateOfBirthDay")));
        day.selectByVisibleText("10");

        Select month= new Select(driver.findElement(By.name("DateOfBirthMonth")));
        month.selectByVisibleText("April");

        Select year = new Select(driver.findElement(By.name("DateOfBirthYear")));
        year.selectByVisibleText("1990");

        Registerpage.SelectEmail("nopEmail");
        Registerpage.SelectPassword("nopPw");
        Registerpage.SelectPassword("nopConPw");
        Registerpage.ClickRegister();
        String confirmURL = driver.getCurrentUrl();
        Assert.assertEquals(confirmURL, "https://demo.nopcommerce.com/registerresult/1?returnUrl=/");


    }


}
