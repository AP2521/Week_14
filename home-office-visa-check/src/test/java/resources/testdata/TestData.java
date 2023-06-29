package resources.testdata;

import org.testng.annotations.DataProvider;

/**
 * Created by Bhavesh
 */
public class TestData {

    @DataProvider(name="Test1")
    public Object[][] getData() {

        Object[][] data = new Object[][]{
                {"Australia","Tourism or visiting family and friends","You will not need a visa to come to the UK"}
        };
        return data; }

    @DataProvider(name="Test2")
    public Object[][] getData2() {

        Object[][] data = new Object[][]{
                {"Chile",
                        "Work, academic visit or business",
                        "longer than 6 months",
                        "Health and care professional",
                        "You need a visa to work in health and care"}
        };
        return data; }
    @DataProvider(name="Test3")
    public Object[][] getData3() {

        Object[][] data = new Object[][]{
                {"India",
                        "Join partner or family for a long stay",
                        "Yes",
                        "You’ll need a visa to join your family or partner in the UK"}
        };
        return data; }
}