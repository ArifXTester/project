package xyzbanktest;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import pages.xyzbank.CustomerPage;

public class CustomerPageTest extends CommonAPI {
    Logger LOG = LogManager.getLogger(CustomerPageTest.class.getName());

    CustomerPage customerPage = new CustomerPage(getDriver());

    @Test
    public void BankManagerLogin(){
        customerPage.BankManagerLogin();
    }
    @Test
    public void CustButton(){
        customerPage.CustButton();
    }
    @Test
    public void DeleteButton(){
        customerPage.DeleteButton();
    }
}