package StepDefinitions;


import Pages.Osman;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class US_7_Osman {
    Osman os = new Osman();

    @And("Click buttons of payment")
    public void clickButtonsOfPayment() {

        os.myClick(os.conToShop);
        Actions aksiyonlar=new Actions(GWD.getDriver());

        Action aksiyon3= aksiyonlar.moveToElement(os.cart).build();
        aksiyon3.perform();
        os.myClick(os.checkout);
        os.myClick(os.proceedChekout);
        os.myClick(os.proceedChekout2);
        os.myClick(os.terms);
        os.myClick(os.proceedChekout3);
    }

    @When("Click PayPal button")
    public void clickPayPalButton() {
        os.myClick(os.paypalBtn);
    }

    @Then("Negative message should be displayed")
    public void negativeMessageShouldBeDisplayed() {
        Assert.assertTrue(os.negativeMessage.getText().contains("Niet alles werkt"));
    }

    @And("Navigate to back")
    public void navigateToBack() {
        GWD.getDriver().navigate().back();
    }

    @When("Click creditcard button")
    public void clickCreditcardButton() {
        os.myClick(os.creditCartBtn);
    }

    @Then("Invalid message should be displayed")
    public void invalidMessageShouldBeDisplayed() {
        Assert.assertTrue(os.invalidMessage.getText().contains("Invalid"));
    }

    @When("Click pay by bank wire button")
    public void clickPayByBankWireButton() {
        os.myClick(os.bankWire);
    }


    @Then("Total amount should be confirmed")
    public void totalAmountShouldBeConfirmed() {
        Actions aksiyonlar=new Actions(GWD.getDriver());
        Action aksiyon= aksiyonlar.moveToElement(os.cart).build();
        aksiyon.perform();
        String price=os.price.getText();
        String shippingPrice=os.shippingPrice.getText();
        String totalPrice=os.totalPrice.getText();

        Double priceDouble = Double.parseDouble(price.replaceAll("[^0-9,.]",""));
        Double shippinPriceDouble = Double.parseDouble(shippingPrice.replaceAll("[^0-9,.]",""));
        Double totalPriceDouble = Double.parseDouble(totalPrice.replaceAll("[^0-9,.]",""));

        Assert.assertTrue(totalPriceDouble==(priceDouble+shippinPriceDouble));

    }
    @When("Click confirm order button")
    public void clickConfirmOrderButton() {
        os.myClick(os.confirmBtn);
    }



    @Then("Payment success message should be displayed")
    public void paymentSuccessMessageShouldBeDisplayed() {
        Assert.assertTrue(os.successMessage.getText().contains("Your order on Xu Clothing is complete."));
    }

    @And("Save the reference number")
    public String saveTheReferenceNumber() {
        String referenceText=os.referenceNumber.getText();
        int index1= referenceText.indexOf("reference ");
        String refBaslama = referenceText.substring(index1+10);
        int index2 = refBaslama.indexOf(" ");
        String reference = refBaslama.substring(0, index2);
        System.out.println(reference);
        return reference;

    }




}
