package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest {

    public WebDriver driver;

    @Test
    public void openMyBlog() {
        driver.get("https://www.softwaretestingmaterial.com/");
    }

    @BeforeClass
    public void beforeClass() {

        System.setProperty("webdriver.chrome.driver", "/Users/sumit.kumar/lithium/SumitPersonal/chromedriver");
        driver = new ChromeDriver();

    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }

}