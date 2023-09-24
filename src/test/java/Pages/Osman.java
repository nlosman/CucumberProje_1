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

    @FindBy(id="uniform-cgv")
    public WebElement terms;

    @FindBy(id="paypal-standard-btn")
    public WebElement paypalBtn;

    @FindBy (className = "message")
    public WebElement negativeMessage;

    @FindBy (id="ccBillForm")
    public WebElement creditCartBtn;

    @FindBy(xpath = "//body")
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


    @FindBy (xpath = "(//div[@class='box'])//br[5]")
    public WebElement referenceNumber;

}
