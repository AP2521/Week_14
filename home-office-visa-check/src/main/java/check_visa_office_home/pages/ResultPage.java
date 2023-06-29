package check_visa_office_home.pages;

import check_visa_office_home.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ResultPage extends Utility {
    public ResultPage() {
        PageFactory.initElements(driver, this);
    }// error to come alert
    @FindBy(xpath="//div[@class='govuk-!-margin-bottom-6']/h2")
    WebElement resultPage;

    public String getResultMessage(){
        String actualText = resultPage.getText();
        return actualText;
    }
    public void confirmResultMessage(String expectedMessage){
        ResultPage resultPage = new ResultPage();
        String actualMessage = resultPage.getResultMessage();
        Assert.assertTrue(actualMessage.equalsIgnoreCase(expectedMessage));

    }
}
