package check_visa_office_home.testsuite;

import check_visa_office_home.browserfactory.TestBase;
import check_visa_office_home.pages.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;

public class VisaConfirmationTest extends TestBase {

StartPage startPage ;
WorkTypePage workTypePage ;
SelectNationalityPage selectNationalityPage;
ResultPage resultPage ;
ReasonForTravelPage reasonForTravelPage ;
FamilyImmigrationStatusPage familyImmigrationStatusPage;
DurationOfStayPage durationOfStayPage;

    @BeforeMethod
    public void inIT(){
        startPage =new StartPage();
        workTypePage = new WorkTypePage();
        selectNationalityPage = new SelectNationalityPage();
        resultPage = new ResultPage();
        reasonForTravelPage = new ReasonForTravelPage();
        familyImmigrationStatusPage = new FamilyImmigrationStatusPage();
        durationOfStayPage = new DurationOfStayPage();
    }
@Test(dataProvider ="Test1",dataProviderClass = TestData.class)
    public void anAustralianCominToUKForTourism(String city,String reason,String result) throws InterruptedException {
        startPage.clickStartNow();
        selectNationalityPage.selectNationality(city);
        selectNationalityPage.clickNextStepButton();
        reasonForTravelPage.selectReasonForVisit(reason);
        reasonForTravelPage.clickNextStepButton();
        Thread.sleep(5000);
        resultPage.confirmResultMessage(result);
    }
    @Test(dataProvider ="Test2",dataProviderClass = TestData.class)
    public void aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths(String city,String reason,String status,String jobType,String result){
        startPage.clickStartNow();
        selectNationalityPage.selectNationality(city);
        selectNationalityPage.clickNextStepButton();
        reasonForTravelPage.selectReasonForVisit(reason);
        reasonForTravelPage.clickNextStepButton();
        durationOfStayPage.selectImmigrationStatus(status);
        durationOfStayPage.clickNextStepButton();
        workTypePage.selectJobType(jobType);
        workTypePage.clickNextStepButton();
        resultPage.confirmResultMessage(result);
    }
    @Test(dataProvider ="Test3",dataProviderClass = TestData.class)
    public void aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArticle10Or20Card(String city,String reason,String status,String result){
        startPage.clickStartNow();
        selectNationalityPage.selectNationality(city);
        selectNationalityPage.clickNextStepButton();
        reasonForTravelPage.selectReasonForVisit(reason);
        reasonForTravelPage.clickNextStepButton();
        familyImmigrationStatusPage.selectImmigrationStatus(status);
        familyImmigrationStatusPage.clickNextStepButton();
        resultPage.confirmResultMessage(result);
    }
}
