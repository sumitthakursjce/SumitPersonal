package GmailTests;

import PageActionsAndViews.gmailHomePageAction;
import PageActionsAndViews.gmailLoginAction;
import Utilities.Driver;
import com.sun.org.glassfish.gmbal.Description;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import testBase.BaseTest;

import java.util.List;

public class deleteNonImpMail extends BaseTest{


    @BeforeTest
    public void login()
    {
        super.setup();
        Driver.driver.navigate().to("https://www.gmail.com/");

        gmailLoginAction gmailLoginActions = new gmailLoginAction();
        gmailLoginActions.enterEmailORPhone();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        gmailLoginActions.clickNext();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        gmailLoginActions.enterPassword();
        gmailLoginActions.submit();

    }

    @Test
    @Description("This test will find Non important mail & will delete it")
    public void deleteMail() throws InterruptedException {
        Thread.sleep(10000);
        gmailHomePageAction gmailHomePageActions = new gmailHomePageAction();
        List<Object> mailList = gmailHomePageActions.getJsExecutor();

    }
}
