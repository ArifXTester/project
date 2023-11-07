package xyzbanktest;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import pages.xyzbank.CustomerLoginPage;

public class CustomerLoginPageTest extends CommonAPI {
    Logger LOG = LogManager.getLogger(CustomerLoginPageTest.class.getName());

    CustomerLoginPage customerLoginPage = new CustomerLoginPage(getDriver());

    @Test
    public void CustomerLoginButton(){
        customerLoginPage.CustomerLoginButton();
    }
    @Test
    public void CustName() throws InterruptedException {
        selectDropdownOptionNPOM("//select[@id='userSelect']", "Jimmy");
        System.out.println("Customer Name Selected Successfully");
    }
    @Test`1
    public void LoginBtnClick(){
        customerLoginPage.LoginBtnClick();
    }
}