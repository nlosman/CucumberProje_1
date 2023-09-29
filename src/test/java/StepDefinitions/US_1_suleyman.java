package StepDefinitions;

import Pages.Suleyman;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class US_1_suleyman {
    Suleyman su = new Suleyman();
    @When("Enter email")
    public void enterEmail() {
        su.mySendKeys(su.emailInput, "suleymanaslan1234@hotmail.com");

    }
    @Then("Click create and account button")
    public void clickCreateAndAccountButton() {
        su.myClick(su.createBtn);
    }

    @And("Enter information")
    public void enterInformation() {
        su.myClick(su.titleRadio);
        su.mySendKeys(su.firstName, "Suleyman");
        su.mySendKeys(su.lastName, "Hoca");
        su.mySendKeys(su.password, "12345");
        Select dayMenu=new Select(su.daySelect);
        dayMenu.selectByIndex(4);
        Select monthMenu =new Select(su.monthSelect);
        monthMenu.selectByIndex(8);
        Select yearMenu =new Select(su.yearSelect);
        yearMenu.selectByValue("1990");

    }
    @Then("Click register button")
    public void clickRegisterButton() {
        su.myClick(su.registerBtn);
    }

    @Then("User should register successfully")
    public void userShouldRegisterSuccessfully() {
        Assert.assertTrue(su.successCreated.getText().contains("created"));

    }
}
