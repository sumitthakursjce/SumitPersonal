package PageActionsAndViews;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class gmailHomePageAction extends gmailHomePageView{

    JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

    public List<Object> getJsExecutor() {
        return (List<Object>) jsExecutor.executeScript(scriptForIdentifyingNonImpMail);
    }

    public void selectGmail()
    {
        checkBoxForSelectingGamil.click();
    }

    public void deleteGmail()
    {
        WebElement deleteMail = (WebElement) jsExecutor.executeScript(scriptForIdentifyingDeleleElment);
        deleteMail.click();
    }

}
