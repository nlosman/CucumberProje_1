package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.webaudio.WebAudio;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DilekElif extends Parent{
    public DilekElif() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
    @FindBy (className = "login")
    public WebElement loginBtn;

    @FindBy(id="email")
    public WebElement emailInput;

    @FindBy(id="passwd")
    public WebElement passwordInput;
    @FindBy(xpath="//*[@id='SubmitLogin']/span")
    public WebElement signinBtn;

    @FindBy(className= "logout")
    public WebElement signOut;




}
