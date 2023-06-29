package parabank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import parabank.utility.Utility;

/**
 * Created by Anish
 */
public class LoginPage extends Utility {
    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//input[@name='username']")
    WebElement UserName;

    @FindBy(xpath="//input[@name='password']")
    WebElement Password;
    @FindBy (xpath="//input[@value='Log In']")
    WebElement LoginButton;
    @FindBy (xpath="//h1[@class='title']")
    WebElement VerifyText;
    @FindBy (xpath="//p[@class='error']")
    WebElement ErrorText;
    @FindBy(xpath="//div[@id='leftPanel']/ul/li[8]/a")
    WebElement Logout;
    @FindBy(xpath="//div[@id='leftPanel']/h2")
    WebElement  CustomerLogin;

    public void EnterUserName(String name){
        sendTextToElement(UserName,name);
    }
    public void EnterPassword(String password){
        sendTextToElement(Password,password);
    }
    public void ClickLogin(){
        clickOnElement(LoginButton);
    }
    public void VerifyText(String expected){
        verifyText(expected,VerifyText);
    }
    public void VerifyErrorText(String expected){
        verifyText(expected,ErrorText);
    }
    public void LogOutButton(){clickOnElement(Logout);}
    public void VerifyLoginText(String expected){
        verifyText(expected,CustomerLogin);
    }
}
