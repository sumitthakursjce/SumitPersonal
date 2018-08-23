package testBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.List;
import java.util.Set;

public class driverInitilazation {
    public WebDriver driver = new WebDriver() {
        public void get(String s) {
        }

        public String getCurrentUrl() {
            return driver.getCurrentUrl();
        }

        public String getTitle() {
            return driver.getTitle();
        }

        public List<WebElement> findElements(By by) {
            return null;
        }

        public WebElement findElement(By by) {
            return null;
        }

        public String getPageSource() {
            return driver.getPageSource();
        }

        public void close() {

        }

        public void quit() {

        }

        public Set<String> getWindowHandles() {
            return driver.getWindowHandles();
        }

        public String getWindowHandle() {
            return driver.getWindowHandle();
        }

        public TargetLocator switchTo() {
            return null;
        }

        public Navigation navigate() {
            return null;
        }

        public Options manage() {
            return null;
        }
    };

}
