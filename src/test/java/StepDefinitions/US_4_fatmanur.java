package StepDefinitions;

import Pages.Fatmanur;
import Pages.Parent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class US_4_fatmanur {
    Parent prn = new Parent();
    Fatmanur ftnr = new Fatmanur();

    @When("Click Dresses button")
    public void clickDressesButton() {
        ftnr.myClick(ftnr.dressesCategorie);
    }

    @Then("Click Summer Dresses button")
    public void clickSummerDressesButton() {
        ftnr.myClick(ftnr.sommerDrsBtn);
    }

    @And("Click on the element in the dress category")
    public void clickOnTheElementInTheDressCategory() {
        ftnr.myClick(ftnr.dressClick);
    }

    @When("Click add to cart button")
    public void clickAddToCartButton() {
        prn.wait.until(ExpectedConditions.urlToBe("https://cleverppc.com/prestashop4/index.php?id_product=6&controller=product&id_lang=1"));
        ftnr.myClick(ftnr.addBtn);

    }
    @And("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        prn.verifyContainsText(ftnr.successMsg, "successfully");

    }
}
