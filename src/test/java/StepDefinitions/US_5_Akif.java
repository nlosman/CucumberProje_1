package StepDefinitions;

import Pages.Akif;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class US_5_Akif {

    Akif a = new Akif();
    @Then("User must verify how many products there are")
    public void userMustVerifyHowManyProductsThereAre() {

        Assert.assertTrue(a.topProductsMessage.getText().contains("5"));

    }

    @And("user must verify how many items there are at the bottom of the list")
    public void userMustVerifyHowManyItemsThereAreAtTheBottomOfTheList() {

        Assert.assertTrue(a.bottomItemsMessage.getText().contains("5"));
    }

    @And("The user must verify the number of products in the list")
    public void theUserMustVerifyTheNumberOfProductsInTheList() {

        Assert.assertEquals(a.inStockButtons.size(),5);
    }
}
