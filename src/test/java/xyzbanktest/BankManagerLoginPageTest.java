package xyzbanktest;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import pages.xyzbank.BankManagerLoginPage;

public class BankManagerLoginPageTest extends CommonAPI {
    BankManagerLoginPage bankManagerLoginPage = new BankManagerLoginPage(getDriver());
    Logger LOG = LogManager.getLogger(BankManagerLoginPageTest.class.getName());
    String firstname = prop.getProperty("xyzFirst");
    String lastname = prop.getProperty("xyzLast");
    String post = prop.getProperty("xyzZip");


    @Test
    public void BankManagerLogin() {
        bankManagerLoginPage.BankManagerLogin();
    }
    public void addCustomerBtn(){
        bankManagerLoginPage.addCustomerBtn();
    }
    public void enterUserName(){
        bankManagerLoginPage.enterUserName(firstname);
    }
    public void enterLastName(){
        bankManagerLoginPage.enterLastName(lastname);
    }
    public void enterPostCode(){
        bankManagerLoginPage.enterPostCode(post);
    }
    public void clickSubmitBtn(){
        bankManagerLoginPage.clickSubmitBtn();
    }


}


