package parabank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import parabank.utility.Utility;

public class RegisterPage extends Utility {
    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="customer.firstName")
    WebElement FirstName;
    @FindBy(id="customer.lastName")
    WebElement LastName;
    @FindBy(id="customer.address.street")
    WebElement AddressStreet;
    @FindBy(id="customer.address.city")
    WebElement AddressCity;
    @FindBy(id="customer.address.state")
    WebElement AddressState;
    @FindBy(id="customer.address.zipCode")
    WebElement AddressZipcode;
    @FindBy(id="customer.phoneNumber")
    WebElement PhoneNumber;
    @FindBy(id="customer.ssn")
    WebElement SSN;
    @FindBy(id="customer.username")
    WebElement Username;
    @FindBy(id="customer.password")
    WebElement Password;
    @FindBy(id="repeatedPassword")
    WebElement ConfirmPassword;
    @FindBy(xpath="//input[@value='Register']")
    WebElement RegisterButton;
    @FindBy(xpath="//div[@id='rightPanel']/p")
    WebElement AccountCreatedText;

    public void EnterFirstName(String firstname){
        sendTextToElement(FirstName,firstname);
    }
    public void EnterLastNAme(String lastname){
        sendTextToElement(LastName,lastname);
    }
    public void EnterAddressStreet(String addressStreet){
        sendTextToElement(AddressStreet,addressStreet);
    }
    public void EnterAddressCity(String addressCity){
        sendTextToElement(AddressCity,addressCity);
    }
    public void EnterAddressState(String addressState){
        sendTextToElement(AddressState,addressState);
    }
    public void AddressZipcode(String addressZipcode){
        sendTextToElement(AddressZipcode,addressZipcode);
    }
    public void PhoneNumber(String phoneNumber){
        sendTextToElement(PhoneNumber,phoneNumber);
    }
    public void EnterUsername(String username){
        sendTextToElement(Username,username);
    }
    public void EnterSSN(String ssn){
        sendTextToElement(SSN,ssn);
    }

    public void EnterPassword(String password){
        sendTextToElement(Password,password);
    }
    public void EnterConfirmPassword(String confirmPassword){
        sendTextToElement(ConfirmPassword,confirmPassword);
    }
    public void ClickRegisterButton(){
        clickOnElement(RegisterButton);
    }
    public void VerifyAccountCreatedText(String expected){
       verifyText(expected,AccountCreatedText);
    }

}
