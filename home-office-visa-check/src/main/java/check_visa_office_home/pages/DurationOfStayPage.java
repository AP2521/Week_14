package check_visa_office_home.pages;

import check_visa_office_home.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DurationOfStayPage extends Utility {
    public DurationOfStayPage() {
        PageFactory.initElements(driver, this);
    }// error to come alert

    @FindBy(xpath="(//button[@type='submit'])[4]")
    WebElement nextButton;
    @FindBy(xpath="(//div[@class='govuk-radios']/div/label)[1]")
    WebElement monthorLess;
    @FindBy(xpath="(//div[@class='govuk-radios']/div/label)[2]")
    WebElement monthOrMore;

    public void selectImmigrationStatus(String value) {
//        getElementsListandClick(familyImmigrationStatus,status);

        switch (value){
            case "6 months or less":
                clickOnElement(monthorLess);
                break;
            case "longer than 6 months":
                clickOnElement(monthOrMore);
                break;
            default:
                break;
        }
    }
    public void clickNextStepButton(){clickOnElement(nextButton);}
}


