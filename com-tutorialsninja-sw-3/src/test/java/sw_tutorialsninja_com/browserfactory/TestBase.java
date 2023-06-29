package sw_tutorialsninja_com.browserfactory;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import sw_tutorialsninja_com.propertyreader.PropertyReader;
import sw_tutorialsninja_com.utility.Utility;

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
