package parabank.browserfactory;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import parabank.propertyreader.PropertyReader;
import parabank.utility.Utility;

/**
 * Created by Bhavesh
 */
public class TestBase extends Utility {

    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod
    //@Parameters("browser")
    public void setUp(){
        selectBrowser(browser);
    }

    @AfterMethod
    public void tearDown(){
        closeBrowser();
    }

}
