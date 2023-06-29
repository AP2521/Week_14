package uklibrary.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uklibrary.utility.Utility;

public class ResultPage extends Utility {
    public ResultPage() {
        PageFactory.initElements(driver, this);
    }// error to come alert
    @FindBy(xpath="//h1[@class='search-header__title']")
    WebElement VerifyResultpage;
    public void verifyResultPageText(String expected){
        verifyText(expected,VerifyResultpage);
    }
}
