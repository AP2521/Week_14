package parabank.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import parabank.utility.Utility;


/**
 * Created by Anish
 */
public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
public HomePage(){
    PageFactory.initElements(driver,this);
}

    @FindBy(linkText = "Log in")
    WebElement loginLink;

    @FindBy(linkText = "Register")
    WebElement registerLink ;

    @FindBy(css="div[id='rightPanel']>h1")
    WebElement signup;

    public void clickOnLoginLink(){
        clickOnElement(loginLink); }
    public void clickOnRegisterLink(){
        clickOnElement(registerLink); }
    public void verifySignUpText(String text){
        verifyText(text,signup);
    }



}
