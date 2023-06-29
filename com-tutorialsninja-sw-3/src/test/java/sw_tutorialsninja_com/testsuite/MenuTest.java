package sw_tutorialsninja_com.testsuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import sw_tutorialsninja_com.browserfactory.TestBase;
import sw_tutorialsninja_com.pages.TopMenuPage;

public class MenuTest extends TestBase {
    TopMenuPage topMenuPage;

    @BeforeMethod
    public void inIT(){
        topMenuPage = new TopMenuPage();}
    @Test
    public void menuTest(){
        topMenuPage.selectMenu("Desktops","Show AllDesktops");
        topMenuPage.selectMenu("Laptops & Notebooks","Show AllLaptops & Notebooks");
        topMenuPage.selectMenu("Components","Show AllComponents");
    }

}
