package PageActionsAndViews;

import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import testBase.BaseTest;

import java.util.List;

public class gmailLoginView extends Driver {

    WebElement emailInput = driver.findElement(By.id("identifierId"));

    List<WebElement> nextButton = driver.findElements(By.className("CwaK9"));


}
