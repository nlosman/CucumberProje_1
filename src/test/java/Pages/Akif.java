package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Akif extends Parent {
    public Akif() {

        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@class='sf-with-ul'])[4]")
    public WebElement dressesCategorie;

    @FindBy(className = "heading-counter")
    public WebElement topProductsMessage;

    @FindBy(className = "product-count")
    public WebElement bottomItemsMessage;

    @FindBy(className = "label-success")
    public List<WebElement> inStockButtons;
}
