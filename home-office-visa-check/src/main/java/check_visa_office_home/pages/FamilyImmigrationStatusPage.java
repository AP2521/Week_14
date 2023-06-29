package check_visa_office_home.pages;

import check_visa_office_home.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FamilyImmigrationStatusPage extends Utility {
    public FamilyImmigrationStatusPage() {
        PageFactory.initElements(driver, this);
    }// error to come alert
    @FindBy(xpath="(//button[@type='submit'])[4]")
    WebElement nextButton;
    @FindBy(xpath="(//div[@class='govuk-radios']/div/label)[1]")
    WebElement clickYes;
    @FindBy(xpath="(//div[@class='govuk-radios']/div/label)[2]")
    WebElement clickNo;

    public void selectImmigrationStatus(String value) {
        switch (value){
            case "Yes":
                clickOnElement(clickYes);
                break;
            case "No":
                clickOnElement(clickNo);
                break;
            default:
                break;
        }
    }
    public void clickNextStepButton(){clickOnElement(nextButton);}
}