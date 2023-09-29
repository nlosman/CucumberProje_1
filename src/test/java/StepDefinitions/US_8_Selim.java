package StepDefinitions;

import Pages.Parent;
import Pages.Selim;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class US_8_Selim{

    Selim sl= new Selim();

    @When("Enter ContactUs and click button")
    public void enterContactUsAndClickButton() {

        sl.myClick(sl.ContactUsLoginButton);


    }

    @Then("Send a message")
    public void sendAMessage() throws AWTException {

        Select secCustomer= new Select(sl.Customer);
        secCustomer.selectByIndex(1);

        sl.mySendKeys(sl.emailAdress, "aaaa@gmail.com");
        sl.mySendKeys(sl.OrderReference, "WYDSLSAS");


        sl.myClick(sl.chooseFile);



        try {
            Robot robot = new Robot();
            // Dosya yolunu bir dize olarak tanımla
            StringSelection stringSelection = new StringSelection("C:\\Users\\HP\\Desktop\\tekir.png"); // Dosya yolunu gir

            // Kopyala işlemi
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

            // CTRL+V (Yapıştır) tuşlarına bas
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);

            // ENTER tuşuna bas
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } catch (AWTException e) {
            e.printStackTrace();
        }
        sl.mySendKeys(sl.message,"Banka havalesi henüz yapıldı, ödeme dekontu ektedir. İsim Soyisim");
        sl.myClick(sl.sendButton);
    }

    @And("User can successfully receive the message")
    public void userCanSuccessfullyReceiveTheMessage() {

    Assert.assertTrue(sl.actualText.getText().contains("successfully"));


    }
}