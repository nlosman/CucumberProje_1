package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Emrullah extends Parent {
    public Emrullah() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='product_list']/li")
    public List<WebElement> pruducts;

    @FindBy(xpath = "//*[@class='cart_block_product_name']")
    public List<WebElement> productTitles;

    @FindBy(xpath = "//span[text()='Add to cart']")
    public List<WebElement> addToCartBtns;

    @FindBy(xpath = "//*[@title='Continue shopping']")
    public WebElement toShoppingBtn;

    @FindBy(xpath = "//*[@title='View my shopping cart']")
    public WebElement goToCart;

    @FindBy(xpath = "//*[@id='cart_summary'] /tbody/ tr")
    public List<WebElement> cartList;

    @FindBy(xpath = "//*[@id='cart_summary'] /tbody/ tr/td/p")
    public List<WebElement> cartProductTitles;
}
