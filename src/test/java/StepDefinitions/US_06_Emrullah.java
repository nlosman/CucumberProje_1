package StepDefinitions;

import Pages.Emrullah;
import Pages.Fatmanur;
import Pages.Parent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.font.GlyphLayout;

public class US_06_Emrullah {
    Emrullah elm = new Emrullah();

    @Then("Select a random product and Add to Cart")
    public void selectARandomProductAndAddToCart() {


        int rondom = elm.randomGenerator(elm.pruducts.size());

        if (elm.cartProductTitles.size() > 0)
            for (int i = 0; i < elm.cartProductTitles.size(); i++) {
                do {
                    rondom = elm.randomGenerator(elm.pruducts.size());
                } while (elm.productTitles.get(rondom).getText().equals(elm.cartProductTitles.get(i)));
            }

        Actions aksiyonlar = new Actions(GWD.getDriver());
        Action aksiyon = aksiyonlar.moveToElement(elm.pruducts.get(rondom)).build();
        aksiyon.perform();
        elm.myJsClick(elm.addToCartBtns.get(rondom));
    }

    @And("Continue Shopping")
    public void continueShopping() {
        elm.myClick(elm.toShoppingBtn);
    }

    @Then("Navigate to Cart")
    public void navigateToCart() {
        elm.myClick(elm.goToCart);
    }

    @And("Check the Count of products added to the Cart")
    public void checkTheCountOfProductsAddedToTheCart() {
        Assert.assertTrue(elm.cartList.size() == 3, "There is no three items in Cart!!!!");
    }
}
