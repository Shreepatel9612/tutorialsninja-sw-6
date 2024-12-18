package com.tutorialsninja.steps;


import com.tutorialsninja.pages.DesktopsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class DesktopsSteps {

    DesktopsPage desktopsPage = new DesktopsPage();

    @When("I mouse hover on {string} tab and click")
    public void iMouseHoverOnTabAndClick(String tab) {
        desktopsPage.mouseHoverAndClickOnTab(tab);
    }

    @When("I click on {string}")
    public void iClickOn() {
        desktopsPage.clickOnMenu();
    }

    @When("I select sort by position {string}")
    public void iSelectSortByPosition(String sortBy) {
        desktopsPage.selectProductSorting(sortBy);
    }

    @Then("I should see the products arranged in descending order")
    public void iShouldSeeTheProductsArrangedInDescendingOrder() {
        Assert.assertTrue(desktopsPage.isProductsSortedDescending(), "Products are not in descending order");
    }

    @When("I mouse hover on {string} dropdown and click")
    public void iMouseHoverOnDropdownAndClick(String arg0) {
    }

    @When("I select currency {string}")
    public void iSelectCurrency(String currency) {
        desktopsPage.selectCurrency(currency);
    }

    @When("I select product {string}")
    public void iSelectProduct(String productName) {
        desktopsPage.selectProductSorting(productName);
    }

    @Then("I should see the text {string}")
    public void iShouldSeeTheText(String expectedText) {
        Assert.assertEquals("Product name mismatch!", expectedText, desktopsPage.getProductName());
    }

    @When("I enter quantity {string}")
    public void iEnterQuantity(String quantity) {
        desktopsPage.enterQuantity(quantity);
    }

    @When("I click on {string} button")
    public void iClickOnButton(String buttonName) {
        desktopsPage.clickOnButton(buttonName);
    }

    @Then("I should see message {string}")
    public void iShouldSeeTheMessage(String expectedMessage) {
        Assert.assertTrue(desktopsPage.getSuccessMessage().contains(expectedMessage), "Success message is not displayed!");
    }

    @When("I click on the link {string} in the success message")
    public void iClickOnTheLinkInTheSuccessMessage(String linkName) {
        desktopsPage.clickOnLinkInSuccessMessage(linkName);
    }

    @Then("I should see the product name {string}")
    public void iShouldSeeTheProductName(String expectedProductName) {
        Assert.assertEquals("Product name mismatch in cart!", expectedProductName, desktopsPage.getCartProductName());
    }

    @Then("I should see the model {string}")
    public void iShouldSeeTheModel(String expectedModel) {
        Assert.assertEquals("Model mismatch in cart!", expectedModel, desktopsPage.getCartProductModel());
    }

    @Then("I should see the total {string}")
    public void iShouldSeeTheTotal(String expectedPrice) {
        Assert.assertEquals("Price mismatch in cart!", expectedPrice, desktopsPage.getCartProductPrice());
    }
}