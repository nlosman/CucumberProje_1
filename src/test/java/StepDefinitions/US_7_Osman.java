package StepDefinitions;


import Pages.Osman;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class US_7_Osman {
    Osman os = new Osman();

    @And("Click buttons of payment")
    public void clickButtonsOfPayment() {
        Actions aksiyonlar=new Actions(GWD.getDriver());
        Action aksiyon= aksiyonlar.moveToElement(os.cart).build();
        aksiyon.perform();
        os.myClick(os.checkout);
        os.myClick(os.checkout);
        os.myClick(os.checkout);
        os.myClick(os.terms);
        os.myClick(os.checkout);

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
        Assert.assertEquals(os.invalidMessage, "Invalid request (1).");
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
        os.myClick(os.checkout);
    }

    @Then("Payment success message should be displayed")
    public void paymentSuccessMessageShouldBeDisplayed() {
        Assert.assertTrue(os.successMessage.getText().contains("Your order on Xu Clothing is complete."));
    }

    @And("Save the reference number")
    public String saveTheReferenceNumber() {
        String referenceText=os.referenceNumber.getText();
        String reference = referenceText.substring(47,56);
        System.out.println(reference);
        return reference;
    }


}
