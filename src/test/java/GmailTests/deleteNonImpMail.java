package GmailTests;

import PageActionsAndViews.gmailHomePageAction;
import PageActionsAndViews.gmailLoginAction;
import Utilities.Driver;
import config.ConfigFileReader;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import testBase.BaseTest;

import java.util.List;

public class deleteNonImpMail extends BaseTest{
    public static ConfigFileReader configFileReader = new ConfigFileReader();


    @BeforeTest
    public void login()
    {
        /* super.setup(); should not be needed , since this class is extending BaseTest & there in before class setup() is there so it should ve invoked that,
        but that is not happening , hence using this workaround. */

        super.setup();
        Driver.driver.navigate().to(configFileReader.getGmailApplicationUrl());

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
    public void deleteMail() throws InterruptedException {
        Thread.sleep(10000);
        gmailHomePageAction gmailHomePageActions = new gmailHomePageAction();
        List<Object> mailList = gmailHomePageActions.getJsExecutor();

    }
}
