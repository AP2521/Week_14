package check_visa_office_home.pages;

import check_visa_office_home.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WorkTypePage extends Utility {
    public WorkTypePage() {
        PageFactory.initElements(driver, this);
    }// error to come alert
    @FindBy(xpath="//div[@class='govuk-radios']/div/label")
    List<WebElement> jobTypeList;
    @FindBy(xpath="(//button[@type='submit'])[4]")
    WebElement nextButton;
    public void selectJobType(String job){
        getElementsListandClick(jobTypeList,job);
    }
    public void clickNextStepButton(){clickOnElement(nextButton);}
}
