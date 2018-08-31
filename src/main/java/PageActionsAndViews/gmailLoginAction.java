package PageActionsAndViews;

import config.ConfigFileReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class gmailLoginAction extends gmailLoginView{
    public static ConfigFileReader configFileReader = new ConfigFileReader();

    public void enterEmailORPhone()
    {
        emailInput.sendKeys(configFileReader.getGmailEmailId());
    }

    public void clickNext()
    {
        nextButton.get(1).click();
    }

    public void enterPassword()
    {
        WebElement passwordTextBox = driver.findElement(By.name("password"));
        passwordTextBox.sendKeys(configFileReader.getGmailPassword());
    }

    public void submit()
    {
        List<WebElement> elements = driver.findElements(By.className("CwaK9"));

        for (int i =0 ; i < elements.size() ; i++)
        {
            if (elements.get(i).getText().contains("Next"))
            {
                elements.get(i).click();
                return;
            }
        }

    }

}
