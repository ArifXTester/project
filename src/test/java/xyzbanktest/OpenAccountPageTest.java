package xyzbanktest;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import pages.xyzbank.OpenAccountPage;


public class OpenAccountPageTest extends CommonAPI {
    Logger LOG = LogManager.getLogger(OpenAccountPageTest.class.getName());

    OpenAccountPage openAccountPage = new OpenAccountPage(getDriver());

    @Test
    public void BankManagerLogin() {
        openAccountPage.BankManagerLogin();
    }
    public void OpenAccount(){
        openAccountPage.OpenAcct();
    }
    @Test
    public void selectCustomerName() throws InterruptedException{
        selectDropdownOptionNPOM("//select[@id='userSelect']","Jimmy");
    }
    public void selectCurrency()throws InterruptedException{
        selectDropdownOptionNPOM("//select[@id='currency']","Dollar");
    }
    public void clickSubmit(){
        openAccountPage.clickSubmit();
    }

}
