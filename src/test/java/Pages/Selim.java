package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selim extends Parent{
    public Selim() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='contact-link']/a")
    public WebElement ContactUsLoginButton;


    @FindBy(id="uniform-id_contact")
    public WebElement SubjectHeading;

    @FindBy(id="id_contact")
    public WebElement Customer;

    @FindBy(id="email")
    public WebElement emailAdress;

    @FindBy(name="id_order")
    public WebElement OrderReference;

    @FindBy(id="uniform-fileUpload")
    public WebElement chooseFile;

    @FindBy(id="message")
    public WebElement message;

    @FindBy(xpath = "//*[@id='submitMessage']/span")
    public WebElement sendButton;

    @FindBy(xpath = "//*[@id='center_column']/p")
    public WebElement actualText;
}
