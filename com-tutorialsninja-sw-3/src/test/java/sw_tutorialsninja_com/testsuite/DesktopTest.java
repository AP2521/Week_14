package sw_tutorialsninja_com.testsuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import sw_tutorialsninja_com.browserfactory.TestBase;
import sw_tutorialsninja_com.pages.ProductPageandOrder;
import sw_tutorialsninja_com.pages.TopMenuPage;

public class DesktopTest extends TestBase {
    TopMenuPage topMenuPage;
    ProductPageandOrder productPageandOrder;
    @BeforeMethod
    public void inIT(){
        topMenuPage = new TopMenuPage();
        productPageandOrder = new ProductPageandOrder();}
    @Test
    public void desktopTest () throws InterruptedException {
        topMenuPage.selectMenu("Desktops","Show AllDesktops");
        productPageandOrder.setSortBy("Name (A - Z)");
        productPageandOrder.selectProduct("HP LP3065");
        productPageandOrder.verifyProductText("HP LP3065");
        productPageandOrder.selectDeliverDate("2022-11-30");
        productPageandOrder.enterQuantity("1");
        Thread.sleep(2000);
        productPageandOrder.AddtoCart();
        productPageandOrder.clickonShoppingCart();
        productPageandOrder.verifyProductTextinCart("HP LP3065");
        productPageandOrder.verifyDeliveryDate("Delivery Date:2022-11-30");
        productPageandOrder.verifyModel("Product 21");
        productPageandOrder.currencyChange("£Pound Sterling");
        productPageandOrder.verifyTotalAmount("£74.73");
    }
}
