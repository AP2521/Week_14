package sw_tutorialsninja_com.pages;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import sw_tutorialsninja_com.utility.Utility;

import java.util.List;

public class ProductPageandOrder extends Utility {
    public ProductPageandOrder() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath="//select[@id='input-sort']")
    WebElement sortBy;
    @FindBy(xpath="//div[@class='caption']/h4/a")
    List<WebElement> productList;
    @FindBy(xpath="//div[@class='col-sm-4']/h1")
    WebElement verifyProductText;
    @FindBy(id="input-option225")
    WebElement deliveryDate;
    @FindBy(xpath="//input[@name='quantity']")
    WebElement quantity;
    @FindBy(xpath="//div[@id='content']/form/div/table/tbody/tr/td[4]/div/input")
    WebElement enterQtyinCart;
    @FindBy(xpath="//*[@id='content']/form/div/table/tbody/tr/td[4]/div/span/button[1]")
    WebElement updateQty;
    @FindBy(xpath="//div[@id='checkout-cart']/div[1]")
    WebElement verifySuccessModified;
    @FindBy(xpath="//button[@id='button-cart']")
    WebElement addCartButton;
    @FindBy(linkText="shopping cart")
    WebElement shoppingCart;
    @FindBy(xpath="//*[@id='checkout-cart']/ul/li[2]/a")
    WebElement verifyShopping;
    @FindBy(xpath="//form[@id='form-currency']/div/button/span")
    WebElement clickonCurrency;
    @FindBy(xpath="//*[@id='form-currency']/div/ul/li/button")
    List<WebElement> currencyButton;
    @FindBy(xpath="(//table[@class='table table-bordered']/tbody/tr[4]/td[2])[2]")
    WebElement totalAmount;
    @FindBy(xpath="//div/table/tbody/tr/td[2]/a")
    WebElement nameofProduct;
    @FindBy(xpath="//div[@id='content']/form/div/table/tbody/tr/td[2]/small[1]")
    WebElement dateOfDelivery;
    @FindBy(xpath="//div[@id='content']/form/div/table/tbody/tr/td[3]")
    WebElement productModelNo;

    public void setSortBy(String sortby) {
        selectByVisibleTextFromDropDown(sortBy, sortby);
        //verifyText(sortby, sortBy);
    }
    public void selectProduct(String Product) {
        List<WebElement> topMenuList =  productList;
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(Product)) {
                    element.click();
                }
            }}
        catch (StaleElementReferenceException e) {
            topMenuList = productList;
        }
    }
    public void verifyProductText(String product){
        Reporter.log("Verify Product"+ product.toString());
        verifyText(product, verifyProductText);
   }

    public void selectDeliverDate(String YMD) {
        clearSendTextToElement(deliveryDate,YMD);
    }
    public void enterQuantity(String qty){
        clearSendTextToElement(quantity,qty);
    }
    public void AddtoCart(){
        clickOnElement(addCartButton);
    }
    public void clickonShoppingCart(){
        clickOnElement(shoppingCart);
        verifyText("Shopping Cart",verifyShopping);
    }
    public void verifyProductTextinCart(String productName){
        verifyText(productName,nameofProduct);}
        public void verifyDeliveryDate(String deliveryDate){
        verifyText(deliveryDate,dateOfDelivery);}
        public void verifyModel(String modelNo){
        verifyText(modelNo,productModelNo);
    }
    public void enterUpdateQTYinCartandVerify(String Qty,String verifyModification){
        clearSendTextToElement(enterQtyinCart,Qty);
        clickOnElement(updateQty);
        verifyText(verifyModification,verifySuccessModified);
    }

    public void currencyChange(String enterCurrency){
        clickOnElement(clickonCurrency);
        //getElementsListandClick(By.xpath("//*[@id='form-currency']/div/ul/li/button"),enterCurrency);
        List<WebElement> topMenuList = currencyButton;
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(enterCurrency)) {
                    element.click();
                }
            }}
        catch (StaleElementReferenceException e) {
            topMenuList = currencyButton;
        }
    }
    public void verifyTotalAmount(String EnterTotalamount){
        verifyText(EnterTotalamount,totalAmount);
    }
}