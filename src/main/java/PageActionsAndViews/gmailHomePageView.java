package PageActionsAndViews;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import testBase.driverInitilazation;

public class gmailHomePageView extends driverInitilazation {


    WebElement checkBoxForSelectingGamil = driver.findElement(By.className("oZ-jc T-Jo J-J5-Ji"));

    WebElement deleteMail = driver.findElement(By.className("T-I J-J5-Ji nX T-I-ax7 T-I-Js-Gs W6eDmd T-I-Zf-aw2"));

    String scriptForIdentifyingNonImpMail = "document.querySelectorAll('[aria-label= \"Not important\"]')";

}
