package PageActionsAndViews;

import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class gmailHomePageView extends Driver {


    WebElement searchBox = driver.findElement(By.id("gs_lc50"));

    WebElement searchButton = driver.findElement(By.cssSelector(".gbqfb"));

//    WebElement seleectAll = driver.findElement(By.cssSelector(".T-Jo.J-J5-Ji.T-Jo-auq.T-Jo-iAfbIe"));
//
//    WebElement deleleSelectedMail = driver.findElement(By.cssSelector(".T-I.J-J5-Ji.nX.T-I-ax7.T-I-Js-Gs.mA.T-I-Zf-aw2"));

    WebElement checkBoxForSelectingGamil = driver.findElement(By.cssSelector(".oZ-jc.T-Jo.J-J5-Ji"));

    List<WebElement> innerHtmlForMailSignifyingImpOrNot = driver.findElements(By.cssSelector(".zA.yO .WA.xY .T-ays-a45 .aol"));

    String scriptForIdentifyingNonImpMail = "document.querySelectorAll('[aria-label= \"Not important\"]')";

    String scriptForIdentifyingDeleleElment = "document.querySelectorAll('[aria-label= \"Delete\"]')";

}
