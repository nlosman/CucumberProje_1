package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Suleyman extends Parent{
    public Suleyman() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(id="email_create")
    public WebElement emailInput;

    @FindBy(xpath = "//*[@id='SubmitCreate']/span")
    public WebElement createBtn;

    @FindBy (id="uniform-id_gender1")
    public WebElement titleRadio;

    @FindBy(id="customer_firstname")
    public WebElement firstName;

    @FindBy(id="customer_lastname")
    public WebElement lastName;

    @FindBy(id="passwd")
    public WebElement password;

    @FindBy(id="days")
    public WebElement daySelect;

    @FindBy(id="months")
    public WebElement monthSelect;

    @FindBy(id="years")
    public WebElement yearSelect;

    @FindBy(xpath = "//*[@id='submitAccount']")
    public WebElement registerBtn;

    @FindBy(xpath = "//*[@id='center_column']/p[1]")
    public WebElement successCreated;






}
