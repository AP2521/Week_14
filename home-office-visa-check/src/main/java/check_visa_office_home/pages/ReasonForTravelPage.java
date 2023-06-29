package check_visa_office_home.pages;

import check_visa_office_home.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ReasonForTravelPage extends Utility {
    public ReasonForTravelPage() {
        PageFactory.initElements(driver, this);
    }// error to come alert
    @FindBy(xpath="//div[@class='govuk-radios']/div/label")
    List<WebElement> reasonforTravelling;
    @FindBy(xpath="(//button[@type='submit'])[4]")
    WebElement nextButton;


    public void selectReasonForVisit(String reason){
        getElementsListandClick(reasonforTravelling,reason);
    }
    public void clickNextStepButton(){clickOnElement(nextButton);}
}
