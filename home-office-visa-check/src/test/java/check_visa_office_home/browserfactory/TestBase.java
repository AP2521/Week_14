package check_visa_office_home.browserfactory;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import check_visa_office_home.propertyreader.PropertyReader;
import check_visa_office_home.utility.Utility;

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
