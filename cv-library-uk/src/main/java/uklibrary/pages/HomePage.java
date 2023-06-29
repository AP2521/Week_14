package uklibrary.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uklibrary.utility.Utility;

/**
 * Created by Anish
 */
public class HomePage extends Utility {
    public HomePage() {
        PageFactory.initElements(driver, this);
    }// error to come alert
   @FindBy(id="keywords")
    WebElement JobTitle;
   @FindBy(id="location")
    WebElement Location;
   @FindBy(xpath="//select[@id='distance']")
    WebElement Distance;
   @FindBy(id="toggle-hp-search")
    WebElement MoreSearchOption;
   @FindBy(id="salarymin")
    WebElement SalaryMin;
   @FindBy(id="salarymax")
    WebElement SalaryMax;
   @FindBy(xpath="//select[@id='salarytype']")
    WebElement SalaryType;
   @FindBy(id="tempperm")
    WebElement JobType;
   @FindBy(id="hp-search-btn")
    WebElement FindJobs;

   public void enterJobTitle(String jobTitle){
       sendTextToElement(JobTitle,jobTitle);
   }
   public void enterLocation(String location){
       sendTextToElement(Location,location);
   }
   public void selectDistance(String distance){
       selectByVisibleTextFromDropDown(Distance,distance);

   }
   public void clickOnMoreSearchOptionLink(){
       clickOnElement(MoreSearchOption);
   }
   public void enterMinSalary(String salaryMin){
       sendTextToElement(SalaryMin,salaryMin);
   }
   public void enterMaxSalary(String salaryMax){
       sendTextToElement(SalaryMax,salaryMax);
   }
   public void selectSalaryType(String salaryType){
       selectByVisibleTextFromDropDown(SalaryType,salaryType);
   }
   public void selectJobType(String jobType){
       selectByVisibleTextFromDropDown(JobType,jobType);
   }
   public void clickOnFindJobsButton(){
       clickOnElement(FindJobs);
   }


}
