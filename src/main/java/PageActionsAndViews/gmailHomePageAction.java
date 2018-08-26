package PageActionsAndViews;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class gmailHomePageAction extends gmailHomePageView{

    JavascriptExecutor jsExecutor;

    public List<Object> getJsExecutor() {
        return (List<Object>) jsExecutor.executeScript(scriptForIdentifyingNonImpMail);
    }

    public void selectGmail()
    {
        checkBoxForSelectingGamil.click();
    }

    public void deleteGmail()
    {
        deleteMail.click();
    }

}
