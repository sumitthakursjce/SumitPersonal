package testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

import java.sql.DriverManager;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected static WebDriver driver;


    public BaseTest() {
        System.setProperty("webdriver.chrome.driver", "/Users/sumit.kumar/lithium/SumitPersonal/chromedriver");
        driver = new ChromeDriver();
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }

}
