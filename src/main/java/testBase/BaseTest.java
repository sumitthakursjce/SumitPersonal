package testBase;

import Utilities.Driver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    @BeforeClass(alwaysRun = true)
    public static void setup()
    {
        Driver.initilize();
    }

    @AfterClass
    public void cleanUp()
    {
        Driver.close();
    }


}
