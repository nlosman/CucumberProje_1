package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Zeynep extends Parent{

    public Zeynep()  {PageFactory.initElements(GWD.getDriver(), this);}

    @FindBy(linkText="My addresses")
    public WebElement myAddressesButton;

    @FindBy(linkText="Add a new address")
    public WebElement newAddress;

    @FindBy(id="address1")
    public WebElement addressInput;

    @FindBy(id="city")
    public WebElement cityInput;

    @FindBy(id="id_state")
    public WebElement stateSelect;

    @FindBy(id="postcode")
    public WebElement postCodeInput;

    @FindBy(id="id_country")
    public WebElement countrySelect;

    @FindBy(id="phone_mobile")
    public WebElement phoneNumberInput;

    @FindBy(id="alias")
    public WebElement reference;

    @FindBy(id="submitAddress")
    public WebElement submitButton;










}
