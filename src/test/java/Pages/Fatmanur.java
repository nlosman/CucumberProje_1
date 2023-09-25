package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fatmanur extends Parent{
    public Fatmanur() {PageFactory.initElements(GWD.getDriver(), this);}

    @FindBy (xpath = "(//a[@class='sf-with-ul'])[4]" )
    public WebElement dressesCategorie;

    @FindBy (xpath = "(//li[@class='last'])[1]")
    public WebElement sommerDrsBtn;

    @FindBy (xpath = "(//a[@class='product-name'])[2]")
    public WebElement dressClick;

    @FindBy (css = "button[type='submit'][name='Submit']")
    public WebElement addBtn;

    @FindBy (xpath = "(//span[@class='title'])[1]")
    public WebElement successMsg;





}
