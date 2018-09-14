package PageActionsAndViews;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class gmailHomePageAction extends gmailHomePageView{

//     Used this coz directly click was not working.
    Actions actions = new Actions(driver);

    JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

    public List<Object> getJsExecutor() {
        return (List<Object>) jsExecutor.executeScript(scriptForIdentifyingNonImpMail);
    }

    public Set<Integer> isMailNotImp() {

        Set<Integer> nonImpMail = new HashSet<Integer>();

        for (int i =0 ; i < innerHtmlForMailSignifyingImpOrNot.size() ; i++)
        {
            if (innerHtmlForMailSignifyingImpOrNot.get(i).getText().equalsIgnoreCase("Click to teach Gmail that this conversation is important."))
            nonImpMail.add(i);
        }

        return nonImpMail;
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

    public void selectAll()
    {
        List<WebElement> seleectAll = driver.findElements(By.cssSelector(".J-J5-Ji.J-JN-M-I-Jm .T-Jo.J-J5-Ji .T-Jo-auh"));
        seleectAll.get(1).click();
    }

    public void deleleteSelectedMail()
    {
        List<WebElement> deleleSelectedMail = driver.findElements(By.cssSelector(".ar9.T-I-J3.J-J5-Ji"));
        deleleSelectedMail.get(1).click();
    }

    public void filterNonImpMailThroughSearchBox()
    {
        actions.moveToElement(searchBox);
        actions.click();
        actions.sendKeys("-L:important");
        actions.build().perform();
        searchButton.click();
    }


}
