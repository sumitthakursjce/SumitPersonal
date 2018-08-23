package PageActionsAndViews;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import testBase.driverInitilazation;

public class gmailLoginView extends driverInitilazation {

    WebElement emailInput = driver.findElement(By.id("identifierId"));

    WebElement nextButton = driver.findElement(By.className("ZFr60d CeoRYc"));

    WebElement passwordTextBox = driver.findElement(By.name("password"));

}
