package StepDefinitions;

import Pages.Zeynep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;

public class US_03_Zeynepp {

    Zeynep ze = new Zeynep();

    @When("Click my addresses button")
    public void clickMyAddressesButton() {
        ze.myClick(ze.myAddressesButton);


    }

    @Then("Click add a new address button")
    public void clickAddANewAddressButton() {

       ze.myClick(ze.newAddress);

    }

    @And("User can successfully add a new address")
    public void userCanSuccessfullyAddANewAddress() {

        ze.mySendKeys(ze.addressInput,"paul hoffman street");
        ze.mySendKeys(ze.cityInput, "Phoenix");
        Select newState=new Select(ze.stateSelect);
        newState.selectByIndex(2);
        ze.mySendKeys(ze.postCodeInput, "86012");
        Select country =new Select(ze.countrySelect);
        country.selectByValue("21");
        ze.mySendKeys(ze.phoneNumberInput, "01563454563");
        ze.mySendKeys(ze.reference, "my home address");
        ze.myClick(ze.submitButton);


    }
}


