package check_visa_office_home.pages;

import check_visa_office_home.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StartPage extends Utility {
    public StartPage() {
        PageFactory.initElements(driver, this);
    }// error to come alert
    @FindBy(xpath="(//a[@role='button'])[1]")
    WebElement startButton;

    public void clickStartNow(){
        clickOnElement(startButton);
    }
}
