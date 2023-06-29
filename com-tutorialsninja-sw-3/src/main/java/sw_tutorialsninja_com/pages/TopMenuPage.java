package sw_tutorialsninja_com.pages;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sw_tutorialsninja_com.utility.Utility;

import java.util.List;

public class TopMenuPage extends Utility {
    public TopMenuPage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath="//ul[@class='nav navbar-nav']/li")
    List<WebElement> MenuBar;
    @FindBy(xpath="//div[@class='dropdown-menu']/a")
    List<WebElement> TabName;
    @FindBy(xpath="//div[@id='content']/h2")
    WebElement VerifyText;

    public void selectMenu(String menu, String menuItem)  {
        getElementsListandClick(MenuBar, menu);

        selectMenuContent(menuItem);
        verifyText(menu,VerifyText);
    }
        public void selectMenuContent(String menuItem) {
        List<WebElement> topMenuList =TabName;
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(menuItem)) {
                    element.click();
                }
            }}
        catch (StaleElementReferenceException e) {
            topMenuList = TabName;
        }

    }
}
