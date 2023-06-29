package parabank.testsuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import parabank.browserfactory.TestBase;
import parabank.pages.HomePage;
import parabank.pages.LoginPage;

public class LoginTest extends TestBase {
    HomePage homePage;
    LoginPage loginPage;
    @BeforeMethod
    public void inIT(){
        homePage = new HomePage();
        loginPage = new LoginPage();}
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        loginPage.EnterUserName("ab13345");
        loginPage.EnterPassword("ab133");
        loginPage.ClickLogin();
        loginPage.VerifyText("Accounts Overview");
    }
    @Test
    public void verifyTheErrorMessage(){
        loginPage.EnterUserName("a2345");
        loginPage.EnterPassword("a23");
        loginPage.ClickLogin();
        loginPage.VerifyText("Error!");
    }
    @Test
    public void userShouldLogOutSuccessfully(){
        loginPage.EnterUserName("ab13345");
        loginPage.EnterPassword("ab133");
        loginPage.ClickLogin();
        loginPage.LogOutButton();
        loginPage.VerifyLoginText("Customer Login");
    }
}
