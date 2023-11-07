package magentotest;

import base.CommonAPI;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.testng.annotations.Test;
import pages.magento.AccountPage;

public class AccountPageTest extends CommonAPI {
    Logger LOG = (Logger) LogManager.getLogger(AccountPageTest.class.getName());
    AccountPage accountPage = new AccountPage(getDriver());
    String firstName = prop.getProperty("magFirst");
    String lastName= prop.getProperty("magLast");
    String email = prop.getProperty("magEmail");
    String Password = prop.getProperty("magPassword");
    String Confirm = prop.getProperty("magConfirm");

    @Test
    public void CreateAnAccount(){
        accountPage.CreateAnAccount();
    }
    @Test
    public void TypeCredentials(){
        accountPage.typeFirstName(firstName);
        accountPage.typeLastName(lastName);
        accountPage.typeEmail(email);
        accountPage.typePassword(Password);
        accountPage.confirmPassword(Confirm);
        accountPage.SubmitButton();
    }

    }
