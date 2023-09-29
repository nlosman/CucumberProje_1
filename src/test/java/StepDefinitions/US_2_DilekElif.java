package StepDefinitions;

import Pages.DilekElif;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class US_2_DilekElif {

    DilekElif de = new DilekElif();
    @Given("Navigate to Cleverppc")
    public void navigateToCleverppc() {
        GWD.getDriver().get("https://cleverppc.com/prestashop4/");
    }

    @When("Click login button")
    public void clickLoginButton() {
        de.myClick(de.loginBtn);
    }

    @Then("Enter email and password")
    public void enterEmailAndPassword() {

        de.mySendKeys(de.emailInput, "suleymanaslan1234@hotmail.com");
        de.mySendKeys(de.passwordInput, "12345");
        de.myClick(de.signinBtn);

    }

    @And("User should login successfully")
    public void userShouldLoginSuccessfully() {
        Assert.assertTrue(de.signOut.getText().contains("Sign out"));
    }


}
