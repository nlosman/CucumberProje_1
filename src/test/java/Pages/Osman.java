package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Osman extends Parent {

    public Osman() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='shopping_cart']//a")
    public WebElement cart;

    @FindBy(css = "[class='icon-chevron-right right']")
    public WebElement checkout;

    @FindBy (xpath = "(//a[@title='Proceed to checkout'])[2]")
    public WebElement proceedChekout;

    @FindBy (xpath = "//button[@name='processAddress']")
    public WebElement proceedChekout2;

    @FindBy (xpath = "//button[@name='processCarrier']")
    public WebElement proceedChekout3;

    @FindBy(id="uniform-cgv")
    public WebElement terms;

    @FindBy(id="paypal-standard-btn")
    public WebElement paypalBtn;

    @FindBy(xpath = "//span[text()='I confirm my order']")
    public WebElement confirmBtn;

    @FindBy (className = "message")
    public WebElement negativeMessage;

    @FindBy (id="ccBillForm")
    public WebElement creditCartBtn;

    @FindBy(xpath = "//*[contains (text(), 'Invalid')]")
    public WebElement invalidMessage;

    @FindBy (className = "bankwire")
    public WebElement bankWire;

    @FindBy (xpath = "(//*[@class='price'])[1]")
    public WebElement price;

    @FindBy(css = "[class='cart-prices-line first-line']")
    public WebElement shippingPrice;


    @FindBy (xpath = "(//*[@class='price'])[2]")
    public WebElement totalPrice;


    @FindBy(css = "[class='alert alert-success']")
    public WebElement successMessage;


    @FindBy (xpath = "(//div[@class='box'])")
    public WebElement referenceNumber;


    @FindBy (xpath = "//*[@title= 'Continue shopping']")
    public WebElement conToShop;

    public WebElement getWebElement(String strElement){
        switch (strElement){
            case "checkout": return this.checkout;
            case "proceedChekout": return this.proceedChekout;
            case "proceedChekout2": return this.proceedChekout2;
            case "terms": return this.terms;
            case "proceedChekout3": return this.proceedChekout3;

        }
        return null;}




}
