package check_visa_office_home.pages;

import check_visa_office_home.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectNationalityPage extends Utility {
    public SelectNationalityPage() {
        PageFactory.initElements(driver, this);
    }// error to come alert
    @FindBy(id="response")
    WebElement nationalityList;
    @FindBy(xpath="(//button[@type='submit'])[4]")
    WebElement continueButton;


    public void selectNationality(String nationality){
        selectByVisibleTextFromDropDown(nationalityList,nationality);
    }
    public void clickNextStepButton(){clickOnElement(continueButton);}
}
