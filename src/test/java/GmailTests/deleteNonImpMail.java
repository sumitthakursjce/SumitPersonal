package GmailTests;

import PageActionsAndViews.gmailHomePageAction;
import PageActionsAndViews.gmailLoginAction;
import com.sun.org.glassfish.gmbal.Description;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testBase.BaseTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class deleteNonImpMail extends BaseTest{
    public static gmailLoginAction gmailLoginAction = new gmailLoginAction();
    public static gmailHomePageAction gmailHomePageAction = new gmailHomePageAction();

    @BeforeClass
    public static void loginGmail() throws InterruptedException {
        driver.get("https://accounts.google.com/signin");
        gmailLoginAction.enterEmailORPhone();
        gmailLoginAction.clickNext();
        gmailLoginAction.enterPassword();
        gmailLoginAction.clickNext();
    }

    @Test
    @Description("This test will find Non important mail & will delete it")
    public void deleteMail()
    {
        List<Object> mailList = gmailHomePageAction.getJsExecutor();

    }
}
